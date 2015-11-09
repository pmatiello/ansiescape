package me.pmatiello.ansiescape

import org.scalatest.{FunSpec, Matchers}
import ANSI._

class ANSITest extends FunSpec with Matchers {
  describe("Colors") {
    it(".black") {
      black("text").toString should === ("\u001B[30mtext\u001B[39m")
    }
    it(".red") {
      red("text").toString should === ("\u001B[31mtext\u001B[39m")
    }
    it(".green") {
      green("text").toString should === ("\u001B[32mtext\u001B[39m")
    }
    it(".yellow") {
      yellow("text").toString should === ("\u001B[33mtext\u001B[39m")
    }
    it(".blue") {
      blue("text").toString should === ("\u001B[34mtext\u001B[39m")
    }
    it(".purple") {
      purple("text").toString should === ("\u001B[35mtext\u001B[39m")
    }
    it(".cyan") {
      cyan("text").toString should === ("\u001B[36mtext\u001B[39m")
    }
    it(".white") {
      white("text").toString should === ("\u001B[37mtext\u001B[39m")
    }
  }

  describe("Intensity") {
    it(".bold") {
      bold("text").toString should === ("\u001B[1mtext\u001B[22m")
      bold(red("text")).toString should === ("\u001B[1m\u001B[31mtext\u001B[39m\u001B[22m")
    }
  }
}
