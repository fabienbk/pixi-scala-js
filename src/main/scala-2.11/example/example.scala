package example

import org.scalajs.dom.raw.Event
import org.scalajs.dom.{html, window}
import pixiscalajs.PIXI
import pixiscalajs.PIXI.{Pixi, RendererOptions}

import scala.scalajs.js.annotation.JSExport

@JSExport
object PixiScalaJSExample {

  @JSExport
  def main(canvas: html.Canvas): Unit = {
    val renderer = Pixi.autoDetectRenderer(800, 600, RendererOptions(canvas))

    val stage = new PIXI.Container()
    stage.width = 800
    stage.height = 600
    stage.interactive = true

    val graphics = new PIXI.Graphics()

    // Necessary so events will be received by the stage
    graphics.beginFill(0x0, 1)
    graphics.drawRect(0,0,800,600)

    // set a fill and line style
    graphics.beginFill(0xFF3300)
    graphics.lineStyle(10, 0xffd900, 1)

    // draw a shape
    graphics.moveTo(50,50)
    graphics.lineTo(250, 50)
    graphics.lineTo(100, 100)
    graphics.lineTo(250, 220)
    graphics.lineTo(50, 220)
    graphics.lineTo(50, 50)
    graphics.endFill()

    // set a fill and line style again
    graphics.lineStyle(10, 0xFF0000, 0.8)
    graphics.beginFill(0xFF700B, 1)

    // draw a second shape
    graphics.moveTo(210,300)
    graphics.lineTo(450,320)
    graphics.lineTo(570,350)
    graphics.lineTo(580,20)
    graphics.lineTo(330,120)
    graphics.lineTo(410,200)
    graphics.lineTo(210,300)
    graphics.endFill()

    // draw a rectangel
    graphics.lineStyle(2, 0x0000FF, 1)
    graphics.drawRect(50, 250, 100, 100)

    // draw a circle
    graphics.lineStyle(0)
    graphics.beginFill(0xFFFF0B, 0.5)
    graphics.drawCircle(470, 200,100)

    graphics.lineStyle(20, 0x33FF00)
    graphics.moveTo(30,30)
    graphics.lineTo(600, 300)


    stage.addChild(graphics)

    // lets create moving shape
    val thing = new PIXI.Graphics()
    stage.addChild(thing)
    thing.position.x = 620/2
    thing.position.y = 380/2

    var count = 0d

    stage.on("click", (event: Event) => {
      graphics.lineStyle(Math.random() * 30, Math.random() * 0xFFFFFF, 0.3)
      graphics.beginFill(Math.random() * 0xFFFFFF, 0.3)
      graphics.drawRect(0,0,800,600)
      ()
    })

    lazy val loop: (Double) => Unit = { time =>

      thing.clear()

      count += 0.1

      thing.clear()
      thing.lineStyle(30, 0xff0000, 1)
      thing.beginFill(0xffFF00, 0.5)

      thing.moveTo(-120 + Math.sin(count) * 20, -100 + Math.cos(count)* 20)
      thing.lineTo(120 + Math.cos(count) * 20, -100 + Math.sin(count)* 20)
      thing.lineTo(120 + Math.sin(count) * 20, 100 + Math.cos(count)* 20)
      thing.lineTo(-120 + Math.cos(count)* 20, 100 + Math.sin(count)* 20)
      thing.lineTo(-120 + Math.sin(count) * 20, -100 + Math.cos(count)* 20)

      thing.rotation = count * 0.1
      renderer.render(stage)

      window.requestAnimationFrame(loop)
    }

    loop(0)
  }



}