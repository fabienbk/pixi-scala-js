package example.asteroid

import pixiscalajs.PIXI
import pixiscalajs.PIXI.{DisplayObject, Point}
import pixiscalajs.extensions.Vector2
import pixiscalajs.extensions.Implicits._

import scala.util.Random

abstract class GameObject(x: Double, y: Double) {
  var alive = true

  var acceleration = Vector2.Zero
  var position = Vector2(x, y)
  var speed = Vector2.Zero
  var maxSpeed = 5
  var world : World = null

  def getDisplayObject() : PIXI.DisplayObject

  def update(deltaTime : Long) : Unit = {
    speed += acceleration * deltaTime * 0.08
    if (speed.magnitude > maxSpeed) {
      speed = speed.normalized * maxSpeed
    }
    position += speed

    if (position.x < -20) position.x = world.width
    if (position.y < -30) position.y = world.height
    if (position.x > world.width + 20) position.x = -20
    if (position.y > world.height + 30) position.y = -30
  }

  def checkCollision(origin : GameObject, point : Vector2) = false

  def setWorld(world_ : World) = this.world = world_

  def destroy(): Unit = {
    alive = false
  }

}

abstract class SpriteGameObject(image: String, x: Double, y: Double, scale: Double = 1.0) extends GameObject(x,y) {
  val sprite = PIXI.Sprite.fromImage(AsteroidGame.RESOURCES_ROOT + '/' + image)
  sprite.anchor = Point(0.5, 0.5)
  sprite.scale = Point(scale, scale)
  sprite.name = this.toString

  def getDisplayObject() : DisplayObject = sprite

  override def update(deltaTime: Long): Unit = {
    super.update(deltaTime)
    sprite.x = position.x
    sprite.y = position.y
  }

  override def destroy(): Unit = {
    super.destroy()
    world.removeFromStage(this)
  }

  override def checkCollision(origin : GameObject, point : Vector2) = sprite.containsPoint(point)
}

case class Ship(x: Double, y: Double) extends SpriteGameObject("playerShip1_blue.png", x: Double, y: Double) {
  maxSpeed = 3

  override def update(deltaTime: Long) = super.update(deltaTime)

  var lastShotTime = System.currentTimeMillis
  def fire(world: World) {
    val millis: Long = System.currentTimeMillis()
    if (millis-lastShotTime > 100) {
      lastShotTime = millis
      world.add(Laser(position.x, position.y, sprite.rotation))
    }
  }

  def heading() = Vector2.Up.rotateRadians(sprite.rotation)

  override def checkCollision(origin: GameObject, point: Vector2) = false
}

case class Asteroid(x: Double, y: Double, scale:Double = 1.0) extends SpriteGameObject("meteorBrown_big1.png", x: Double, y: Double, scale:Double) {
  val clockwise = Random.nextBoolean()
  val rotationSpeed = Random.nextInt(30) + 10
  acceleration = Vector2.Random

  override def update(deltaTime: Long) : Unit = {
    super.update(deltaTime)
    sprite.rotation += 0.001 * rotationSpeed * (if(clockwise) 1 else -1)
  }

  def break(): Unit = {
    if (scale > 0.25) world.add(Asteroid(position.x,position.y,scale/2)).add(Asteroid(position.x,position.y,scale/2))
    destroy()
  }
}

case class Laser(x: Double, y: Double, angle: Double) extends SpriteGameObject("laserBlue01.png", x: Double, y: Double) {
  sprite.rotation = angle
  maxSpeed = 20
  acceleration = Vector2(Math.sin(angle), -Math.cos(angle))

  override def update(deltaTime: Long) : Unit = {
    super.update(deltaTime)
    val collisions = world.checkCollision(this, position)
    if (collisions.nonEmpty) {
      destroy()
      collisions.foreach {
        case a: Asteroid => a.break()
        case _ => return
      }
    }
  }
}



