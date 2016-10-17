package example

import org.scalajs.dom.html
import org.scalajs.dom.raw.Event
import pixiscalajs.PIXI.{Pixi, RendererOptions}
import pixiscalajs.PIXI
import pixiscalajs.extensions.AnimationLoop

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

    graphics.beginFill(0x0, 1).drawRect(0,0,800,600).endFill()

    graphics.beginFill(0xFF3300).lineStyle(10, 0xffd900, 1)
    graphics.moveTo(50,50).lineTo(250, 50).lineTo(100, 100).lineTo(250, 220).lineTo(50, 220).lineTo(50, 50)
    graphics.endFill()

    graphics.lineStyle(10, 0xFF0000, 0.8).beginFill(0xFF700B, 1)
    graphics.moveTo(210,300).lineTo(450,320).lineTo(570,350).lineTo(580,20).lineTo(330,120).lineTo(410,200).lineTo(210,300)
    graphics.endFill()

    graphics.lineStyle(2, 0x0000FF, 1).drawRect(50, 250, 100, 100)
    graphics.lineStyle(0).beginFill(0xFFFF0B, 0.5).drawCircle(470, 200,100)

    graphics.lineStyle(20, 0x33FF00).moveTo(30,30).lineTo(600, 300)

    stage.addChild(graphics)

    // lets create moving shape
    val thing = new PIXI.Graphics()
    stage.addChild(thing)
    thing.position.x = 620/2
    thing.position.y = 380/2

    stage.on("click", (event: Event) => {
      graphics.lineStyle(Math.random() * 30, Math.random() * 0xFFFFFF, 0.3)
      graphics.beginFill(Math.random() * 0xFFFFFF, 0.3)
      graphics.drawRect(0,0,800,600)
      ()
    })

    var count = 0d

    AnimationLoop {
      count += 0.1
      thing.clear()

      thing.lineStyle(30, 0xff0000, 1).beginFill(0xffFF00, 0.5)

      thing.moveTo(-120 + Math.sin(count) * 20, -100 + Math.cos(count)* 20)
        .lineTo(120 + Math.cos(count) * 20, -100 + Math.sin(count)* 20)
        .lineTo(120 + Math.sin(count) * 20, 100 + Math.cos(count)* 20)
        .lineTo(-120 + Math.cos(count)* 20, 100 + Math.sin(count)* 20)
        .lineTo(-120 + Math.sin(count) * 20, -100 + Math.cos(count)* 20)

      thing.rotation = count * 0.1
      renderer.render(stage)
    }

}