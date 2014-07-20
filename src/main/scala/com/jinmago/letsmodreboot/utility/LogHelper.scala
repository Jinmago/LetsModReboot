package com.jinmago.letsmodreboot.utility

import com.jinmago.letsmodreboot.reference.Reference
import cpw.mods.fml.common.FMLLog
import org.apache.logging.log4j.Level

object LogHelper {
  def log(logLevel: Level, ob : AnyRef) {
    FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(ob))
  }

  def all(ob: AnyRef) = {
    log(Level.ALL, ob)
  }

  def debug(ob: AnyRef) {
    log(Level.DEBUG, ob)
  }

  def error(ob: AnyRef) {
    log(Level.ERROR, ob)
  }

  def fatal(ob: AnyRef) {
    log(Level.FATAL, ob)
  }

  def info(ob: AnyRef) {
    log(Level.INFO, ob)
  }

  def off(ob: AnyRef) {
    log(Level.OFF, ob)
  }

  def trace(ob: AnyRef) {
    log(Level.TRACE, ob)
  }

  def warn(ob: AnyRef) {
    log(Level.WARN, ob)
  }
}
