package example.asteroid

import pixiscalajs.PIXI
import pixiscalajs.PIXI.SystemRenderer
import pixiscalajs.extensions.DefineLoop

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

  var latestTimestamp = 0L

  def updateAllChildren() {
    val deltaTime = System.currentTimeMillis() - latestTimestamp
    latestTimestamp = System.currentTimeMillis()
    objects.foreach(_.update(deltaTime))
  }

  def add(gameObject: GameObject) : World = {
    gameObject.draw().foreach(stage.addChild(_))
    objects += gameObject
    this
  }

  val loop = DefineLoop {
    updateAllChildren()
    renderer.render(stage)
  }

}
