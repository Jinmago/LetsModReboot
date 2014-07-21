package com.jinmago.letsmodreboot.item

import java.util

import com.jinmago.letsmodreboot.CreativeTab.CreativeTabLMRB
import cpw.mods.fml.relauncher.{Side, SideOnly}
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.entity.{EntityLivingBase, Entity}
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.util.IIcon

class ItemWand extends ItemLMRB with MultipleIcons{
  setUnlocalizedName("wand")
  setCreativeTab(CreativeTabLMRB.LMRB_TAB)
  setMaxStackSize(1)

  override def addIcons(): List[String] = List("_charged")

  override def onLeftClickEntity(stack: ItemStack, player: EntityPlayer, entity: Entity): Boolean = {
    if(!entity.worldObj.isRemote)
      if(!isCharged(stack)) {
        entity.motionY = 1
        stack.setItemDamage(stack.getItemDamage + 1)
      }
      else{
        entity.motionY = 2
        stack.setItemDamage(0)
      }



    return true
  }

  @SideOnly(Side.CLIENT)
  override def getIconFromDamage(damage : Int): IIcon = isCharged(damage) match{
    case true => "_charged"
    case false => ""
  }

  override def addInformation(stack : ItemStack, player : EntityPlayer, info : util.List[_], extra : Boolean): Unit = {
    val list = info.asInstanceOf[util.List[String]]
    list.add(s"Used ${stack.getItemDamage} times")
    if(isCharged(stack))
      list.add("charged")

  }


  var chargedIcon : IIcon = null

  def isCharged(stack : ItemStack) : Boolean = isCharged(stack.getItemDamage)
  def isCharged(damage : Int) = damage >= 10


}
