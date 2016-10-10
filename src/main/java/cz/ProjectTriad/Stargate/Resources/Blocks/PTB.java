package cz.ProjectTriad.Stargate.Resources.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cz.ProjectTriad.Stargate.Resources.PTSGR;
import net.minecraft.block.Block;

public final class PTB {
	public static String MODID = PTSGR.MODID;

	//Sedimetary Blocks 
	public static Block Conglomerate; //Slepenec
	public static Block Sandstone; //pískovec
	public static Block Siltstone;//prachovec
	public static Block Claystone;//jílovec
	public static Block Dolomite;//dolomity
	public static Block Phosphate;//fosfáty
	public static Block Siliceous_rocks;//silicity
	public static Block Slate;//bøidlice
	public static Block Travertine;//Travertin
	public static Block Tephra;//tefra
	public static Block Tuffs;//tufy
	public static Block Ignimbrites;//ignimbrit
	public static Block Alabaster;//Alabastr
	public static Block Limestone;//vápenec
	
	//Vulcanic Blocks
	public static Block Gabbro;//gabbro
	public static Block Granite;//granite
	public static Block Diorite;//diorite
	public static Block Diabase;//diabase
	public static Block Dolerite;//dolerite
	public static Block Basalt;//basalt
	public static Block Igneous_rock;//igneous rocks
	public static Block Pyroxenite;//pyroxenite
	public static Block Aplite;//aplite
	public static Block Pegmatite;//pegmatite
	public static Block Mineta;//Mineta
	public static Block Rhyolite;//rhyolite
	public static Block Trachyt;//Trachyt
	public static Block Phonolite;//Phonolite
	public static Block Andesite;//andesite
	public static Block Pumice;//pumice

	//MetaMorpfic Block
	public static Block Gneiss;//gneiss
	public static Block Phyllite;//phyllite
	public static Block Marble;//marble
	public static Block Fulgurite;//Fulgurite
	public static Block Schyst;//schyst
	public static Block Paragneiss;//paragneiss
	public static Block Orthogneiss;//orthogneiss
	public static Block Migmatite;//migmatite
	public static Block Graphite;//graphite bearings
	
	//Soil Block
	public static Block Dirt_dark;
	public static Block Dirt_brown;
	public static Block Dirt_gray;
	public static Block Sand;
	public static Block Dry_land;
	public static Block Red_sand;
	public static Block Scrubland;
	public static Block Dust;
	public static Block Dust_gray;
	
	//Misc Block
	public static Block Hardrock;
	
	public static final void initBlocksSediments()
	{
		Conglomerate = new SedimentaryBlock("Conglomerate").setBlockName("Conglomerate").setBlockTextureName(MODID + ":Conglomerate");
		GameRegistry.registerBlock(Conglomerate, "Conglomerate");
		Sandstone = new SedimentaryBlock("Sandstone").setBlockName("Sandstone").setBlockTextureName(MODID + ":Sandstone");
		GameRegistry.registerBlock(Sandstone, "Sandstone");
		Siltstone = new SedimentaryBlock("Siltstone").setBlockName("Siltstone").setBlockTextureName(MODID + ":Siltstone");
		GameRegistry.registerBlock(Siltstone, "Siltstone");
		Claystone = new SedimentaryBlock("Claystone").setBlockName("Claystone").setBlockTextureName(MODID + ":Claystone");
		GameRegistry.registerBlock(Claystone, "Claystone");
		Dolomite = new SedimentaryBlock("Dolomite").setBlockName("Dolomite").setBlockTextureName(MODID + ":Dolomite");
		GameRegistry.registerBlock(Dolomite, "Dolomite");
		Phosphate = new SedimentaryBlock("Phosphate").setBlockName("Phosphate").setBlockTextureName(MODID + ":Phosphate");
		GameRegistry.registerBlock(Phosphate, "Phosphate");
		Siliceous_rocks = new SedimentaryBlock("Siliceous_rocks").setBlockName("Siliceous_rocks").setBlockTextureName(MODID + ":Siliceous_rocks");
		GameRegistry.registerBlock(Siliceous_rocks, "Siliceous_rocks");
		Slate = new SedimentaryBlock("Slate").setBlockName("Slate").setBlockTextureName(MODID + ":Slate");
		GameRegistry.registerBlock(Slate, "Slate");
		Travertine = new SedimentaryBlock("Travertine").setBlockName("Travertine").setBlockTextureName(MODID + ":Travertine");
		GameRegistry.registerBlock(Travertine, "Travertine");
		Tephra = new SedimentaryBlock("Tephra").setBlockName("Tephra").setBlockTextureName(MODID + ":Tephra");
		GameRegistry.registerBlock(Tephra, "Tephra");
		Tuffs = new SedimentaryBlock("Tuffs").setBlockName("Tuffs").setBlockTextureName(MODID + ":Tuffs");
		GameRegistry.registerBlock(Tuffs, "Tuffs");
		Ignimbrites = new SedimentaryBlock("Ignimbrites").setBlockName("Ignimbrites").setBlockTextureName(MODID + ":Ignimbrites");
		GameRegistry.registerBlock(Ignimbrites, "Ignimbrites");
		Alabaster = new SedimentaryBlock("Alabaster").setBlockName("Alabaster").setBlockTextureName(MODID + ":Alabaster");
		GameRegistry.registerBlock(Alabaster, "Alabaster");
		Limestone = new SedimentaryBlock("Limestone").setBlockName("Limestone").setBlockTextureName(MODID + ":Limestone");
		GameRegistry.registerBlock(Limestone, "Limestone");
	}
	
