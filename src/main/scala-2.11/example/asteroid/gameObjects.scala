package example.asteroid

import pixiscalajs.PIXI
import pixiscalajs.PIXI.Point
import pixiscalajs.extensions.Point2D

abstract class GameObject(x: Double, y: Double) {
  var acceleration = Point2D.Zero
  var position = Point2D(x, y)
  var speed = Point2D.Zero
  var maxSpeed = 5

  def draw() : Seq[PIXI.DisplayObject]

  def update(deltaTime : Long) {
    speed += acceleration * deltaTime * 0.08
    if (speed.magnitude() > maxSpeed) {
      speed = speed.normalized() * maxSpeed
    }
    position += speed
  }
}

abstract class SpriteGameObject(image: String, x: Double, y: Double) extends GameObject(x,y) {
  val sprite = PIXI.Sprite.fromImage(AsteroidGame.RESOURCES_ROOT + image)
  sprite.anchor = Point(0.5, 0.5)

  def draw() = Seq(sprite)

  override def update(deltaTime: Long): Unit = {
    super.update(deltaTime)
    sprite.x = position.x
    sprite.y = position.y
  }
}

case class Ship(x: Double, y: Double) extends SpriteGameObject("/PNG/playerShip1_blue.png", x: Double, y: Double) {
  override def update(deltaTime: Long) {
    super.update(deltaTime)
    sprite.rotation = Math.atan2(speed.x,-speed.y)
  }
  def fire(world: World) = world.add(Laser(position.x, position.y, sprite.rotation))
}

case class Asteroid(x: Double, y: Double) extends SpriteGameObject("/PNG/Meteors/meteorBrown_big1.png", x: Double, y: Double) {
  override def update(deltaTime: Long) {
    super.update(deltaTime)
    sprite.rotation += 0.01
  }
}

case class Laser(x: Double, y: Double, angle: Double) extends SpriteGameObject("/PNG/Lasers/laserBlue01.png", x: Double, y: Double) {
  sprite.rotation = angle
  maxSpeed = 20
  acceleration = Point2D(Math.sin(angle), -Math.cos(angle))
  override def update(deltaTime: Long) {
    super.update(deltaTime)
  }
}



