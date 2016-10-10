package cz.ProjectTriad.Stargate.Resources.Blocks;

import cz.ProjectTriad.Stargate.Resources.PTSGR;
import cz.ProjectTriad.Stargate.Resources.Tabs.PTSGRtab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class VulcanicBlock extends Block{
	public static String MODID = PTSGR.MODID;
	

	public VulcanicBlock(String unlocalizedName, Material material, float hardness, float resistance) {
	        super(material);
	        this.setCreativeTab(PTSGRtab.tabPTSGBlocks);
	        this.setHardness(hardness);
	        this.setResistance(resistance);
	        this.setHarvestLevel("pickaxe", 2);
	    }

	public VulcanicBlock(String unlocalizedName, float hardness, float resistance) {
	    this(unlocalizedName, Material.rock, hardness, resistance);
	}
	public VulcanicBlock(String unlocalizedName) {
	    this(unlocalizedName, 9.0f, 30.0f);
	}
}


