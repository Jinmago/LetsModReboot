package com.jinmago.letsmodreboot.init

import com.jinmago.letsmodreboot.block.BlockFlag
import com.jinmago.letsmodreboot.reference.Reference
import cpw.mods.fml.common.registry.GameRegistry

@GameRegistry.ObjectHolder(Reference.MOD_ID)
object ModBlocks {
  val flag = new BlockFlag

  def init() = {
    GameRegistry.registerBlock(flag, "flag")
  }
}
