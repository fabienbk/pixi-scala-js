Fabienbk's ScalaJS facade to Pixi.js
====================================

The aim of this project is to provide a ScalaJS facade for Pixi.js, a 2D library 
that works across all devices.  Pixi.js has full 
[WebGL](https://en.wikipedia.org/wiki/WebGL) support and seamlessly falls back 
to HTML5's [canvas](https://en.wikipedia.org/wiki/Canvas_element) if needed. It's 
quite awesome, and ScalaJS makes it awesomer.

The goal of this project is to stay as close as possible to the underlying API, in order words, to favor 
correctness over abstraction.

### Version? 

It's currently targeting *Pixi.js v4.0.3*. Don't forget to include it in your project.

### Installation ###

Once you've setup your ScalaJS project, simply add this to your dependencies:

```scala
    libraryDependencies += "com.fbksoft" %%% "pixi-scala-js" % "1.0"
```

### Is it tested?

I'm working on it :)

### Demos ###

An example is packaged in this repo. See the example package.

### Contributions ###

Most welcome!

### License ###

This content is released under the (http://opensource.org/licenses/MIT) MIT License.
