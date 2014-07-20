package com.jinmago.letsmodreboot.configuration

import java.io.File

import com.jinmago.letsmodreboot.reference.Reference
import cpw.mods.fml.client.event.ConfigChangedEvent
import cpw.mods.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.common.config.Configuration


object ConfigurationHandler {

  var configuration : Configuration = null
  var testValue = false

  def init (configFile : File){
    if(configuration == null) {
      configuration = new Configuration(configFile)
      loadConfiguration()
    }

  }

  @SubscribeEvent
  def onConfigurationChangedEvent(event : ConfigChangedEvent.OnConfigChangedEvent) = {
    if(event.modID equalsIgnoreCase Reference.MOD_ID){
      loadConfiguration()

    }
  }

  def loadConfiguration() = {
    testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value")
    if(configuration.hasChanged)
      configuration.save()
  }
}
