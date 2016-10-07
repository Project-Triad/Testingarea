package cz.ProjectTriad.Stargate.Resources.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cz.ProjectTriad.Stargate.Resources.PTSGR;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.BlockJukebox;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class MusicDisc extends ItemRecord
{
	 private static final Map records = new HashMap();
	 public final String recordName;
	 public static String MODID = PTSGR.MODID;
	 
	 public MusicDisc(String recordName)
	 {
	 super(recordName);
	 this.recordName = recordName;
	 this.maxStackSize = 1;
	 records.put(recordName, this);
	 }

	 @Override
	 public void registerIcons(IIconRegister iconRegister)
	 {
	 itemIcon = iconRegister.registerIcon(MODID + ":" + "Record_SG");
	 }

	 @Override
	 public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	 {
	 if (world.getBlock(x, y, z) == Blocks.jukebox && world.getBlockMetadata(x, y, z) == 0)
	 {
	 if (world.isRemote)
	 return true;
	 else
	 {
	 ((BlockJukebox)Blocks.jukebox).func_149926_b(world, x, y, z, itemStack);
	 world.playAuxSFXAtEntity((EntityPlayer)null, 1005, x, y, z, Item.getIdFromItem(this));
	 --itemStack.stackSize;
	 return true;
	 }
	 } 
	 else
	 return false;
	 }

	 @Override
	 public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	 {
	 par3List.add(this.getRecordNameLocal());
	 }

	 @Override
	 //TODO: getRecordTitle()
	 public String getRecordNameLocal()
	 {
	 return StatCollector.translateToLocal(this.getUnlocalizedName() + ".desc");
	 }
	 
	 @Override
	 public EnumRarity getRarity(ItemStack itemStack)
	 {
	 return EnumRarity.epic;
	 }


	 public static MusicDisc getRecord(String recordName)
	 {
	 return (MusicDisc)records.get(recordName);
	 }


	 @Override
	 public ResourceLocation getRecordResource(String name)
	 {
	 return new ResourceLocation(MODID + ":" + name);
	 }
	}