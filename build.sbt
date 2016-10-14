import com.lihaoyi.workbench.Plugin._

val root = (project in file(".")).enablePlugins(ScalaJSPlugin)

workbenchSettings

name := "pixi-scala-js"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0"
)


bootSnippet := "example.PixiScalaJSExample().main(document.getElementById('canvas'));"

refreshBrowsers <<= refreshBrowsers.triggeredBy(fastOptJS in Compile)