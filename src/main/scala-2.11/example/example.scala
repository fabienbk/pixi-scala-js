package example

import org.scalajs.dom.{html, window}
import pixiscalajs.{Container, Graphics, PIXI, RendererOptions}
import scala.scalajs.js.annotation.JSExport

@JSExport
object PixiScalaJSExample {

  @JSExport
  def main(canvas: html.Canvas): Unit = {
    val renderer = PIXI.autoDetectRenderer(800, 600, RendererOptions(canvas))
    val stage = new Container()
    val rnd = scala.util.Random

    val loop: (Double) => Unit = { time =>
      val rect = new Graphics()
      rect.beginFill(0xFFFF00)
      rect.lineStyle(5, 0xFF0000)
      rect.drawRect(rnd.nextInt(800), rnd.nextInt(600), 1, 1)

      stage.addChild(rect)
      renderer.render(stage)

      window.requestAnimationFrame(loop)
    }

    loop(0)
  }



}