	public static final void initBLocksVulcanic()
	{
		Gabbro = new VulcanicBlock("Gabbro").setBlockName("Gabbro").setBlockTextureName(MODID + ":Gabbro");
		GameRegistry.registerBlock(Gabbro, "Gabbro");
		Granite = new VulcanicBlock("Granite").setBlockName("Granite").setBlockTextureName(MODID + ":Granite");
		GameRegistry.registerBlock(Granite, "Granite");
		Diorite = new VulcanicBlock("Diorite").setBlockName("Diorite").setBlockTextureName(MODID + ":Diorite");
		GameRegistry.registerBlock(Diorite, "Diorite");
		Diabase = new VulcanicBlock("Diabase").setBlockName("Diabase").setBlockTextureName(MODID + ":Diabase");
		GameRegistry.registerBlock(Diabase, "Diabase");
		Dolerite = new VulcanicBlock("Dolerite").setBlockName("Dolerite").setBlockTextureName(MODID + ":Dolerite");
		GameRegistry.registerBlock(Dolerite, "Dolerite");
		Basalt = new VulcanicBlock("Basalt").setBlockName("Basalt").setBlockTextureName(MODID + ":Basalt");
		GameRegistry.registerBlock(Basalt, "Basalt");
		Igneous_rock = new VulcanicBlock("Igneous_rock").setBlockName("Igneous_rock").setBlockTextureName(MODID + ":Igneous_rock");
		GameRegistry.registerBlock(Igneous_rock, "Igneous_rock");
		Pyroxenite = new VulcanicBlock("Pyroxenite").setBlockName("Pyroxenite").setBlockTextureName(MODID + ":Pyroxenite");
		GameRegistry.registerBlock(Pyroxenite, "Pyroxenite");
		Aplite = new VulcanicBlock("Aplite").setBlockName("Aplite").setBlockTextureName(MODID + ":Aplite");
		GameRegistry.registerBlock(Aplite, "Aplite");
		Pegmatite = new VulcanicBlock("Pegmatite").setBlockName("Pegmatite").setBlockTextureName(MODID + ":Pegmatite");
		GameRegistry.registerBlock(Pegmatite, "Pegmatite");
		Mineta = new VulcanicBlock("Mineta").setBlockName("Mineta").setBlockTextureName(MODID + ":Mineta");
		GameRegistry.registerBlock(Mineta, "Mineta");
		Rhyolite = new VulcanicBlock("Rhyolite").setBlockName("Rhyolite").setBlockTextureName(MODID + ":Rhyolite");
		GameRegistry.registerBlock(Rhyolite, "Rhyolite");
		Trachyt = new VulcanicBlock("Trachyt").setBlockName("Trachyt").setBlockTextureName(MODID + ":Trachyt");
		GameRegistry.registerBlock(Trachyt, "Trachyt");
		Phonolite = new VulcanicBlock("Phonolite").setBlockName("Phonolite").setBlockTextureName(MODID + ":Phonolite");
		GameRegistry.registerBlock(Phonolite, "Phonolite");
		Andesite = new VulcanicBlock("Andesite").setBlockName("Andesite").setBlockTextureName(MODID + ":Andesite");
		GameRegistry.registerBlock(Andesite, "Andesite");
		Pumice = new VulcanicBlock("Pumice").setBlockName("Pumice").setBlockTextureName(MODID + ":Pumice");
		GameRegistry.registerBlock(Pumice, "Pumice");
	}

