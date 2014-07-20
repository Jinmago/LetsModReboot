package com.jinmago.letsmodreboot.client.gui

import com.jinmago.letsmodreboot.configuration.ConfigurationHandler
import com.jinmago.letsmodreboot.reference.Reference
import cpw.mods.fml.client.config.{IConfigElement, GuiConfig}
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.common.config.{ConfigCategory, Configuration, ConfigElement}

class ModGuiConfig(guiScreen : GuiScreen)
  extends GuiConfig(
    guiScreen,
    new ConfigElement[ConfigCategory](ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements,
    Reference.MOD_ID,
    false,
    false,
    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString)
  ){

}

