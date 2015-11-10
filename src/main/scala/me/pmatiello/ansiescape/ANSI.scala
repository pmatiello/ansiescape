package me.pmatiello.ansiescape

import scala.language.implicitConversions

object ANSI extends {
  implicit def ansiString2String(ansiString: AnsiString): String = ansiString.toString

  def black(text: String) = AnsiString(text, "30m", "39m")
  def red(text: String) = AnsiString(text, "31m", "39m")
  def green(text: String) = AnsiString(text, "32m", "39m")
  def yellow(text: String) = AnsiString(text, "33m", "39m")
  def blue(text: String) = AnsiString(text, "34m", "39m")
  def purple(text: String) = AnsiString(text, "35m", "39m")
  def cyan(text: String) = AnsiString(text, "36m", "39m")
  def white(text: String) = AnsiString(text, "37m", "39m")

  def bold(text: String) = AnsiString(text, "1m", "22m")
  def underline(text: String) = AnsiString(text, "4m", "24m")
  def blink(text: String) = AnsiString(text, "5m", "25m")
}
