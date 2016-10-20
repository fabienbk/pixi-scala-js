package pixiscalajs.extensions

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.window

/**
  * Created by fabienbk on 20/10/16.
  */
case class KeyBinding(keyCode : Int) {

  var isUp = true
  var isDown = false
  var press : () => Unit = null
  var release : () => Unit = null

  val downHandler = (event: KeyboardEvent) => {
    if (event.keyCode == keyCode) {
      if (isUp && press != null) {
        press()
      }
      isDown = true
      isUp = false
    }
    event.preventDefault()
  }

  val upHandler = (event: KeyboardEvent) => {
    if (event.keyCode == keyCode) {
      if (isDown && release != null) {
        release()
      }
      isDown = false
      isUp = true
    }
    event.preventDefault();
  };

  window.addEventListener("keydown", downHandler, false)
  window.addEventListener("keyup", upHandler, false)
}
