package com.jinmago.letsmodreboot.CreativeTab

import com.jinmago.letsmodreboot.init.ModItems
import com.jinmago.letsmodreboot.reference.Reference
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

object CreativeTabLMRB{

  val LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
    override def getTabIconItem: Item = ModItems.mapleLeaf
  }

}
