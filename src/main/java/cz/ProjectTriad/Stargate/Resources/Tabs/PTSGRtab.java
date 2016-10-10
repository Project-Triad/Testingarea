package cz.ProjectTriad.Stargate.Resources.Tabs;

import cz.ProjectTriad.Stargate.Resources.Blocks.PTB;
import cz.ProjectTriad.Stargate.Resources.Items.PTI;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PTSGRtab  {

	public static  CreativeTabs tabPTSGRecords = new CreativeTabs("tabPTSGRecords"){
	    @Override 
	    public Item getTabIconItem() {
	        return PTI.record_SG1;
	    }};
	    
	    public static CreativeTabs tabPTSGBlocks = new CreativeTabs ("tabPTSGBlocks"){

			@Override
			public Item getTabIconItem() {
			return new ItemStack(PTB.Conglomerate).getItem(); 
			}
			
	};
}
