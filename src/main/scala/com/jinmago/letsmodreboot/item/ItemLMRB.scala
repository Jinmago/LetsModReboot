package com.jinmago.letsmodreboot.item

import com.jinmago.letsmodreboot.reference.Reference
import cpw.mods.fml.relauncher.{SideOnly, Side}
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.item.{ItemStack, Item}
import net.minecraft.util.IIcon

class ItemLMRB extends Item{

  def unWrap(name : String) = name.dropWhile(_ != '.').tail

  def getIconName(modifier : String = "") = unWrap(getUnlocalizedName) + modifier

  override def getUnlocalizedName() = "item.%s:%s" format (Reference.MOD_ID.toLowerCase, unWrap(super.getUnlocalizedName))

  override def getUnlocalizedName(itemStack : ItemStack) = getUnlocalizedName()

  def setItemIcon(icon: IIcon) = itemIcon = icon

  @SideOnly(Side.CLIENT)
  override def registerIcons(iconRegister : IIconRegister) = {
    itemIcon = iconRegister.registerIcon(getIconName())
  }



}
