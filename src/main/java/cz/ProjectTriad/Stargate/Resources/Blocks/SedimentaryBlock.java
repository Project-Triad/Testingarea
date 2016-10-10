package cz.ProjectTriad.Stargate.Resources.Blocks;

import java.util.HashMap;
import java.util.Map;

import cz.ProjectTriad.Stargate.Resources.PTSGR;
import cz.ProjectTriad.Stargate.Resources.Tabs.PTSGRtab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class SedimentaryBlock extends Block {
	
	public static String MODID = PTSGR.MODID;
	

public SedimentaryBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setCreativeTab(PTSGRtab.tabPTSGBlocks);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel("pickaxe", 1);
    }

public SedimentaryBlock(String unlocalizedName, float hardness, float resistance) {
    this(unlocalizedName, Material.rock, hardness, resistance);
}
public SedimentaryBlock(String unlocalizedName) {
    this(unlocalizedName, 3.0f, 10.0f);
}
}