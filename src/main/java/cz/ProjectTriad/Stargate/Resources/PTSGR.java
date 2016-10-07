package cz.ProjectTriad.Stargate.Resources;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cz.ProjectTriad.Stargate.Resources.Proxy.CommonProxy;

@Mod(modid=PTSGR.MODID,name=PTSGR.NAME,version=PTSGR.VERSION)
public class PTSGR {
	
	public static final String MODID = "ptsgr";
	public static final String NAME = "ProjectTriad - Stargate Resources";
	public static final String VERSION = "0.0.1";
	public static final String DEPEND = "ptsgc";

	@SidedProxy
		(clientSide="cz.ProjectTriad.Stargate.Resources.Proxy.ClientProxy", serverSide="cz.ProjectTriad.Stargate.Resources.Proxy.ServerProxy")
		public static CommonProxy proxy;
		
		@Instance
		public static PTSGR instance;
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent e) 
		{
			proxy.preInit(e);
		}
		@EventHandler
		public void Init(FMLInitializationEvent e) 
		{
			proxy.Init(e);
		}
		@EventHandler
		public void postInit(FMLPostInitializationEvent e) 
		{
			proxy.postInit(e);
		}
	
	}

