package pixiscalajs.extensions

import pixiscalajs.PIXI.Point


/**
  * Created by fabienbk on 20/10/16.
  */
case class Vector2(var x : Double, var y : Double) {
  def inverse(): Vector2 = return this * -1

  def +(point : Vector2) = Vector2(x + point.x, y + point.y)
  def -(point : Vector2) = Vector2(x - point.x, y - point.y)
  def *(k : Double) = Vector2(x * k, y * k)
  def /(k : Double) = Vector2(x / k, y / k)

  def sqrMagnitude = x*x+y*y
  def magnitude = Math.sqrt(x*x+y*y)
  def normalized = this / magnitude

  def rotate(degrees: Double) : Vector2 = rotateRadians(degrees * Vector2.DEG_TO_RADS)

  def rotateRadians(radians: Double) : Vector2 = {
    val ca = Math.cos(radians);
    val sa = Math.sin(radians);
    Vector2(ca*x - sa*y, sa*x + ca*y);
  }
}

object Vector2 {
  val DEG_TO_RADS : Double = Math.PI/180;

  val Down = Vector2( 0, 1)
  val Up   = Vector2( 0,-1)
  val Left = Vector2(-1, 0)
  val Right= Vector2( 1, 0)
  val Zero = Vector2( 0, 0)

  def Random = Vector2(scala.util.Random.nextFloat()*2 - 1, scala.util.Random.nextFloat()*2 - 1)
}

object Implicits {
  implicit def pointToPoint2D(p: Point) = Vector2(p.x, p.y)

  implicit def point2DToPoint(p: Vector2) = Point(p.x, p.y)
}


