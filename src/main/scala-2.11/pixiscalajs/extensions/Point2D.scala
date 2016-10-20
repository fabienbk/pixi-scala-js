package pixiscalajs.extensions

import pixiscalajs.PIXI.Point


/**
  * Created by fabienbk on 20/10/16.
  */
case class Point2D(var x : Double, var y : Double) {

  def sqrMagnitude(): Double = x*x+y*y

  def +(point : Point2D) = Point2D(x + point.x, y + point.y)
  def -(point : Point2D) = Point2D(x - point.x, y - point.y)
  def *(k : Double) = Point2D(x * k, y * k)

  def add(x: Double, y:Double) : Point2D = {
    this.x += x; this.y += y; this
  }
  def sub(x: Double, y:Double) : Point2D = {
    this.x -= x; this.y -= y; this
  }
  def mul(k: Double) : Point2D = {
    this.x *= k; this.y *= k; this
  }

}

object Point2D {
  val Zero: Point2D = new Point2D(0,0)
}

object Implicits {
  implicit def pointToPoint2D(p: Point) = Point2D(p.x, p.y)

  implicit def point2DToPoint(p: Point2D) = Point(p.x, p.y)
}


