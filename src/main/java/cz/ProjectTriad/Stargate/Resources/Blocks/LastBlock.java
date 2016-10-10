package cz.ProjectTriad.Stargate.Resources.Blocks;

import cz.ProjectTriad.Stargate.Resources.PTSGR;
import cz.ProjectTriad.Stargate.Resources.Tabs.PTSGRtab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LastBlock extends Block {
	
	public static String MODID = PTSGR.MODID;
	

public LastBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setCreativeTab(PTSGRtab.tabPTSGBlocks);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setBlockUnbreakable();

    }

public LastBlock(String unlocalizedName, float hardness, float resistance) {
    this(unlocalizedName, Material.rock, hardness, resistance);
}
public LastBlock(String unlocalizedName) {
    this(unlocalizedName, 1000.0f, 1000.0f);
}
}