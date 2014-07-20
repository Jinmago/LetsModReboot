package com.jinmago.letsmodreboot.init

import com.jinmago.letsmodreboot.item.ItemMapleLeaf
import com.jinmago.letsmodreboot.reference.Reference
import cpw.mods.fml.common.registry.GameRegistry

@GameRegistry.ObjectHolder(Reference.MOD_ID)
object ModItems {
  val mapleLeaf = new ItemMapleLeaf

  def init() = {
    GameRegistry.registerItem(mapleLeaf, "mapleLeaf")
  }
}
