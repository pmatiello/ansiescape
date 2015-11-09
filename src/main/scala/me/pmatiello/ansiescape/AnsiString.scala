package me.pmatiello.ansiescape

case class AnsiString(text: String, on: String, off: String) {
  import AnsiString._
  override def toString = s"$CSI$on$text$CSI$off"
}

object AnsiString {
  private val CSI = "\u001B["
}
