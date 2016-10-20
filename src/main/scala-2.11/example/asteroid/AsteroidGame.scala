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

    val ship = Ship(50, 50)

    world = new World(renderer)
    world.add(ship).add(Asteroid(100, 100))

    println("Starting loop")

    /*var left = keyboard(37),
    up = keyboard(38),
    right = keyboard(39),
    down = keyboard(40);*/

    Keyboard.bind(37, () => ship.acceleration += Point2D(-1, 0), ship.cutEngine)   // left
    Keyboard.bind(38, () => ship.acceleration += Point2D(0, -1), ship.cutEngine)  // up
    Keyboard.bind(38, () => ship.acceleration += Point2D(1, 0), ship.cutEngine)  // right
    Keyboard.bind(38, () => ship.acceleration += Point2D(0, 1), ship.cutEngine)  // down

    world.loop.run()

  }

}



object AsteroidGame {

  final val RESOURCES_ROOT = "demo"

}