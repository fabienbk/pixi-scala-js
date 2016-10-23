package example.asteroid

import pixiscalajs.PIXI
import pixiscalajs.PIXI.Point
import pixiscalajs.extensions.Vector2
import pixiscalajs.extensions.Implicits._

import scala.util.Random

abstract class GameObject(x: Double, y: Double) {
  var acceleration = Vector2.Zero
  var position = Vector2(x, y)
  var speed = Vector2.Zero
  var maxSpeed = 5
  var world : World = null

  def getDisplayObjects() : Seq[PIXI.DisplayObject]

  def update(deltaTime : Long) {
    speed += acceleration * deltaTime * 0.08
    if (speed.magnitude > maxSpeed) {
      speed = speed.normalized * maxSpeed
    }
    position += speed
  }

  def checkCollision(origin : GameObject, point : Vector2) = false

  def setWorld(world_ : World) = this.world = world_

  def destroy(): Unit = {
    world.remove(this)
  }
}

abstract class SpriteGameObject(image: String, x: Double, y: Double) extends GameObject(x,y) {
  val sprite = PIXI.Sprite.fromImage(AsteroidGame.RESOURCES_ROOT + image)
  sprite.anchor = Point(0.5, 0.5)

  def getDisplayObjects() = Seq(sprite)

  override def update(deltaTime: Long): Unit = {
    super.update(deltaTime)
    sprite.x = position.x
    sprite.y = position.y
  }

  override def destroy(): Unit = {
    super.destroy()
  }

  override def checkCollision(origin : GameObject, point : Vector2) = sprite.containsPoint(point)
}

case class Ship(x: Double, y: Double) extends SpriteGameObject("/PNG/playerShip1_blue.png", x: Double, y: Double) {
  maxSpeed = 3

  override def update(deltaTime: Long) = super.update(deltaTime)

  var lastShotTime = System.currentTimeMillis
  def fire(world: World) {
    val millis: Long = System.currentTimeMillis()
    if (millis-lastShotTime > 300) {
      lastShotTime = millis
      world.add(Laser(position.x, position.y, sprite.rotation))
    }
  }

  def heading() = Vector2.Up.rotateRadians(sprite.rotation)

  override def checkCollision(origin: GameObject, point: Vector2) = false
}

case class Asteroid(x: Double, y: Double) extends SpriteGameObject("/PNG/Meteors/meteorBrown_big1.png", x: Double, y: Double) {
  val clockwise = Random.nextBoolean()
  val rotationSpeed = Random.nextInt(3) + 1

  override def update(deltaTime: Long) {
    super.update(deltaTime)
    sprite.rotation += 0.01 * rotationSpeed * (if(clockwise) 1 else -1)
  }
}

case class Laser(x: Double, y: Double, angle: Double) extends SpriteGameObject("/PNG/Lasers/laserBlue01.png", x: Double, y: Double) {
  sprite.rotation = angle
  maxSpeed = 20
  acceleration = Vector2(Math.sin(angle), -Math.cos(angle))

  override def update(deltaTime: Long) {
    super.update(deltaTime)
    val collisions = world.checkCollision(this, position)
    if (collisions.nonEmpty) destroy()
  }

}



