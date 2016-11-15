package com.teamavion.colorpower.yellowpower;

import com.teamavion.colorpower.Ref;
import com.teamavion.colorpower.yellowpower.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tjken on 11/9/2016.
 */

@Mod(modid = Ref.MODID + "yellow", version = Ref.VERSION)

public class ColorPowerYellow {

    @Mod.Instance(value = Ref.MODID + "yellow")
    public static ColorPowerYellow instance;

    @SidedProxy(clientSide = "com.teamavion.colorpower.yellowpower.proxy.ClientProxy", serverSide = "com.teamavion.colorpower.yellowpower.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

}
