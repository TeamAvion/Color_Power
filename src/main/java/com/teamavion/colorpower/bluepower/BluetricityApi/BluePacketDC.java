package com.teamavion.colorpower.bluepower.BluetricityApi;

public class BluePacketDC {

    public static final int[] voltage = {10,100,1000};

    private boolean incorrectvoltage;
    private int amph;
    private int voltageLvL;
    private int blocksTravled;

    public BluePacketDC(int amph, int voltageLvL){
        this.amph = amph;
        if(voltageLvL < 3 && voltageLvL > -1)
            this.voltageLvL = voltageLvL;
        else {
            incorrectvoltage = true;
            System.out.println("[WARRNING] INCORECT VOLTAGE SETTING, REPORT TO MOD AUTHOR");
        }
        blocksTravled = 0;
    }
    public BluePacketDC main(int voltage) {
        if (voltage > this.voltage[voltageLvL]) {
            incorrectvoltage = true;
            return this;
        }
        if (blocksTravled < 6) {
            blocksTravled++;
            return this;
        }
        amph = (amph - (int)((amph * blocksTravled)/((double) this.voltage[voltageLvL])));
        blocksTravled++;
        return this;
    }

    public void setVoltageLvL(int voltageLvL) {
        if(voltageLvL < 3 && voltageLvL > -1)
            this.voltageLvL = voltageLvL;
        else {
            incorrectvoltage = true;
            System.out.println("[WARRNING] INCORECT VOLTAGE SETTING, REPORT TO MOD AUTHOR");
        }
    }

    public int getVoltageLvL() {
        return voltageLvL;
    }

    public boolean isIncorrectvoltage() {
        return incorrectvoltage;
    }

    public int getAmph() {
        return amph;
    }
}
