package example.asteroid

import pixiscalajs.PIXI

sealed trait Drawable {
  def draw() : PIXI.DisplayObject
}

abstract class GameObject(x: Int, y: Int) extends Drawable {
  def update() : Double
}

abstract class SpriteGameObject(image: String, x: Int, y: Int) extends GameObject(x,y) {
  val sprite = PIXI.Sprite.fromImage(AsteroidGame.RESOURCES_ROOT + image)
  override def draw() = sprite
}

case class Ship(x: Int, y: Int) extends SpriteGameObject("/PNG/playerShip1_blue.png", x: Int, y: Int) {
  override def update(): Double = {
    sprite.position.x = x;
    sprite.position.y = y;
    sprite.anchor.x = 0.5
    sprite.anchor.y = 0.5
    sprite.rotation += 0.1
    return sprite.rotation
  }
}

case class Asteroid(x: Int, y: Int) extends SpriteGameObject("/PNG/Meteors/meteorBrown_big1.png", x: Int, y: Int) {
  override def update(): Double = {
    sprite.position.x = x;
    sprite.position.y = y;
    sprite.anchor.x = 0.5
    sprite.anchor.y = 0.5
    sprite.rotation += 0.01
    return sprite.rotation
  }
}




