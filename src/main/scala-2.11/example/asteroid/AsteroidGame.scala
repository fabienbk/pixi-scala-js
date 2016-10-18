package example.asteroid

import org.scalajs.dom.html
import pixiscalajs.PIXI.{Pixi, RendererOptions}
import pixiscalajs.extensions.AnimationLoop

import scala.scalajs.js.annotation.JSExport

/**
  * Created by fabienbk on 18/10/16.
  */
@JSExport
class AsteroidGame {

  @JSExport
  var world : World = null

  @JSExport
  def main(canvas: html.Canvas): Unit = {
    println("Loading renderer")
    val renderer = Pixi.autoDetectRenderer(800, 600, RendererOptions(canvas))

    println("Creating world")

    world = new World(renderer)
    world.add(Ship(50, 50)).add(Asteroid(100, 100))

    println("Starting loop")
  }

}

object AsteroidGame {

  final val RESOURCES_ROOT = "demo"

}