package pixiscalajs.extensions

/**
  * Created by fabienbk on 20/10/16.
  */
object Keyboard {

  def bind(keyCode: Int,
           onPress : () => Unit = null,
           onRelease : () => Unit = null,
           whileDown : () => Unit = null): KeyBinding = {
    val key = KeyBinding(keyCode)
    key.release = onRelease
    key.press = onPress
    return key
  }

}
