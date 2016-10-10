package cz.ProjectTriad.Stargate.Resources.Blocks;

import cz.ProjectTriad.Stargate.Resources.PTSGR;
import cz.ProjectTriad.Stargate.Resources.Tabs.PTSGRtab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MetaMorphBlock extends Block {
	
	public static String MODID = PTSGR.MODID;
	

public MetaMorphBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setCreativeTab(PTSGRtab.tabPTSGBlocks);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel("pickaxe", 3);
    }

public MetaMorphBlock(String unlocalizedName, float hardness, float resistance) {
    this(unlocalizedName, Material.rock, hardness, resistance);
}
public MetaMorphBlock(String unlocalizedName) {
    this(unlocalizedName, 27.0f, 90.0f);
}
}