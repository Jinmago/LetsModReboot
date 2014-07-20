package com.jinmago.letsmodreboot.block

import com.jinmago.letsmodreboot.reference.Reference
import cpw.mods.fml.relauncher.{Side, SideOnly}
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.item.ItemStack

class BlockLMRB(material : Material = Material.rock) extends Block(material){
  def unWrap(name : String) = name.dropWhile(_ != '.').tail

  override def getUnlocalizedName() = "tile.%s:%s" format (Reference.MOD_ID.toLowerCase, unWrap(super.getUnlocalizedName))

  @SideOnly(Side.CLIENT)
  override def registerBlockIcons(iconRegister : IIconRegister) = {
    blockIcon = iconRegister.registerIcon(unWrap(getUnlocalizedName()))
  }

}
