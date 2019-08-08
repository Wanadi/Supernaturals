package com.dht.supernaturals.util.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

@Mod.EventBusSubscriber
public class Config
{
    private static final Logger LOGGER = LogManager.getLogger("supernaturals");
    private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SERVER;

    private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CLIENT;

    static
    {
        SuperOreConfig.init(SERVER_BUILDER, CLIENT_BUILDER);

        SERVER = SERVER_BUILDER.build();
        CLIENT = CLIENT_BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path)
    {
        LOGGER.info("Loading config: " + path);
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        LOGGER.info("Built config: " + path);
        file.load();
        LOGGER.info("Loaded config: " + path);
        config.setConfig(file);
    }
}