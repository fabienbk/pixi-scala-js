package pixiscalajs.extensions

import org.scalajs.dom.window

/**
  * Helper for animation loops
  */
object AnimationLoop {

  def apply(loop: => Unit): Unit = {
    loop
    window.requestAnimationFrame((d: Double) => apply(loop))
  }

}

object DefineLoop {
  def apply(loop: => Unit): DefineLoop = new DefineLoop(loop)
}

class DefineLoop(loop: => Unit) {
  def run(): Unit = {
    loop
    window.requestAnimationFrame((d: Double) => run())
  }
}