package cz.ProjectTriad.Stargate.Resources.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import cz.ProjectTriad.Stargate.Resources.PTSGR;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class PTI {
	
	public static String modid = PTSGR.MODID;
	
	//StarGate Disc
	public static Item record_SG1;
	public static Item record_SG2;
	public static Item record_SG3;
	public static Item record_SG4;
	public static Item record_SG5;
	public static Item record_SG6;
	public static Item record_SG7;
	public static Item record_SG8;
	public static Item record_SG9;
	public static Item record_SG10;
	public static Item record_SG11;
	public static Item record_SG12;
	public static Item record_SG13;
	public static Item record_SG14;
	public static Item record_SG15;
	public static Item record_SGM1;
	public static Item record_SGM2;
	public static Item record_SGA1;
	
	public static final void initRecords()
	{
		record_SG1 = new MusicDisc("opening").setUnlocalizedName("opening").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG1, "opening");

		record_SG2 = new MusicDisc("return_to_active_duty").setUnlocalizedName("return_to_active_duty").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG2, "return_to_active_duty");

		record_SG3 = new MusicDisc("apophis").setUnlocalizedName("apophis").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG3, "apophis");

		record_SG4 = new MusicDisc("battle").setUnlocalizedName("battle").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG4, "battle");

		record_SG5 = new MusicDisc("egyptology").setUnlocalizedName("egyptology").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG5, "egyptology");

		record_SG6 = new MusicDisc("bomb").setUnlocalizedName("bomb").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG6, "bomb");

		record_SG7 = new MusicDisc("entering_the_stargate").setUnlocalizedName("entering_the_stargate").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG7, "entering_the_stargate");

		record_SG8 = new MusicDisc("jacks_story").setUnlocalizedName("jacks_story").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG8, "jacks_story");

		record_SG9 = new MusicDisc("chosen_for_life_or_death").setUnlocalizedName("chosen_for_life_or_death").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG9, "chosen_for_life_or_death");

		record_SG10 = new MusicDisc("chosing_a_queen").setUnlocalizedName("chosing_a_queen").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG10, "chosing_a_queen");

		record_SG11 = new MusicDisc("final_battle").setUnlocalizedName("final_battle").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG11, "final_battle");

		record_SG12 = new MusicDisc("end_theme").setUnlocalizedName("end_theme").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG12, "end_theme");

		record_SG13 = new MusicDisc("replicator").setUnlocalizedName("replicator").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG13, "replicator");

		record_SG14 = new MusicDisc("the_ori").setUnlocalizedName("the_ori").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG14, "the_ori");

		record_SG15 = new MusicDisc("ori_fleet").setUnlocalizedName("ori_fleet").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SG15, "ori_fleet");

		record_SGM1 = new MusicDisc("original").setUnlocalizedName("original").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SGM1, "original");

		record_SGM2 = new MusicDisc("ark_of_truth").setUnlocalizedName("ark_of_truth").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SGM2, "ark_of_truth");

		record_SGA1 = new MusicDisc("atlantis").setUnlocalizedName("atlantis").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(record_SGA1, "atlantis");


	}

}

