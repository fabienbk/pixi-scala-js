package example.asteroid

import pixiscalajs.PIXI
import pixiscalajs.PIXI.{DisplayObject, SystemRenderer}
import pixiscalajs.extensions.{DefineLoop, Keyboard, Vector2}

import scala.collection.mutable

/**
  * Created by fabienbk on 18/10/16.
  */
class World(renderer : SystemRenderer, ship : Ship) {

  val width = renderer.width
  val height = renderer.height

  val right = Keyboard.bind(39)
  val left = Keyboard.bind(37)
  val up = Keyboard.bind(38)
  val down = Keyboard.bind(40)
  val space = Keyboard.bind(32)

  var objects = mutable.ArrayBuffer[GameObject]()

  val stage = new PIXI.Container() {
    width = renderer.width
    height = renderer.height
  }

  val loop = DefineLoop {
    if (right.isDown) ship.sprite.rotation += Vector2.DEG_TO_RADS*3
    if (left.isDown) ship.sprite.rotation -= Vector2.DEG_TO_RADS*3
    if (up.isDown) ship.acceleration = ship.heading()
    if (down.isDown) ship.acceleration = Vector2.Zero
    if (space.isDown) ship.fire(this)
    updateAllChildren()
    renderer.render(stage)
  }

  var latestTimestamp = 0L

  def updateAllChildren() {
    val deltaTime = System.currentTimeMillis() - latestTimestamp
    latestTimestamp = System.currentTimeMillis()

    objects = objects.filter(_.alive)
    objects.foreach(_.update(deltaTime))
  }

  def add(gameObject: GameObject) : World = {
    gameObject.setWorld(this)
    stage.addChild(gameObject.getDisplayObject())
    objects += gameObject
    this
  }

  def removeFromStage(gameObject: GameObject): Unit = {
    val displayObject: DisplayObject = gameObject.getDisplayObject()
    stage.removeChild(displayObject)
  }

  def checkCollision(origin: GameObject, position: Vector2) : Seq[GameObject] = {
    objects.filter(_ != origin).filter(_.checkCollision(origin, position))
  }

}
