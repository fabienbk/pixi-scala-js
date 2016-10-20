package example.asteroid

import pixiscalajs.PIXI
import pixiscalajs.PIXI.Point
import pixiscalajs.extensions.Point2D

sealed trait Drawable {
  def draw() : PIXI.DisplayObject
}

abstract class GameObject(x: Int, y: Int) extends Drawable {
  var acceleration = Point2D.Zero
  var position = Point2D(x, y)
  var speed = Point2D.Zero

  def update(deltaTime : Long) {
    speed += acceleration * deltaTime * 0.01

    /*if (speed.magnitude() > 1) {
      speed = speed.normalized()
    }*/

    position += speed
  }
}

abstract class SpriteGameObject(image: String, x: Int, y: Int) extends GameObject(x,y) {
  val sprite = PIXI.Sprite.fromImage(AsteroidGame.RESOURCES_ROOT + image)
  sprite.anchor = Point(0.5, 0.5)

  override def draw() = sprite

  override def update(deltaTime: Long): Unit = {
    super.update(deltaTime)
    sprite.x = position.x
    sprite.y = position.y
  }
}

case class Ship(x: Int, y: Int) extends SpriteGameObject("/PNG/playerShip1_blue.png", x: Int, y: Int) {
  def cutEngine() {
    acceleration = Point2D.Zero
  }

  override def update(deltaTime: Long) {
    super.update(deltaTime)
  }
}

case class Asteroid(x: Int, y: Int) extends SpriteGameObject("/PNG/Meteors/meteorBrown_big1.png", x: Int, y: Int) {
  override def update(deltaTime: Long) {
    super.update(deltaTime)
    sprite.rotation += 0.01
  }
}




