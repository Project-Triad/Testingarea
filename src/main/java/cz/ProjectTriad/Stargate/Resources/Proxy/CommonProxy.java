package cz.ProjectTriad.Stargate.Resources.Proxy;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cz.ProjectTriad.Stargate.Resources.Items.PTI;

public class CommonProxy 
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) 
	{
	 PTI.initRecords();
	}
	@EventHandler
	public void Init(FMLInitializationEvent e) 
	{
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) 
	{
		
	}
}
