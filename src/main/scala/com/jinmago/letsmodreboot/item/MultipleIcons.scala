package com.jinmago.letsmodreboot.item

import cpw.mods.fml.relauncher.{Side, SideOnly}
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.util.IIcon

trait MultipleIcons extends ItemLMRB{

  private val icons = collection.mutable.HashMap[String,IIcon]()

  def addIcons() : List[String]

  def setDefaultIcon(iconModifier : String = "") = {
    setItemIcon(icons.get(iconModifier).get)
  }

  implicit def getIcon(iconModifier : String = "") = icons.get(iconModifier).get

  @SideOnly(Side.CLIENT)
  override def registerIcons(iconRegister : IIconRegister) = {
    for (iconModifier <- "" :: addIcons) {
      val icon = iconRegister.registerIcon(getIconName(iconModifier))
      icons.put(iconModifier,icon)
    }
    setDefaultIcon("")
  }
}
