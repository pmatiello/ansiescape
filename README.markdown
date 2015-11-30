# Ansiescape

Ansiescape is a Scala library for easy building of strings with
[ANSI escape codes](https://en.wikipedia.org/wiki/ANSI_escape_code).

Currently, the standard ANSI colors (black, red, green, yellow, blue, purple, cyan, white) are supported both as
text and background colors. Also, bold, underline and blink are supported as effects.

## Installing

Ansiescape is available from [Bintray](https://bintray.com). Add this to your project's `build.sbt` file:

```scala
resolvers += Resolver.bintrayRepo("pmatiello", "maven")
libraryDependencies += "me.pmatiello" %% "ansiescape" % "0.1"
```

The most recent release is the version 0.1 from November 24, 2015.

## Usage

All methods are exposed at the `me.pmatiello.ansiescape.ANSI` object. The simplest way to use them is by importing
this object into the current context.

```scala
import me.pmatiello.ansiescape.ANSI._
println(s"${red("Hello, world")}!")
```

![Screenshot for the example](misc/screenshot-example.png)

## License

Ansiescape is licensed under the Apache License, Version 2.0. See the LICENSE file for details.
