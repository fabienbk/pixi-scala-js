package example

import org.scalajs.dom.document
import pixiscalajs.{Container, PIXI}

import scala.scalajs.js.annotation.JSExport

@JSExport
object PixiScalaJSExample {

  @JSExport
  def main(): Unit = {
    val renderer = PIXI.autoDetectRenderer(256, 256);

    //Add the canvas to the HTML document
    document.body.appendChild(renderer.view);

    //Create a container object called the `stage`
    val stage = new Container();

    //Tell the `renderer` to `render` the `stage`
    renderer.render(stage);
  }

}