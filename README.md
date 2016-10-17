Fabienbk's ScalaJS facade to Pixi.js
====================================

The aim of this project is to provide a ScalaJS facade for [Pixi.js](http://www.pixijs.com/), a 2D library 
that works across all devices.  Pixi.js has full 
[WebGL](https://en.wikipedia.org/wiki/WebGL) support and seamlessly falls back 
to HTML5's [canvas](https://en.wikipedia.org/wiki/Canvas_element) if needed. It's 
quite awesome, and ScalaJS makes it awesomer.

The goal of this project is to stay as close as possible to the underlying API, in order words, 
to favor correctness over abstraction.

### Version? 

It's currently targeting *Pixi.js v4.0.3*. Don't forget to include it in your project.

### Installation ###

Once you've setup your ScalaJS project, simply add this to your dependencies:

```scala
    libraryDependencies += "com.fbksoft" %%% "pixi-scala-js" % "1.0"
```

### How to get started ###

A good starting import configuration could be:

```scala
import pixiscalajs.PIXI
import pixiscalajs.PIXI.{Pixi, RendererOptions}
```

This way, you can use `PIXI.*` prefixed references, which is very common in
pixi.js documentation and snippets. Very often, you can almost copy-paste normal js code,
remove the trailing semicolons, and be done!

Note: To avoid name-clashing with scala package, the global `PIXI` JS object is mapped to
a `Pixi` (different casing) scala object. It's mostly useful to call the `autoDetectRenderer` method.

Here is a small example:

```scala
@JSExport
def main(canvas: html.Canvas): Unit = {
  val renderer = Pixi.autoDetectRenderer(800, 600, RendererOptions(canvas))
  
  val stage = new PIXI.Container()
  stage.width = 800
  stage.height = 600
  
  val graphics = new PIXI.Graphics()
  graphics.beginFill(0xFF3300).lineStyle(10, 0xffd900, 1)
  graphics.moveTo(50,50).lineTo(250, 50).lineTo(100, 100)
          .lineTo(250, 220).lineTo(50, 220).lineTo(50, 50)
  graphics.endFill()
  
  stage.addChild(graphics)
  
  renderer.render(stage)
}
```

#### Extensions ####

The `pixiscalajs.extensions` package contains various extensions to the library 
designed to make the library more scala-friendly.

The `AnimationLoop` construct allows to defined an endless loop that automatically calls
 `window.requestAnimationFrame` at the end.
 
```scala
AnimationLoop {
  count += 0.1
  graphics.clear()
  graphics.lineStyle(30, 0xff0000, 1).beginFill(0xffFF00, 0.5)

  graphics.moveTo(-120 + Math.sin(count) * 20, -100 + Math.cos(count)* 20)
    .lineTo(120 + Math.cos(count) * 20, -100 + Math.sin(count)* 20)
    .lineTo(120 + Math.sin(count) * 20, 100 + Math.cos(count)* 20)
    .lineTo(-120 + Math.cos(count)* 20, 100 + Math.sin(count)* 20)
    .lineTo(-120 + Math.sin(count) * 20, -100 + Math.cos(count)* 20)

  thing.rotation = count * 0.1
  renderer.render(stage)
}
```
 
### Demos ###

An example is packaged in this repo. See the example package.

### Contributions ###

Most welcome!

### License ###

This content is released under the (http://opensource.org/licenses/MIT) MIT License.
