import com.lihaoyi.workbench.WorkbenchPlugin._

val root = (project in file(".")).enablePlugins(ScalaJSPlugin, WorkbenchPlugin)

workbenchSettings

name := "pixi-scala-js"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.5"
)


// bootSnippet := "example.PixiScalaJSExample().main(document.getElementById('canvas'));"

refreshBrowsers := refreshBrowsers.triggeredBy(fastOptJS in Compile).value
