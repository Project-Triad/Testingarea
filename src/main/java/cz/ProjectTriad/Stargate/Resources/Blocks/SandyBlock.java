package cz.ProjectTriad.Stargate.Resources.Blocks;

import cz.ProjectTriad.Stargate.Resources.PTSGR;
import cz.ProjectTriad.Stargate.Resources.Tabs.PTSGRtab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SandyBlock extends Block {
	
	public static String MODID = PTSGR.MODID;
	

public SandyBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setCreativeTab(PTSGRtab.tabPTSGBlocks);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel("shovel", 1);
    }

public SandyBlock(String unlocalizedName, float hardness, float resistance) {
    this(unlocalizedName, Material.sand, hardness, resistance);
}
public SandyBlock(String unlocalizedName) {
    this(unlocalizedName, 1.0f, 3.0f);
}
}