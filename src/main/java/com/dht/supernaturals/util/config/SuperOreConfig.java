package com.dht.supernaturals.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class SuperOreConfig
{
    public static ForgeConfigSpec.IntValue Super_Chance;
    public static ForgeConfigSpec.BooleanValue Overworld_Generation;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Supernaturals Ore Config");

        Super_Chance = server
                .comment("Maximum number of ore veins of the Rude Ore that can spawn in one chunk.")
                .defineInRange("oregen.Super_Chance", 20, 1, 1000000);

        Overworld_Generation = server
                .comment("Decide if you want Rude Ores to spawn in the overworld")
                .define("oregen.Overworld_Generation", true);
    }
}
