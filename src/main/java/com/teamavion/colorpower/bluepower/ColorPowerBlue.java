package com.teamavion.colorpower.bluepower;

import com.teamavion.colorpower.Ref;
import com.teamavion.colorpower.bluepower.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tjken on 11/9/2016.
 */

@Mod(modid = Ref.MODID + "blue", version = Ref.VERSION)

public class ColorPowerBlue {

    @Mod.Instance(value = Ref.MODID + "blue")
    public static ColorPowerBlue instance;

    @SidedProxy(clientSide = "com.teamavion.colorpower.bluepower.proxy.ClientProxy", serverSide = "com.teamavion.colorpower.bluepower.proxy.ServerProxy")
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
