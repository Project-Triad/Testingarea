package cz.ProjectTriad.Stargate.Resources.Proxy;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy 
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
		
	}
	@EventHandler
	public void Init(FMLInitializationEvent e) 
	{
		super.Init(e);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) 
	{
		super.postInit(e);
	}
}