	public static final void initBlockMetaMorph()
	{
		Gneiss = new MetaMorphBlock("Gneiss").setBlockName("Gneiss").setBlockTextureName(MODID + ":Gneiss");
		GameRegistry.registerBlock(Gneiss, "Gneiss");
		Phyllite = new MetaMorphBlock("Phyllite").setBlockName("Phyllite").setBlockTextureName(MODID + ":Phyllite");
		GameRegistry.registerBlock(Phyllite, "Phyllite");
		Marble = new MetaMorphBlock("Marble").setBlockName("Marble").setBlockTextureName(MODID + ":Marble");
		GameRegistry.registerBlock(Marble, "Marble");
		Fulgurite = new MetaMorphBlock("Fulgurite").setBlockName("Fulgurite").setBlockTextureName(MODID + ":Fulgurite");
		GameRegistry.registerBlock(Fulgurite, "Fulgurite");
		Schyst = new MetaMorphBlock("Schyst").setBlockName("Schyst").setBlockTextureName(MODID + ":Schyst");
		GameRegistry.registerBlock(Schyst, "Schyst");
		Paragneiss = new MetaMorphBlock("Paragneiss").setBlockName("Paragneiss").setBlockTextureName(MODID + ":Paragneiss");
		GameRegistry.registerBlock(Paragneiss, "Paragneiss");
		Orthogneiss = new MetaMorphBlock("Orthogneiss").setBlockName("Orthogneiss").setBlockTextureName(MODID + ":Orthogneiss");
		GameRegistry.registerBlock(Orthogneiss, "Orthogneiss");
		Migmatite = new MetaMorphBlock("Migmatite").setBlockName("Migmatite").setBlockTextureName(MODID + ":Migmatite");
		GameRegistry.registerBlock(Migmatite, "Migmatite");
		Graphite = new MetaMorphBlock("Graphite").setBlockName("Graphite").setBlockTextureName(MODID + ":Graphite");
		GameRegistry.registerBlock(Graphite, "Graphite");
		
	}
	
	public static final void initBlockSoil()
	{
		Dirt_dark = new DirtBlock("Dirt_dark").setBlockName("Dirt_dark").setBlockTextureName(MODID + ":Dirt_dark");
		GameRegistry.registerBlock(Dirt_dark, "Dirt_dark");
		Dirt_brown = new DirtBlock("Dirt_brown").setBlockName("Dirt_brown").setBlockTextureName(MODID + ":Dirt_brown");
		GameRegistry.registerBlock(Dirt_brown, "Dirt_brown");
		Dirt_gray = new DirtBlock("Dirt_gray").setBlockName("Dirt_gray").setBlockTextureName(MODID + ":Dirt_gray");
		GameRegistry.registerBlock(Dirt_gray, "Dirt_gray");
		Sand = new SandyBlock("Sand").setBlockName("Sand").setBlockTextureName(MODID + ":Sand");
		GameRegistry.registerBlock(Sand, "Sand");
		Dry_land = new DustBlock("Dry_land").setBlockName("Dry_land").setBlockTextureName(MODID + ":Dry_land");
		GameRegistry.registerBlock(Dry_land, "Dry_land");
		Red_sand = new SandyBlock("Red_sand").setBlockName("Red_sand").setBlockTextureName(MODID + ":Red_sand");
		GameRegistry.registerBlock(Red_sand, "Red_sand");
		Dust = new DustBlock("Dust").setBlockName("Dust").setBlockTextureName(MODID + ":Dust");
		GameRegistry.registerBlock(Dust, "Dust");
		Dust_gray = new DustBlock("Dust_gray").setBlockName("Dust_gray").setBlockTextureName(MODID + ":Dust_gray");
		GameRegistry.registerBlock(Dust_gray, "Dust_gray");
		
	}

	public static final void initBlockMisc()
	{
		Hardrock = new LastBlock("Hardrock").setBlockName("Hardrock").setLightLevel(1.5F).setBlockTextureName(MODID + ":Hardrock");
		GameRegistry.registerBlock(Hardrock, "Hardrock");
		
	}
}
