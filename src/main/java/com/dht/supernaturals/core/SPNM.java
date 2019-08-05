package com.dht.supernaturals.core;


import com.dht.supernaturals.common.items.SuperItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("supernaturals")
public class SPNM {
    public static final String MOD_ID = "supernaturals";
    public static SPNM instance;


    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public SPNM() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
        SuperItemRegistry.init();

    }

    private void setup(final FMLCommonSetupEvent event)
    {

         }

    private void doClientStuff(final FMLClientSetupEvent event) {

          }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {

        }

    private void processIMC(final InterModProcessEvent event)
    {

         }

}
