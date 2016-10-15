package example

import org.scalajs.dom.{html, window}
import pixiscalajs.PIXI
import pixiscalajs.PIXI.{Pixi, RendererOptions}

import scala.collection.mutable.Seq
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.JSConverters._

@JSExport
object PixiScalaJSExample {

  @JSExport
  def main(canvas: html.Canvas): Unit = {
    val renderer = Pixi.autoDetectRenderer(800, 600, RendererOptions(canvas))
    val stage = new PIXI.Container()

    lazy val loop: (Double) => Unit = { time =>

      // Initialize the pixi Graphics class
      val graphics = new PIXI.Graphics()

      // Set the fill color
      graphics.beginFill(0xe74c3c) // Red

      // Draw a circle
      graphics.drawCircle(60, 185, 40) // drawCircle(x, y, radius)

      // Applies fill to lines and shapes since the last call to beginFill.
      graphics.endFill()

      // Set a new fill color
      graphics.beginFill(0x3498db) // Blue

      // Draw an ellipse
      graphics.drawEllipse(170, 185, 45, 25)
      graphics.endFill()

      graphics.beginFill(0x9b59b6) // Purple

      // Draw a rectangle
      graphics.drawRect(240, 150, 75, 75)
      graphics.endFill()

      graphics.beginFill(0x2c3e50) // Dark blue-gray 'ish

      // Draw a rectangle with rounded corners
      graphics.drawRoundedRect(350, 160, 75, 50, 10) // drawRoundedRect(x, y, width, height, radius)
      graphics.endFill()

      graphics.beginFill(0xFFFF00) // Dark blue-gray 'ish
      graphics.drawPolygon(Seq[Double](
        550, 100,
        570, 150,
        630, 155,
        585, 195,
        600, 250,
        550, 220,
        500, 250,
        515, 195,
        470, 155,
        530, 150).toJSArray)
        graphics.endFill()

      // Add the graphics to the stage
      stage.addChild(graphics)

      renderer.render(stage)

      window.requestAnimationFrame(loop)
    }

    loop(0)
  }



}