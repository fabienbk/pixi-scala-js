package example.asteroid

import pixiscalajs.PIXI
import pixiscalajs.PIXI.SystemRenderer
import pixiscalajs.extensions.{AnimationLoop, DefineLoop}

import scala.collection.mutable.ArrayBuffer

/**
  * Created by fabienbk on 18/10/16.
  */
class World(renderer : SystemRenderer) {

  val objects = ArrayBuffer[GameObject]()

  val stage = new PIXI.Container() {
    width = renderer.width
    height = renderer.height
  }

  def updateAllChildren(): Unit = {
    objects.foreach(_.update())
    return objects.size
  }

  def add(gameObject: GameObject) : World = {
    stage.addChild(gameObject.draw())
    objects += gameObject
    this
  }

  val loop = AnimationLoop {
    updateAllChildren()
    renderer.render(stage)
  }

}
