package com.jinmago.letsmodreboot

import com.jinmago.letsmodreboot.configuration.ConfigurationHandler
import com.jinmago.letsmodreboot.init.{ModBlocks, ModItems}
import com.jinmago.letsmodreboot.proxy.TProxy
import com.jinmago.letsmodreboot.reference.Reference
import com.jinmago.letsmodreboot.utility.LogHelper
import cpw.mods.fml.common.{FMLCommonHandler, SidedProxy, Mod}
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLInitializationEvent, FMLPreInitializationEvent}


@Mod(
  modid= Reference.MOD_ID,
  name= Reference.MOD_NAME,
  version= Reference.MOD_VERSION,
  modLanguage = "scala",
  guiFactory = Reference.GUI_FACTORY_CLASS
)
object LetsModReboot {

  @SidedProxy(
    clientSide = Reference.CLIENT_PROXY_CLASS,
    serverSide = Reference.SERVER_PROXY_CLASS
  )
  var proxy : TProxy = null

  @EventHandler
  def preInit(event: FMLPreInitializationEvent) = {
    ConfigurationHandler.init(event.getSuggestedConfigurationFile)
    FMLCommonHandler.instance().bus().register(ConfigurationHandler)

    ModItems.init()
    ModBlocks.init();



    LogHelper.info("Pre Initialization Complete")
  }

  @EventHandler
  def init(event: FMLInitializationEvent) = {
    LogHelper.info("Initialization Complete")
  }

  @EventHandler
  def postInit(event: FMLPostInitializationEvent) = {
    LogHelper.info("Post Initialization Complete")
  }


}