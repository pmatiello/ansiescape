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

println(blackBackground("black-background"))
println(redBackground("red-background"))
println(greenBackground("green-background"))
println(yellowBackground("yellow-background"))
println(blueBackground("blue-background"))
println(purpleBackground("purple-background"))
println(cyanBackground("cyan-background"))
println(whiteBackground("white-background"))
println()

println(bold(black("bold-black")))
println(bold(red("bold-red")))
println(bold(green("bold-green")))
println(bold(yellow("bold-yellow")))
println(bold(blue("bold-blue")))
println(bold(purple("bold-purple")))
println(bold(cyan("bold-cyan")))
println(bold(white("bold-white")))
println()

println(blink(black("blink-black")))
println(blink(red("blink-red")))
println(blink(green("blink-green")))
println(blink(yellow("blink-yellow")))
println(blink(blue("blink-blue")))
println(blink(purple("blink-purple")))
println(blink(cyan("blink-cyan")))
println(blink(white("blink-white")))
println()

println(underline(black("underline-black")))
println(underline(red("underline-red")))
println(underline(green("underline-green")))
println(underline(yellow("underline-yellow")))
println(underline(blue("underline-blue")))
println(underline(purple("underline-purple")))
println(underline(cyan("underline-cyan")))
println(underline(white("underline-white")))
println()

println(underline(blink(bold(red("underline-blink-bold-red")))))
println(underline(blink(bold(red(whiteBackground("underline-blink-bold-red-white-background"))))))
println()
