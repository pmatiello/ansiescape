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

  describe("Modifiers") {
    it(".bold") {
      bold("text").toString should === ("\u001B[1mtext\u001B[22m")
    }

    it(".underline") {
      underline("text").toString should === ("\u001B[4mtext\u001B[24m")
    }

    it(".blink") {
      blink("text").toString should === ("\u001B[5mtext\u001B[25m")
    }

    it("composes modifiers") {
      bold(underline(blink(red("text")))).toString should === (
        "\u001B[1m\u001B[4m\u001B[5m\u001B[31mtext\u001B[39m\u001B[25m\u001B[24m\u001B[22m")
    }
  }
}
