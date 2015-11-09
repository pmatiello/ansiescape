// Visual test for ansiescape
// Run from Activator console:
// :load src/test/visual-test.scala

import me.pmatiello.ansiescape.ANSI._

println("Visual Test")
println()

println(black("black"))
println(red("red"))
println(green("green"))
println(yellow("yellow"))
println(blue("blue"))
println(purple("purple"))
println(cyan("cyan"))
println(white("white"))
println()

println(bold(black("bold-black")))
println(bold(red("bold-red")))
println(bold(green("bold-green")))
println(bold(yellow("bold-yellow")))
println(bold(blue("bold-blue")))
println(bold(purple("bold-purple")))
println(bold(cyan("bold-cyan")))
println(bold(white("bold-white")))
