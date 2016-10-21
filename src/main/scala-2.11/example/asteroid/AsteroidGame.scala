package example.asteroid

import org.scalajs.dom.html
import pixiscalajs.PIXI
import pixiscalajs.PIXI.{Pixi, RendererOptions}
import pixiscalajs.extensions.{AnimationLoop, Keyboard, Point2D}

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
    //val renderer = Pixi.autoDetectRenderer(800, 600, RendererOptions(canvas))
    val renderer = new PIXI.CanvasRenderer(800,600, RendererOptions(canvas))

    println("Creating world")

    val ship = Ship(400, 300)

    world = new World(renderer)
    world.add(ship).add(Asteroid(100, 100))

    println("Starting loop")

    Keyboard.bind(39, () => ship.acceleration += Point2D(1, 0), () => ship.acceleration -= Point2D(1, 0))   // right
    Keyboard.bind(37, () => ship.acceleration += Point2D(-1, 0),() => ship.acceleration -= Point2D(-1, 0))  // left
    Keyboard.bind(38, () => ship.acceleration += Point2D(0, -1),() => ship.acceleration -= Point2D(0, -1))  // up
    Keyboard.bind(40, () => ship.acceleration += Point2D(0, 1), () => ship.acceleration -= Point2D(0, 1))   // down
    Keyboard.bind(32, () => ship.fire(world))

    world.loop.run()
  }

}



object AsteroidGame {

  final val RESOURCES_ROOT = "demo"

}