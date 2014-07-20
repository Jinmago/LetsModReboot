package com.jinmago.letsmodreboot.client.gui

import java.util

import cpw.mods.fml.client.IModGuiFactory
import cpw.mods.fml.client.IModGuiFactory.{RuntimeOptionCategoryElement, RuntimeOptionGuiHandler}
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen

class GuiFactory extends IModGuiFactory{
 override def initialize(minecraftInstance: Minecraft): Unit = ()

 override def runtimeGuiCategories(): util.Set[RuntimeOptionCategoryElement] = null

 override def getHandlerFor(element: RuntimeOptionCategoryElement): RuntimeOptionGuiHandler = null

 override def mainConfigGuiClass(): Class[_ <: GuiScreen] = classOf[ModGuiConfig]
}
