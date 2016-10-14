package pixiscalajs

import org.scalajs.dom.raw._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSName, ScalaJSDefined}
import scala.scalajs.js.typedarray.Uint16Array
import scala.scalajs.js.|




@js.native
@JSName("PIXI.RENDERER_TYPE")
object RENDERER_TYPE extends js.Object {
  var UNKNOWN: Double = js.native
  var WEBGL: Double = js.native
  var CANVAS: Double = js.native
}

@js.native
@JSName("PIXI.BLEND_MODES")
object BLEND_MODES extends js.Object {
  var NORMAL: Double = js.native
  var ADD: Double = js.native
  var MULTIPLY: Double = js.native
  var SCREEN: Double = js.native
  var OVERLAY: Double = js.native
  var DARKEN: Double = js.native
  var LIGHTEN: Double = js.native
  var COLOR_DODGE: Double = js.native
  var COLOR_BURN: Double = js.native
  var HARD_LIGHT: Double = js.native
  var SOFT_LIGHT: Double = js.native
  var DIFFERENCE: Double = js.native
  var EXCLUSION: Double = js.native
  var HUE: Double = js.native
  var SATURATION: Double = js.native
  var COLOR: Double = js.native
  var LUMINOSITY: Double = js.native
}

@js.native
@JSName("PIXI.DRAW_MODES")
object DRAW_MODES extends js.Object {
  var POINTS: Double = js.native
  var LINES: Double = js.native
  var LINE_LOOP: Double = js.native
  var LINE_STRIP: Double = js.native
  var TRIANGLES: Double = js.native
  var TRIANGLE_STRIP: Double = js.native
  var TRIANGLE_FAN: Double = js.native
}

@js.native
@JSName("PIXI.SCALE_MODES")
object SCALE_MODES extends js.Object {
  var DEFAULT: Double = js.native
  var LINEAR: Double = js.native
  var NEAREST: Double = js.native
}

@js.native
@JSName("PIXI.DEFAULT_RENDER_OPTIONS")
object DEFAULT_RENDER_OPTIONS extends js.Object {
  var view: HTMLCanvasElement = js.native
  var resolution: Double = js.native
  var antialias: Boolean = js.native
  var forceFXAA: Boolean = js.native
  var autoResize: Boolean = js.native
  var transparent: Boolean = js.native
  var backgroundColor: Double = js.native
  var clearBeforeRender: Boolean = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var roundPixels: Boolean = js.native
}

@js.native
@JSName("PIXI.SHAPES")
object SHAPES extends js.Object {
  var POLY: Double = js.native
  var RECT: Double = js.native
  var CIRC: Double = js.native
  var ELIP: Double = js.native
  var RREC: Double = js.native
}

@js.native
@JSName("PIXI.AccessibilityManager")
class AccessibilityManager protected() extends js.Object {
  def this(renderer: SystemRenderer) = this()

  var div: HTMLElement = js.native
  var pool: js.Array[HTMLElement] = js.native
  var renderId: Double = js.native
  var children: js.Array[DisplayObject] = js.native
  var isActive: Boolean = js.native
  var debug: Boolean = js.native
  var renderer: SystemRenderer = js.native

  def activate(): Unit = js.native

  def deactivate(): Unit = js.native

  def updateAccessibleObjects(displayObject: DisplayObject): Unit = js.native

  def update(): Unit = js.native

  def capHitArea(hitArea: js.Any): Unit = js.native

  def addChild(displayObject: DisplayObject): Unit = js.native

  def destroy(): Unit = js.native
}

@js.native
trait AccessibleTarget extends js.Object {
  var accessible: Boolean = js.native
  var accessibleTitle: String = js.native
  var accessibleHint: String = js.native
  var tabIndex: Double = js.native
}

@js.native
@JSName("PIXI.DisplayObject")
class DisplayObject extends utils.EventEmitter with interaction.InteractiveTarget {
  var _originalRenderWebGL: WebGLRenderer = js.native
  var _originalRenderCanvas: CanvasRenderer = js.native
  var _originalUpdateTransform: Boolean = js.native
  var _originalHitTest: js.Any = js.native
  var _cachedSprite: js.Any = js.native
  var _originalDestroy: js.Any = js.native
  var cacheAsBitmap: Boolean = js.native

  def _renderCachedWebGL(renderer: WebGLRenderer): Unit = js.native

  def _initCachedDisplayObject(renderer: WebGLRenderer): Unit = js.native

  def _renderCachedCanvas(renderer: CanvasRenderer): Unit = js.native

  def _initCachedDisplayObjectCanvas(renderer: CanvasRenderer): Unit = js.native

  def _getCachedBounds(): Rectangle = js.native

  def _destroyCachedDisplayObject(): Unit = js.native

  def _cacheAsBitmapDestroy(): Unit = js.native

  var _sr: Double = js.native
  var _cr: Double = js.native
  var _bounds: Rectangle = js.native
  var _currentBounds: Rectangle = js.native
  var _mask: Rectangle = js.native
  var _cachedObject: js.Any = js.native

  def updateTransform(): Unit = js.native

  var position: Point = js.native
  var scale: Point = js.native
  var pivot: Point = js.native
  var rotation: Double = js.native
  var renderable: Boolean = js.native
  var skew: Point = js.native
  var alpha: Double = js.native
  var visible: Boolean = js.native
  var parent: Container = js.native
  var worldAlpha: Double = js.native
  var worldTransform: Matrix = js.native
  var filterArea: Rectangle = js.native
  var x: Double = js.native
  var y: Double = js.native
  var worldVisible: Boolean = js.native
  var mask: Graphics | Sprite = js.native
  var filters: js.Array[AbstractFilter] = js.native
  var name: String = js.native

  def getBounds(): Rectangle = js.native

  def getLocalBounds(): Rectangle = js.native

  def toGlobal(position: Point): Point = js.native

  def toLocal(position: Point, from: DisplayObject = ???, to: Point = ???): Point = js.native

  def generateTexture(renderer: WebGLRenderer | CanvasRenderer, scaleMode: Double, resolution: Double): Texture = js.native

  def setParent(container: Container): Container = js.native

  def setTransform(x: Double = ???, y: Double = ???, scaleX: Double = ???, scaleY: Double = ???, rotation: Double = ???, skewX: Double = ???, skewY: Double = ???, pivotX: Double = ???, pivotY: Double = ???): DisplayObject = js.native

  def destroy(): Unit = js.native

  def getGlobalPosition(point: Point): Point = js.native

  var accessible: Boolean = js.native
  var accessibleTitle: String = js.native
  var tabIndex: Double = js.native
}

@js.native
@JSName("PIXI.Container")
class Container extends DisplayObject {
  def _renderWebGL(renderer: WebGLRenderer): Unit = js.native

  def _renderCanvas(renderer: CanvasRenderer): Unit = js.native

  var onChildrenChange: js.Function0[Unit] = js.native
  var children: js.Array[DisplayObject] = js.native
  var width: Double = js.native
  var height: Double = js.native

  def addChild(child: DisplayObject*): DisplayObject = js.native

  def addChildAt(child: DisplayObject, index: Double): DisplayObject = js.native

  def swapChildren(child: DisplayObject, child2: DisplayObject): Unit = js.native

  def getChildIndex(child: DisplayObject): Double = js.native

  def setChildIndex(child: DisplayObject, index: Double): Unit = js.native

  def getChildAt(index: Double): DisplayObject = js.native

  def getChildByName(name: String): DisplayObject = js.native

  def removeChild(child: DisplayObject): DisplayObject = js.native

  def removeChildAt(index: Double): DisplayObject = js.native

  def removeChildren(beginIndex: Double = ???, endIndex: Double = ???): js.Array[DisplayObject] = js.native

  def destroy(destroyChildren: Boolean = ???): Unit = js.native

  def renderWebGL(renderer: WebGLRenderer): Unit = js.native

  def renderCanvas(renderer: CanvasRenderer): Unit = js.native

}

@js.native
@JSName("PIXI.GraphicsData")
class GraphicsData protected() extends js.Object {
  def this(lineWidth: Double, lineColor: Double, lineAlpha: Double, fillColor: Double, fillAlpha: Double, fill: Boolean, shape: Circle | Rectangle | Ellipse | Polygon) = this()

  var lineWidth: Double = js.native
  var lineColor: Double = js.native
  var lineAlpha: Double = js.native
  var fillColor: Double = js.native
  var fillAlpha: Double = js.native
  var fill: Boolean = js.native
  var shape: Circle | Rectangle | Ellipse | Polygon = js.native
  var `type`: Double = js.native

  var _lineTint: Double = js.native
  var _fillTint: Double = js.native
}

@js.native
@JSName("PIXI.Graphics")
class Graphics extends Container {
  var boundsDirty: Boolean = js.native
  var dirty: Boolean = js.native
  var glDirty: Boolean = js.native
  var fillAlpha: Double = js.native
  var lineWidth: Double = js.native
  var lineColor: Double = js.native
  var tint: Double = js.native
  var blendMode: Double = js.native
  var isMask: Boolean = js.native
  var boundsPadding: Double = js.native

  def lineStyle(lineWidth: Double = ???, color: Double = ???, alpha: Double = ???): Graphics = js.native

  def moveTo(x: Double, y: Double): Graphics = js.native

  def lineTo(x: Double, y: Double): Graphics = js.native

  def quadraticCurveTo(cpX: Double, cpY: Double, toX: Double, toY: Double): Graphics = js.native

  def bezierCurveTo(cpX: Double, cpY: Double, cpX2: Double, cpY2: Double, toX: Double, toY: Double): Graphics = js.native

  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native

  def arc(cx: Double, cy: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean = ???): Graphics = js.native

  def beginFill(color: Double, alpha: Double = ???): Graphics = js.native

  def endFill(): Graphics = js.native

  def drawRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native

  def drawRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native

  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native

  def drawEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native

  def drawPolygon(path: js.Array[Double] | js.Array[Point]): Graphics = js.native

  def clear(): Graphics = js.native

  def getBounds(matrix: Matrix = ???): Rectangle = js.native

  def containsPoint(point: Point): Boolean = js.native

  def updateLocalBounds(): Unit = js.native

  def drawShape(shape: Circle | Rectangle | Ellipse | Polygon): GraphicsData = js.native
}

@js.native
@JSName("PIXI.GraphicsRenderer")
class GraphicsRenderer protected() extends ObjectRenderer {
  def this(renderer: WebGLRenderer) = this()

  var buildCircle: js.Function2[Graphics, Object, Unit] = js.native
  var buildPoly: js.Function2[Graphics, Object, Boolean] = js.native
  var buildRectangle: js.Function2[Graphics, Object, Unit] = js.native
  var buildComplexPoly: js.Function2[Graphics, Object, Unit] = js.native
  var buildLine: js.Function2[Graphics, Object, Unit] = js.native
  var updateGraphics: js.Function1[Graphics, Unit] = js.native
  var buildRoundedRectangle: js.Function2[Graphics, Object, Unit] = js.native
  var quadraticBezierCurve: js.Function7[Double, Double, Double, Double, Double, Double, js.Any, js.Array[Double]] = js.native
  var switchMode: js.Function2[WebGLRenderingContext, Double, WebGLGraphicsData] = js.native
}

@js.native
@JSName("PIXI.WebGLGraphicsData")
class WebGLGraphicsData protected() extends js.Object {
  def this(gl: WebGLRenderingContext) = this()

  var upload: js.Function0[Unit] = js.native
  var reset: js.Function0[Unit] = js.native
  var destroy: js.Function0[Unit] = js.native
}

package GroupD8 {

  @JSName("PIXI.GroupD8")
  @js.native
  object GroupD8 extends js.Object {
    def add(rotationSecond: Double, rotationFirst: Double): Double = js.native

    def byDirection(dx: Double, dy: Double): Double = js.native

    def inv(rotation: Double): Double = js.native

    def isSwapWidthHeight(rotation: Double): Boolean = js.native

    def matrixAppendRotationInv(matrix: Matrix, rotation: Double, tx: Double, ty: Double): Unit = js.native

    def rotate180(rotation: Double): Double = js.native

    def sub(rotationSecond: Double, rotationFirst: Double): Double = js.native

    def uX(ind: Double): Double = js.native

    def uY(ind: Double): Double = js.native

    def vX(ind: Double): Double = js.native

    def vY(ind: Double): Double = js.native

    var E: Double = js.native
    var MIRROR_HORIZONTAL: Double = js.native
    var MIRROR_VERTICAL: Double = js.native
    var N: Double = js.native
    var NE: Double = js.native
    var NW: Double = js.native
    var S: Double = js.native
    var SE: Double = js.native
    var SW: Double = js.native
    var W: Double = js.native
  }

}

@js.native
@JSName("PIXI.Point")
class Point protected() extends js.Object {
  def this(x: Double = ???, y: Double = ???) = this()

  var x: Double = js.native
  var y: Double = js.native

  def copy(p: Point): Unit = js.native

  def equals(p: Point): Boolean = js.native

  def set(x: Double = ???, y: Double = ???): Unit = js.native
}

@js.native
@JSName("PIXI.Matrix")
class Matrix extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native

  def fromArray(array: js.Array[Double]): Unit = js.native

  def toArray(transpose: Boolean = ???, out: js.Array[Double] = ???): js.Array[Double] = js.native

  @JSName("apply")
  def apply(pos: Point, newPos: Point = ???): Point = js.native

  def applyInverse(pos: Point, newPos: Point = ???): Point = js.native

  def translate(x: Double, y: Double): Matrix = js.native

  def scale(x: Double, y: Double): Matrix = js.native

  def rotate(angle: Double): Matrix = js.native

  def append(matrix: Matrix): Matrix = js.native

  def prepend(matrix: Matrix): Matrix = js.native

  def invert(): Matrix = js.native

  def identity(): Matrix = js.native

  def copy(matrix: Matrix): Matrix = js.native

  def set(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix = js.native

  def setTransform(a: Double, b: Double, c: Double, d: Double, sr: Double, cr: Double, cy: Double, sy: Double, nsx: Double, cs: Double): Matrix = js.native
}

@js.native
@JSName("PIXI.Matrix")
object Matrix extends js.Object {
  var IDENTITY: Matrix = js.native
  var TEMP_MATRIX: Matrix = js.native
}

@js.native
trait HitArea extends js.Object {
  def contains(x: Double, y: Double): Boolean = js.native
}

@js.native
@JSName("PIXI.Circle")
class Circle protected() extends HitArea {
  def this(x: Double = ???, y: Double = ???, radius: Double = ???) = this()

  var x: Double = js.native
  var y: Double = js.native
  var radius: Double = js.native
  var `type`: Double = js.native

  def getBounds(): Rectangle = js.native
}

@js.native
@JSName("PIXI.Ellipse")
class Ellipse protected() extends HitArea {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???) = this()

  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var `type`: Double = js.native

  def getBounds(): Rectangle = js.native
}

@js.native
@JSName("PIXI.Polygon")
class Polygon protected() extends HitArea {
  def this(points: Point*) = this()

  //def this(points: Double*) = this()

  var closed: Boolean = js.native
  var points: js.Array[Double] = js.native
  var `type`: Double = js.native

}

@js.native
@JSName("PIXI.Rectangle")
class Rectangle protected() extends HitArea {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???) = this()

  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var `type`: Double = js.native

}

@js.native
@JSName("PIXI.Rectangle")
object Rectangle extends js.Object {
  var EMPTY: Rectangle = js.native
}

@js.native
@JSName("PIXI.RoundedRectangle")
class RoundedRectangle protected() extends HitArea {
  def this(x: Double = ???, y: Double = ???, width: Double = ???, height: Double = ???, radius: Double = ???) = this()

  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var radius: Double = js.native
  var `type`: Double = js.native

}

@js.native
trait ParticleContainerProperties extends js.Object {
  var scale: Boolean = js.native
  var position: Boolean = js.native
  var rotation: Boolean = js.native
  var uvs: Boolean = js.native
  var alpha: Boolean = js.native
}

@js.native
@JSName("PIXI.ParticleContainer")
class ParticleContainer protected() extends Container {
  def this(size: Double = ???, properties: ParticleContainerProperties = ???, batchSize: Double = ???) = this()

  var _maxSize: Double = js.native
  var _batchSize: Double = js.native
  var _properties: js.Array[Boolean] = js.native
  var _buffers: js.Array[WebGLBuffer] = js.native
  var _bufferToUpdate: Double = js.native
  var blendMode: Double = js.native
  var roundPixels: Boolean = js.native

  def setProperties(properties: ParticleContainerProperties): Unit = js.native
}

@js.native
trait ParticleBuffer extends js.Object {
  var gl: WebGLRenderingContext = js.native
  var vertSize: Double = js.native
  var vertByteSize: Double = js.native
  var size: Double = js.native
  var dynamicProperties: js.Array[js.Any] = js.native
  var staticProperties: js.Array[js.Any] = js.native
  var staticStride: Double = js.native
  var staticBuffer: js.Any = js.native
  var staticData: js.Any = js.native
  var dynamicStride: Double = js.native
  var dynamicBuffer: js.Any = js.native
  var dynamicData: js.Any = js.native

  def initBuffers(): Unit = js.native

  def bind(): Unit = js.native

  def destroy(): Unit = js.native
}

@js.native
trait IParticleRendererProperty extends js.Object {
  var attribute: Double = js.native
  var size: Double = js.native
  var uploadFunction: js.Function6[js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double, Unit] = js.native
  var offset: Double = js.native
}

@js.native
@JSName("PIXI.ParticleRenderer")
class ParticleRenderer protected() extends ObjectRenderer {
  def this(renderer: WebGLRenderer) = this()

  var generateBuffers: js.Function1[ParticleContainer, js.Array[ParticleBuffer]] = js.native
  var indexBuffer: WebGLBuffer = js.native
  var indices: Uint16Array = js.native
  var properties: js.Array[IParticleRendererProperty] = js.native
  var shader: Shader = js.native
  var tempMatrix: Matrix = js.native
  var uploadAlpha: js.Function6[js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double, Unit] = js.native
  var uploadPosition: js.Function6[js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double, Unit] = js.native
  var uploadRotation: js.Function6[js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double, Unit] = js.native
  var uploadUvs: js.Function6[js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double, Unit] = js.native
  var uploadVertices: js.Function6[js.Array[DisplayObject], Double, Double, js.Array[Double], Double, Double, Unit] = js.native
}

@js.native
trait ParticleShader extends js.Object {
}

@js.native
trait RendererOptions extends js.Object {
  var view: HTMLCanvasElement = js.native
  var transparent: Boolean = js.native
  var antialias: Boolean = js.native
  var resolution: Double = js.native
  var clearBeforeRendering: Boolean = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var forceFXAA: Boolean = js.native
  var roundPixels: Boolean = js.native
  var backgroundColor: Double = js.native
}

object RendererOptions {
  def apply(view: HTMLCanvasElement): RendererOptions = {
    js.Dynamic.literal(view = view).asInstanceOf[RendererOptions]
  }
}

@js.native
@JSName("PIXI.SystemRenderer")
class SystemRenderer protected() extends utils.EventEmitter {
  def this(system: String, width: Double = ???, height: Double = ???, options: RendererOptions = ???) = this()

  var _backgroundColor: Double = js.native
  var _backgroundColorRgb: js.Array[Double] = js.native
  var _backgroundColorString: String = js.native
  var _tempDisplayObjectParent: js.Any = js.native
  var _lastObjectRendered: DisplayObject = js.native
  var `type`: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var view: HTMLCanvasElement = js.native
  var resolution: Double = js.native
  var transparent: Boolean = js.native
  var autoResize: Boolean = js.native
  var blendModes: js.Any = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var clearBeforeRender: Boolean = js.native
  var roundPixels: Boolean = js.native
  var backgroundColor: Double = js.native

  def render(`object`: DisplayObject): Unit = js.native

  def resize(width: Double, height: Double): Unit = js.native

  def destroy(removeView: Boolean = ???): Unit = js.native
}

@js.native
@JSName("PIXI.CanvasRenderer")
class CanvasRenderer protected() extends SystemRenderer {
  def this(width: Double = ???, height: Double = ???, options: RendererOptions = ???) = this()

  def renderDisplayObject(displayObject: DisplayObject, context: CanvasRenderingContext2D): Unit = js.native

  def _mapBlendModes(): Unit = js.native

  var context: CanvasRenderingContext2D = js.native
  var refresh: Boolean = js.native
  var maskManager: CanvasMaskManager = js.native
  var smoothProperty: String = js.native

}

@js.native
@JSName("PIXI.CanvasBuffer")
class CanvasBuffer protected() extends js.Object {
  def this(width: Double, height: Double) = this()

  def clear(): Unit = js.native

  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var width: Double = js.native
  var height: Double = js.native

  def resize(width: Double, height: Double): Unit = js.native

  def destroy(): Unit = js.native
}

package CanvasGraphics {

  @JSName("PIXI.CanvasGraphics")
  @js.native
  object CanvasGraphics extends js.Object {
    def renderGraphicsMask(graphics: Graphics, context: CanvasRenderingContext2D): Unit = js.native

    def updateGraphicsTint(graphics: Graphics): Unit = js.native

    def renderGraphics(graphics: Graphics, context: CanvasRenderingContext2D): Unit = js.native
  }

}

@js.native
@JSName("PIXI.CanvasMaskManager")
class CanvasMaskManager extends js.Object {
  def pushMask(maskData: js.Any, renderer: WebGLRenderer | CanvasRenderer): Unit = js.native

  def popMask(renderer: WebGLRenderer | CanvasRenderer): Unit = js.native

  def destroy(): Unit = js.native
}

package CanvasTinter {

  @JSName("PIXI.CanvasTinter")
  @js.native
  object CanvasTinter extends js.Object {
    def getTintedTexture(sprite: DisplayObject, color: Double): HTMLCanvasElement = js.native

    def tintWithMultiply(texture: Texture, color: Double, canvas: HTMLDivElement): Unit = js.native

    def tintWithOverlay(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native

    def tintWithPerPixel(texture: Texture, color: Double, canvas: HTMLCanvasElement): Unit = js.native

    def roundColor(color: Double): Double = js.native

    var cacheStepsPerColorChannel: Double = js.native
    var convertTintToImage: Boolean = js.native
    var vanUseMultiply: Boolean = js.native
    var tintMethod: js.Function = js.native
  }

}

@js.native
@JSName("PIXI.WebGLRenderer")
class WebGLRenderer protected() extends SystemRenderer {
  def this(width: Double = ???, height: Double = ???, options: RendererOptions = ???) = this()

  var _useFXAA: Boolean = js.native
  var _FXAAFilter: FXAAFilter = js.native
  var _contextOptions: js.Any = js.native
  var _renderTargetStack: js.Array[RenderTarget] = js.native

  def _initContext(): Unit = js.native

  def _createContext(): Unit = js.native

  //var handleContextLost: js.Function1[WebGLContextEvent, Unit] = js.native

  def _mapGlModes(): Unit = js.native

  var _managedTextures: js.Array[Texture] = js.native
  var drawCount: Double = js.native
  var shaderManager: ShaderManager = js.native
  var maskManager: MaskManager = js.native
  var stencilManager: StencilManager = js.native
  var filterManager: FilterManager = js.native
  var blendModeManager: BlendModeManager = js.native
  var currentRenderTarget: RenderTarget = js.native
  var currentRenderer: ObjectRenderer = js.native

  def renderDisplayObject(displayObject: DisplayObject, renderTarget: RenderTarget, clear: Boolean): Unit = js.native

  def setObjectRenderer(objectRenderer: ObjectRenderer): Unit = js.native

  def setRenderTarget(renderTarget: RenderTarget): Unit = js.native

  def updateTexture(texture: BaseTexture | Texture): BaseTexture | Texture = js.native

  def destroyTexture(texture: BaseTexture | Texture, _skipRemove: Boolean = ???): Unit = js.native
}

@js.native
@JSName("PIXI.AbstractFilter")
class AbstractFilter protected() extends js.Object {
  def this(vertexSrc: String | js.Array[String] = ???, fragmentSrc: String | js.Array[String] = ???, uniforms: js.Any = ???) = this()

  var vertexSrc: js.Array[String] = js.native
  var fragmentSrc: js.Array[String] = js.native
  var uniforms: js.Any = js.native
  var padding: Double = js.native

  def getShader(renderer: WebGLRenderer): Shader = js.native

  def applyFilter(renderer: WebGLRenderer, input: RenderTarget, output: RenderTarget, clear: Boolean = ???): Unit = js.native

  def syncUniform(uniform: WebGLUniformLocation): Unit = js.native
}

@js.native
@JSName("PIXI.SpriteMaskFilter")
class SpriteMaskFilter protected() extends AbstractFilter {
  def this(sprite: Sprite) = this()

  var maskSprite: Sprite = js.native
  var maskMatrix: Matrix = js.native

  def applyFilter(renderer: WebGLRenderbuffer, input: RenderTarget, output: RenderTarget): Unit = js.native

  var map: Texture = js.native
  var offset: Point = js.native
}

@js.native
@JSName("PIXI.FXAAFilter")
class FXAAFilter extends AbstractFilter {
  def applyFilter(renderer: WebGLRenderer, input: RenderTarget, output: RenderTarget): Unit = js.native
}

@js.native
@JSName("PIXI.BlendModeManager")
class BlendModeManager protected() extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()

  def setBlendMode(blendMode: Double): Boolean = js.native
}

@js.native
@JSName("PIXI.FilterManager")
class FilterManager protected() extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()

  var filterStack: js.Array[js.Any] = js.native
  var texturePool: js.Array[js.Any] = js.native

  def setFilterStack(filterStack: js.Array[js.Any]): Unit = js.native

  def pushFilter(target: RenderTarget, filters: js.Array[js.Any]): Unit = js.native

  def popFilter(): AbstractFilter = js.native

  def getRenderTarget(clear: Boolean = ???): RenderTarget = js.native

  def returnRenderTarget(renderTarget: RenderTarget): Unit = js.native

  def applyFilter(shader: Shader | AbstractFilter, inputTarget: RenderTarget, outputTarget: RenderTarget, clear: Boolean = ???): Unit = js.native

  def calculateMappedMatrix(filterArea: Rectangle, sprite: Sprite, outputMatrix: Matrix = ???): Matrix = js.native

  def capFilterArea(filterArea: Rectangle): Unit = js.native

  def resize(width: Double, height: Double): Unit = js.native
}

@js.native
@JSName("PIXI.MaskManager")
class MaskManager extends WebGLManager {
  var stencilStack: StencilMaskStack = js.native
  var reverse: Boolean = js.native
  var count: Double = js.native
  var alphaMaskPool: js.Array[js.Any] = js.native

  def pushMask(target: RenderTarget, maskData: js.Any): Unit = js.native

  def popMask(target: RenderTarget, maskData: js.Any): Unit = js.native

  def pushSpriteMask(target: RenderTarget, maskData: js.Any): Unit = js.native

  def popSpriteMask(): Unit = js.native

  def pushStencilMask(target: RenderTarget, maskData: js.Any): Unit = js.native

  def popStencilMask(target: RenderTarget, maskData: js.Any): Unit = js.native
}

@js.native
@JSName("PIXI.ShaderManager")
class ShaderManager protected() extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()

  var _currentId: Double = js.native
  var currentShader: Shader = js.native
  var maxAttibs: Double = js.native
  var attribState: js.Array[js.Any] = js.native
  var tempAttribState: js.Array[js.Any] = js.native
  var stack: js.Array[js.Any] = js.native

  def setAttribs(attribs: js.Array[js.Any]): Unit = js.native

  def setShader(shader: Shader): Boolean = js.native
}

@js.native
@JSName("PIXI.StencilManager")
class StencilManager protected() extends WebGLManager {
  def this(renderer: WebGLRenderer) = this()

  def setMaskStack(stencilMaskStack: StencilMaskStack): Unit = js.native

  def pushStencil(graphics: Graphics, webGLData: WebGLGraphicsData): Unit = js.native

  def bindGraphics(graphics: Graphics, webGLData: WebGLGraphicsData): Unit = js.native

  def popStencil(graphics: Graphics, webGLData: WebGLGraphicsData): Unit = js.native

  def pushMask(maskData: js.Array[js.Any]): Unit = js.native

  def popMask(maskData: js.Array[js.Any]): Unit = js.native
}

@js.native
@JSName("PIXI.WebGLManager")
class WebGLManager protected() extends js.Object {
  def this(renderer: WebGLRenderer) = this()

  var onContextChange: js.Function0[Unit] = js.native
  var renderer: WebGLRenderer = js.native

  def destroy(): Unit = js.native
}

@js.native
@JSName("PIXI.Shader")
class Shader protected() extends js.Object {
  def this(shaderManager: ShaderManager, vertexSrc: String, fragmentSrc: String, uniforms: js.Any, attributes: js.Any) = this()

  var attributes: js.Any = js.native
  var textureCount: Double = js.native
  var uniforms: js.Any = js.native

  def _glCompile(`type`: js.Any, src: js.Any): Shader = js.native

  var uid: Double = js.native
  var gl: WebGLRenderingContext = js.native
  var shaderManager: ShaderManager = js.native
  var program: WebGLProgram = js.native
  var vertexSrc: String = js.native
  var fragmentSrc: String = js.native

  def init(): Unit = js.native

  def cacheUniformLocations(keys: js.Array[String]): Unit = js.native

  def cacheAttributeLocations(keys: js.Array[String]): Unit = js.native

  def compile(): WebGLProgram = js.native

  def syncUniform(uniform: js.Any): Unit = js.native

  def syncUniforms(): Unit = js.native

  def initSampler2D(uniform: js.Any): Unit = js.native

  def destroy(): Unit = js.native
}

@js.native
@JSName("PIXI.ComplexPrimitiveShader")
class ComplexPrimitiveShader protected() extends Shader {
  def this(shaderManager: ShaderManager) = this()
}

@js.native
@JSName("PIXI.PrimitiveShader")
class PrimitiveShader protected() extends Shader {
  def this(shaderManager: ShaderManager) = this()
}

@js.native
@JSName("PIXI.TextureShader")
class TextureShader protected() extends Shader {
  def this(shaderManager: ShaderManager, vertexSrc: String = ???, fragmentSrc: String = ???, customUniforms: js.Any = ???, customAttributes: js.Any = ???) = this()
}

@js.native
trait StencilMaskStack extends js.Object {
  var stencilStack: js.Array[js.Any] = js.native
  var reverse: Boolean = js.native
  var count: Double = js.native
}

@js.native
@JSName("PIXI.ObjectRenderer")
class ObjectRenderer extends WebGLManager {
  def start(): Unit = js.native

  def stop(): Unit = js.native

  def flush(): Unit = js.native

  def render(`object`: js.Any = ???): Unit = js.native
}

@js.native
@JSName("PIXI.RenderTarget")
class RenderTarget protected() extends js.Object {
  def this(gl: WebGLRenderingContext, width: Double, height: Double, scaleMode: Double, resolution: Double, root: Boolean) = this()

  var gl: WebGLRenderingContext = js.native
  var frameBuffer: WebGLFramebuffer = js.native
  var texture: Texture = js.native
  var size: Rectangle = js.native
  var resolution: Double = js.native
  var projectionMatrix: Matrix = js.native
  var transform: Matrix = js.native
  var frame: Rectangle = js.native
  var stencilBuffer: WebGLRenderbuffer = js.native
  var stencilMaskStack: StencilMaskStack = js.native
  var filterStack: js.Array[js.Any] = js.native
  var scaleMode: Double = js.native
  var root: Boolean = js.native

  def clear(bind: Boolean = ???): Unit = js.native

  def attachStencilBuffer(): Unit = js.native

  def activate(): Unit = js.native

  def calculateProjection(protectionFrame: Matrix): Unit = js.native

  def resize(width: Double, height: Double): Unit = js.native

  def destroy(): Unit = js.native
}

@js.native
trait Quad extends js.Object {
  var gl: WebGLRenderingContext = js.native
  var vertices: js.Array[Double] = js.native
  var uvs: js.Array[Double] = js.native
  var colors: js.Array[Double] = js.native
  var indices: js.Array[Double] = js.native
  var vertexBuffer: WebGLBuffer = js.native
  var indexBuffer: WebGLBuffer = js.native

  def map(rect: Rectangle, rect2: Rectangle): Unit = js.native

  def upload(): Unit = js.native

  def destroy(): Unit = js.native
}

@js.native
@JSName("PIXI.Sprite")
class Sprite protected() extends Container {
  def this(texture: Texture = ???) = this()

  var _texture: Texture = js.native
  var _width: Double = js.native
  var _height: Double = js.native
  var cachedTint: Double = js.native

  def _onTextureUpdate(): Unit = js.native

  var anchor: Point = js.native
  var tint: Double = js.native
  var blendMode: Double = js.native
  var shader: Shader | AbstractFilter = js.native
  var texture: Texture = js.native

  def getBounds(matrix: Matrix = ???): Rectangle = js.native

  def containsPoint(point: Point): Boolean = js.native

  def destroy(destroyTexture: Boolean, destroyBaseTexture: Boolean): Unit = js.native
}

@js.native
@JSName("PIXI.Sprite")
object Sprite extends js.Object {
  def fromFrame(frameId: String): Sprite = js.native

  def fromImage(imageId: String, crossorigin: Boolean = ???, scaleMode: Double = ???): Sprite = js.native
}

@js.native
@JSName("PIXI.SpriteRenderer")
class SpriteRenderer extends ObjectRenderer {
  def renderBatch(texture: Texture, size: Double, startIndex: Double): Unit = js.native

  var vertSize: Double = js.native
  var vertByteSize: Double = js.native
  var size: Double = js.native
  var vertices: js.Array[Double] = js.native
  var positions: js.Array[Double] = js.native
  var colors: js.Array[Double] = js.native
  var indices: js.Array[Double] = js.native
  var currentBatchSize: Double = js.native
  var sprites: js.Array[Sprite] = js.native
  var shader: Shader | AbstractFilter = js.native

  def render(sprite: Sprite): Unit = js.native
}

@js.native
trait TextStyle extends js.Object {
  var font: String = js.native
  var fill: String | Double | CanvasGradient | CanvasPattern = js.native
  var align: String = js.native
  var stroke: String | Double = js.native
  var strokeThickness: Double = js.native
  var wordWrap: Boolean = js.native
  var wordWrapWidth: Double = js.native
  var letterSpacing: Double = js.native
  var breakWords: Boolean = js.native
  var lineHeight: Double = js.native
  var dropShadow: Boolean = js.native
  var dropShadowColor: String | Double = js.native
  var dropShadowAngle: Double = js.native
  var dropShadowDistance: Double = js.native
  var dropShadowBlur: Double = js.native
  var padding: Double = js.native
  var textBaseline: String = js.native
  var lineJoin: String = js.native
  var miterLimit: Double = js.native
}

@js.native
@JSName("PIXI.Text")
class Text protected() extends Sprite {
  def this(text: String = ???, style: TextStyle = ???, resolution: Double = ???) = this()

  var _text: String = js.native
  var _style: TextStyle = js.native

  def updateText(): Unit = js.native

  def updateTexture(): Unit = js.native

  def drawLetterSpacing(text: String, x: Double, y: Double, isStroke: Boolean): Unit = js.native

  def determineFontProperties(fontStyle: TextStyle): TextStyle = js.native

  def wordWrap(text: String): Boolean = js.native

  var canvas: HTMLCanvasElement = js.native
  var context: CanvasRenderingContext2D = js.native
  var dirty: Boolean = js.native
  var resolution: Double = js.native
  var text: String = js.native
  var style: TextStyle = js.native
}

@js.native
@JSName("PIXI.Text")
object Text extends js.Object {
  var fontPropertiesCache: js.Any = js.native
  var fontPropertiesCanvas: HTMLCanvasElement = js.native
  var fontPropertiesContext: CanvasRenderingContext2D = js.native
}

@js.native
@JSName("PIXI.BaseTexture")
class BaseTexture protected() extends utils.EventEmitter {
  def this(source: HTMLImageElement | HTMLCanvasElement, scaleMode: Double = ???, resolution: Double = ???) = this()

  var _glTextures: js.Any = js.native

  def _sourceLoaded(): Unit = js.native

  var uuid: Double = js.native
  var resolution: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var realWidth: Double = js.native
  var realHeight: Double = js.native
  var scaleMode: Double = js.native
  var hasLoaded: Boolean = js.native
  var isLoading: Boolean = js.native
  var source: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement = js.native
  var premultipliedAlpha: Boolean = js.native
  var imageUrl: String = js.native
  var isPowerOfTwo: Boolean = js.native
  var mipmap: Boolean = js.native

  def update(): Unit = js.native

  def loadSource(source: HTMLImageElement | HTMLCanvasElement): Unit = js.native

  def destroy(): Unit = js.native

  def dispose(): Unit = js.native

  def updateSourceImage(newSrc: String): Unit = js.native

}

@js.native
@JSName("PIXI.BaseTexture")
object BaseTexture extends js.Object {
  def fromImage(imageUrl: String, crossorigin: Boolean = ???, scaleMode: Double = ???): BaseTexture = js.native

  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double = ???): BaseTexture = js.native
}

@js.native
@JSName("PIXI.RenderTexture")
class RenderTexture protected() extends Texture {
  def this(renderer: CanvasRenderer | WebGLRenderer, width: Double = ???, height: Double = ???, scaleMode: Double = ???, resolution: Double = ???) = this()

  def renderWebGL(displayObject: DisplayObject, matrix: Matrix = ???, clear: Boolean = ???, updateTransform: Boolean = ???): Unit = js.native

  def renderCanvas(displayObject: DisplayObject, matrix: Matrix = ???, clear: Boolean = ???, updateTransform: Boolean = ???): Unit = js.native

  var resolution: Double = js.native
  var renderer: CanvasRenderer | WebGLRenderer = js.native

  def render(displayObject: DisplayObject, matrix: Matrix = ???, clear: Boolean = ???, updateTransform: Boolean = ???): Unit = js.native

  def resize(width: Double, height: Double, updateBase: Boolean = ???): Unit = js.native

  def clear(): Unit = js.native

  def destroy(): Unit = js.native

  def getImage(): HTMLImageElement = js.native

  def getPixels(): js.Array[Double] = js.native

  def getPixel(x: Double, y: Double): js.Array[Double] = js.native

  def getBase64(): String = js.native

  def getCanvas(): HTMLCanvasElement = js.native
}

@js.native
@JSName("PIXI.Texture")
class Texture protected() extends utils.EventEmitter {
  def this(baseTexture: BaseTexture, frame: Rectangle = ???, crop: Rectangle = ???, trim: Rectangle = ???, rotate: Double = ???) = this()

  var _frame: Rectangle = js.native
  var _uvs: TextureUvs = js.native

  def onBaseTextureUpdated(baseTexture: BaseTexture): Unit = js.native

  def onBaseTextureLoaded(baseTexture: BaseTexture): Unit = js.native

  def _updateUvs(): Unit = js.native

  var noFrame: Boolean = js.native
  var baseTexture: BaseTexture = js.native
  var trim: Rectangle = js.native
  var valid: Boolean = js.native
  var requiresUpdate: Boolean = js.native
  var width: Double = js.native
  var height: Double = js.native
  var crop: Rectangle = js.native
  var rotate: Double = js.native
  var frame: Rectangle = js.native

  def update(): Unit = js.native

  def destroy(destroyBase: Boolean = ???): Unit = js.native

}

@js.native
@JSName("PIXI.Texture")
object Texture extends js.Object {
  def fromImage(imageUrl: String, crossOrigin: Boolean = ???, scaleMode: Double = ???): Texture = js.native

  def fromFrame(frameId: String): Texture = js.native

  def fromCanvas(canvas: HTMLCanvasElement, scaleMode: Double = ???): Texture = js.native

  def fromVideo(video: HTMLVideoElement | String, scaleMode: Double = ???): Texture = js.native

  def fromVideoUrl(videoUrl: String, scaleMode: Double = ???): Texture = js.native

  def addTextureToCache(texture: Texture, id: String): Unit = js.native

  def removeTextureFromCache(id: String): Texture = js.native

  var EMPTY: Texture = js.native
}

@js.native
@JSName("PIXI.TextureUvs")
class TextureUvs extends js.Object {
  var x0: Double = js.native
  var y0: Double = js.native
  var x1: Double = js.native
  var y1: Double = js.native
  var x2: Double = js.native
  var y2: Double = js.native
  var x3: Double = js.native
  var y3: Double = js.native

  def set(frame: Rectangle, baseFrame: Rectangle, rotate: Double): Unit = js.native
}

@js.native
@JSName("PIXI.VideoBaseTexture")
class VideoBaseTexture protected() extends BaseTexture {
  def this(source: HTMLVideoElement, scaleMode: Double = ???) = this()

  var _loaded: Boolean = js.native

  def _onUpdate(): Unit = js.native

  def _onPlayStart(): Unit = js.native

  def _onPlayStop(): Unit = js.native

  def _onCanPlay(): Unit = js.native

  var autoUpdate: Boolean = js.native

}

@js.native
@JSName("PIXI.VideoBaseTexture")
object VideoBaseTexture extends js.Object {
  def fromVideo(video: HTMLVideoElement, scaleMode: Double = ???): VideoBaseTexture = js.native

  def fromUrl(videoSrc: String | js.Any | js.Array[String] | js.Array[js.Any]): VideoBaseTexture = js.native
}

package utils {

  @js.native
  @JSName("PIXI.utils.EventEmitter")
  class EventEmitter extends js.Object {
    def listeners(event: String): js.Array[js.Function] = js.native

    def emit(event: String, args: js.Any*): Boolean = js.native

    def on(event: String, fn: js.Function, context: js.Any = ???): EventEmitter = js.native

    def once(event: String, fn: js.Function, context: js.Any = ???): EventEmitter = js.native

    def removeListener(event: String, fn: js.Function, context: js.Any = ???, once: Boolean = ???): EventEmitter = js.native

    def removeAllListeners(event: String): EventEmitter = js.native

    def off(event: String, fn: js.Function, context: js.Any = ???, once: Boolean = ???): EventEmitter = js.native

    def addListener(event: String, fn: js.Function, context: js.Any = ???): EventEmitter = js.native
  }

  @JSName("PIXI.utils")
  @js.native
  object Utils extends js.Object {
    def uuid(): Double = js.native

    def hex2rgb(hex: Double, out: js.Array[Double] = ???): js.Array[Double] = js.native

    def hex2string(hex: Double): String = js.native

    def rgb2hex(rgb: js.Array[Number]): Double = js.native

    def canUseNewCanvasBlendModes(): Boolean = js.native

    def getNextPowerOfTwo(number: Double): Double = js.native

    def isPowerOfTwo(width: Double, height: Double): Boolean = js.native

    def getResolutionOfUrl(url: String): Double = js.native

    def sayHello(`type`: String): Unit = js.native

    def isWebGLSupported(): Boolean = js.native

    def sign(n: Double): Double = js.native

    def removeItems[T](arr: js.Array[T], startIdx: Double, removeCount: Double): Unit = js.native

    var TextureCache: js.Any = js.native
    var BaseTextureCache: js.Any = js.native
  }

}

package extras {

  @js.native
  trait BitmapTextStyle extends js.Object {
    var font: String | js.Any = js.native
    var align: String = js.native
    var tint: Double = js.native
  }

  @js.native
  @JSName("PIXI.extras.BitmapText")
  class BitmapText protected() extends Container {
    def this(text: String, style: BitmapTextStyle = ???) = this()

    var _glyphs: js.Array[Sprite] = js.native
    var _font: String | js.Any = js.native
    var _text: String = js.native

    def updateText(): Unit = js.native

    var textWidth: Double = js.native
    var textHeight: Double = js.native
    var maxWidth: Double = js.native
    var maxLineHeight: Double = js.native
    var dirty: Boolean = js.native
    var tint: Double = js.native
    var align: String = js.native
    var font: String | js.Any = js.native
    var text: String = js.native
  }

  @js.native
  @JSName("PIXI.extras.BitmapText")
  object BitmapText extends js.Object {
    var fonts: js.Any = js.native
  }

  @js.native
  @JSName("PIXI.extras.MovieClip")
  class MovieClip protected() extends Sprite {
    def this(textures: js.Array[Texture] | js.Array[js.Any]) = this()

    var _textures: js.Array[Texture] = js.native
    var _durations: js.Array[Double] = js.native
    var _currentTime: Double = js.native

    def update(deltaTime: Double): Unit = js.native

    var animationSpeed: Double = js.native
    var loop: Boolean = js.native
    var onComplete: js.Function0[Unit] = js.native
    var currentFrame: Double = js.native
    var playing: Boolean = js.native
    var totalFrames: Double = js.native
    var textures: js.Array[Texture] | js.Array[js.Any] = js.native

    def stop(): Unit = js.native

    def play(): Unit = js.native

    def gotoAndStop(frameName: Double): Unit = js.native

    def gotoAndPlay(frameName: Double): Unit = js.native

  }

  @js.native
  @JSName("PIXI.extras.MovieClip")
  object MovieClip extends js.Object {
    def fromFrames(frame: js.Array[String]): MovieClip = js.native

    def fromImages(images: js.Array[String]): MovieClip = js.native
  }

  @js.native
  @JSName("PIXI.extras.TilingSprite")
  class TilingSprite protected() extends Sprite {
    def this(texture: Texture, width: Double, height: Double) = this()

    var _tileScaleOffset: Point = js.native
    var _tilingTexture: Boolean = js.native
    var _refreshTexture: Boolean = js.native
    var _uvs: js.Array[TextureUvs] = js.native
    var tileScale: Point = js.native
    var tilePosition: Point = js.native
    var originalTexture: Texture = js.native

    def generateTilingTexture(renderer: WebGLRenderer | CanvasRenderer, texture: Texture, forcePowerOfTwo: Boolean = ???): Texture = js.native

  }

  @js.native
  @JSName("PIXI.extras.TilingSprite")
  object TilingSprite extends js.Object {
    def fromFrame(frameId: String): Sprite = js.native

    def fromImage(imageId: String, crossorigin: Boolean, scaleMode: Double): Sprite = js.native

    def fromFrame(frameId: String, width: Double, height: Double): TilingSprite = js.native

    def fromImage(imageId: String, width: Double, height: Double, crossorigin: Boolean, scaleMode: Double): TilingSprite = js.native
  }

}

package filters {

  @js.native
  @JSName("PIXI.filters.AsciiFilter")
  class AsciiFilter extends AbstractFilter {
    var size: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.BloomFilter")
  class BloomFilter extends AbstractFilter {
    var blur: Double = js.native
    var blurX: Double = js.native
    var blurY: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.BlurFilter")
  class BlurFilter extends AbstractFilter {
    var blurXFilter: BlurXFilter = js.native
    var blurYFilter: BlurYFilter = js.native
    var blur: Double = js.native
    var passes: Double = js.native
    var blurX: Double = js.native
    var blurY: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.BlurXFilter")
  class BlurXFilter extends AbstractFilter {
    var passes: Double = js.native
    var strength: Double = js.native
    var blur: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.BlurYFilter")
  class BlurYFilter extends AbstractFilter {
    var passes: Double = js.native
    var strength: Double = js.native
    var blur: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.SmartBlurFilter")
  class SmartBlurFilter extends AbstractFilter {
  }

  @js.native
  @JSName("PIXI.filters.ColorMatrixFilter")
  class ColorMatrixFilter extends AbstractFilter {
    def _loadMatrix(matrix: js.Array[Double], multiply: Boolean): Unit = js.native

    def _multiply(out: js.Array[Double], a: js.Array[Double], b: js.Array[Double]): Unit = js.native

    def _colorMatrix(matrix: js.Array[Double]): Unit = js.native

    var matrix: js.Array[Double] = js.native

    def brightness(b: Double, multiply: Boolean = ???): Unit = js.native

    def greyscale(scale: Double, multiply: Boolean = ???): Unit = js.native

    def blackAndWhite(multiply: Boolean = ???): Unit = js.native

    def hue(rotation: Double, multiply: Boolean = ???): Unit = js.native

    def contrast(amount: Double, multiply: Boolean = ???): Unit = js.native

    def saturate(amount: Double, multiply: Boolean = ???): Unit = js.native

    def desaturate(multiply: Boolean = ???): Unit = js.native

    def negative(multiply: Boolean = ???): Unit = js.native

    def sepia(multiply: Boolean = ???): Unit = js.native

    def technicolor(multiply: Boolean = ???): Unit = js.native

    def polaroid(multiply: Boolean = ???): Unit = js.native

    def toBGR(multiply: Boolean = ???): Unit = js.native

    def kodachrome(multiply: Boolean = ???): Unit = js.native

    def browni(multiply: Boolean = ???): Unit = js.native

    def vintage(multiply: Boolean = ???): Unit = js.native

    def colorTone(desaturation: Double, toned: Double, lightColor: String, darkColor: String, multiply: Boolean = ???): Unit = js.native

    def night(intensity: Double, multiply: Boolean = ???): Unit = js.native

    def predator(amount: Double, multiply: Boolean = ???): Unit = js.native

    def lsd(multiply: Boolean = ???): Unit = js.native

    def reset(): Unit = js.native
  }

  @js.native
  @JSName("PIXI.filters.ColorStepFilter")
  class ColorStepFilter extends AbstractFilter {
    var step: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.ConvolutionFilter")
  class ConvolutionFilter protected() extends AbstractFilter {
    def this(matrix: js.Array[Double], width: Double, height: Double) = this()

    var matrix: js.Array[Double] = js.native
    var width: Double = js.native
    var height: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.CrossHatchFilter")
  class CrossHatchFilter extends AbstractFilter {
  }

  @js.native
  @JSName("PIXI.filters.DisplacementFilter")
  class DisplacementFilter protected() extends AbstractFilter {
    def this(sprite: Sprite, scale: Double = ???) = this()

    var map: Texture = js.native
    var scale: Point = js.native
  }

  @js.native
  @JSName("PIXI.filters.DotScreenFilter")
  class DotScreenFilter extends AbstractFilter {
    var scale: Double = js.native
    var angle: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.BlurYTintFilter")
  class BlurYTintFilter extends AbstractFilter {
    var blur: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.DropShadowFilter")
  class DropShadowFilter extends AbstractFilter {
    var blur: Double = js.native
    var blurX: Double = js.native
    var blurY: Double = js.native
    var color: Double = js.native
    var alpha: Double = js.native
    var distance: Double = js.native
    var angle: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.GrayFilter")
  class GrayFilter extends AbstractFilter {
    var gray: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.InvertFilter")
  class InvertFilter extends AbstractFilter {
    var invert: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.NoiseFilter")
  class NoiseFilter extends AbstractFilter {
    var noise: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.PixelateFilter")
  class PixelateFilter extends AbstractFilter {
    var size: Point = js.native
  }

  @js.native
  @JSName("PIXI.filters.RGBSplitFilter")
  class RGBSplitFilter extends AbstractFilter {
    var red: Point = js.native
    var green: Point = js.native
    var blue: Point = js.native
  }

  @js.native
  @JSName("PIXI.filters.SepiaFilter")
  class SepiaFilter extends AbstractFilter {
    var sepia: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.ShockwaveFilter")
  class ShockwaveFilter extends AbstractFilter {
    var center: js.Array[Double] = js.native
    var params: js.Any = js.native
    var time: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.TiltShiftAxisFilter")
  class TiltShiftAxisFilter extends AbstractFilter {
    var blur: Double = js.native
    var gradientBlur: Double = js.native
    var start: Double = js.native
    var end: Double = js.native

    def updateDelta(): Unit = js.native
  }

  @js.native
  @JSName("PIXI.filters.TiltShiftFilter")
  class TiltShiftFilter extends AbstractFilter {
    var blur: Double = js.native
    var gradientBlur: Double = js.native
    var start: Double = js.native
    var end: Double = js.native
  }

  @js.native
  @JSName("PIXI.filters.TiltShiftXFilter")
  class TiltShiftXFilter extends AbstractFilter {
    def updateDelta(): Unit = js.native
  }

  @js.native
  @JSName("PIXI.filters.TiltShiftYFilter")
  class TiltShiftYFilter extends AbstractFilter {
    def updateDelta(): Unit = js.native
  }

  @js.native
  @JSName("PIXI.filters.TwistFilter")
  class TwistFilter extends AbstractFilter {
    var offset: Point = js.native
    var radius: Double = js.native
    var angle: Double = js.native
  }

}

package interaction {

  @js.native
  trait InteractionEvent extends js.Object {
    var stopped: Boolean = js.native
    var target: js.Any = js.native
    var `type`: String = js.native
    var data: InteractionData = js.native

    def stopPropagation(): Unit = js.native
  }

  @js.native
  @JSName("PIXI.interaction.InteractionData")
  class InteractionData extends js.Object {
    var global: Point = js.native
    var target: DisplayObject = js.native
    var originalEvent: Event = js.native

    def getLocalPosition(displayObject: DisplayObject, point: Point = ???, globalPos: Point = ???): Point = js.native
  }

  @js.native
  @JSName("PIXI.interaction.InteractionManager")
  class InteractionManager protected() extends js.Object {
    def this(renderer: CanvasRenderer | WebGLRenderer, options: js.Any = ???) = this()

    var interactionDOMElement: HTMLElement = js.native
    var eventsAdded: Boolean = js.native
    var moveWhenInside: Boolean = js.native
    var _tempPoint: Point = js.native

    def setTargetElement(element: HTMLElement, resolution: Double): Unit = js.native

    def addEvents(): Unit = js.native

    def removeEvents(): Unit = js.native

    def dispatchEvent(displayObject: DisplayObject, eventString: String, eventData: js.Any): Unit = js.native

    var onMouseDown: js.Function1[Event, Unit] = js.native
    var processMouseDown: js.Function2[DisplayObject, Boolean, Unit] = js.native
    var onMouseUp: js.Function1[Event, Unit] = js.native
    var processMouseUp: js.Function2[DisplayObject, Boolean, Unit] = js.native
    var onMouseMove: js.Function1[Event, Unit] = js.native
    var processMouseMove: js.Function2[DisplayObject, Boolean, Unit] = js.native
    var onMouseOut: js.Function1[Event, Unit] = js.native
    var processMouseOverOut: js.Function2[DisplayObject, Boolean, Unit] = js.native
    var onTouchStart: js.Function1[Event, Unit] = js.native
    var processTouchStart: js.Function2[DisplayObject, Boolean, Unit] = js.native
    var onTouchEnd: js.Function1[Event, Unit] = js.native
    var processTouchEnd: js.Function2[DisplayObject, Boolean, Unit] = js.native
    var onTouchMove: js.Function1[Event, Unit] = js.native
    var processTouchMove: js.Function2[DisplayObject, Boolean, Unit] = js.native

    def getTouchData(touchEvent: InteractionData): InteractionData = js.native

    def returnTouchData(touchData: InteractionData): Unit = js.native

    var renderer: CanvasRenderer | WebGLRenderer = js.native
    var autoPreventDefault: Boolean = js.native
    var interactionFrequency: Double = js.native
    var mouse: InteractionData = js.native
    var eventData: js.Any = js.native
    var interactiveDataPool: js.Array[InteractionData] = js.native
    var last: Double = js.native
    var currentCursorStyle: String = js.native
    var resolution: Double = js.native

    def update(deltaTime: Double): Unit = js.native

    def mapPositionToPoint(point: Point, x: Double, y: Double): Unit = js.native

    def processInteractive(point: Point, displayObject: DisplayObject, func: js.Function2[DisplayObject, Boolean, Unit], hitTest: Boolean, interactive: Boolean): Boolean = js.native

    def destroy(): Unit = js.native
  }

  @js.native
  trait InteractiveTarget extends js.Object {
    var interactive: Boolean = js.native
    var buttonMode: Boolean = js.native
    var interactiveChildren: Boolean = js.native
    var defaultCursor: String = js.native
    var hitArea: HitArea = js.native
  }

}

package loaders {

  import scala.scalajs.js.annotation.JSBracketAccess

  @js.native
  trait LoaderOptions extends js.Object {
    var crossOrigin: Boolean | String = js.native
    var loadType: Double = js.native
    var xhrType: String = js.native
    var metaData: js.Any = js.native
  }

  @js.native
  trait ResourceDictionary extends js.Object {
    @JSBracketAccess
    def apply(index: String): loaders.Resource = js.native

    @JSBracketAccess
    def update(index: String, v: loaders.Resource): Unit = js.native
  }

  @js.native
  @JSName("PIXI.loaders.Loader")
  class Loader protected() extends utils.EventEmitter {
    def this(baseUrl: String, concurrency: Double) = this()

    var baseUrl: String = js.native
    var progress: Double = js.native
    var loading: Boolean = js.native
    var resources: ResourceDictionary = js.native

    def add(name: String, url: String, options: LoaderOptions, cb: js.Function0[Unit]): Loader = js.native

    def add(url: String, options: LoaderOptions, cb: js.Function0[Unit]): Loader = js.native

    def add(obj: js.Any, options: LoaderOptions, cb: js.Function0[Unit]): Loader = js.native

    def before(fn: js.Function): Loader = js.native

    def pre(fn: js.Function): Loader = js.native

    def after(fn: js.Function): Loader = js.native

    def use(fn: js.Function): Loader = js.native

    def reset(): Unit = js.native

    def load(cb: js.Function2[loaders.Loader, js.Any, Unit] = ???): Loader = js.native
  }

  @js.native
  @JSName("PIXI.loaders.Loader")
  object Loader extends js.Object {
    var _pixiMiddleware: js.Array[js.Function] = js.native

    def addPixiMiddleware(fn: js.Function): Unit = js.native
  }

  @js.native
  trait TextureDictionary extends js.Object {
    @JSBracketAccess
    def apply(index: String): Texture = js.native

    @JSBracketAccess
    def update(index: String, v: Texture): Unit = js.native
  }

  @js.native
  @JSName("PIXI.loaders.Resource")
  class Resource protected() extends utils.EventEmitter {
    def this(name: String = ???, url: String | js.Array[String] = ???, options: LoaderOptions = ???) = this()

    var name: String = js.native
    var texture: Texture = js.native
    var textures: TextureDictionary = js.native
    var url: String = js.native
    var data: js.Any = js.native
    var crossOrigin: Boolean | String = js.native
    var loadType: Double = js.native
    var xhrType: String = js.native
    var error: Error = js.native
    var xhr: XMLHttpRequest = js.native
    var SVGMetadataElement: js.Any = js.native

    def complete(): Unit = js.native

    def load(cb: js.Function0[Unit] = ???): Unit = js.native
  }

  @js.native
  @JSName("PIXI.loaders.Resource")
  object Resource extends js.Object {
    var LOAD_TYPE: js.Any = js.native
    var XHR_READ_STATE: js.Any = js.native
    var XHR_RESPONSE_TYPE: js.Any = js.native
  }

}

package mesh {

  @js.native
  @JSName("PIXI.mesh.Mesh")
  class Mesh protected() extends Container {
    def this(texture: Texture, vertices: js.Array[Double] = ???, uvs: js.Array[Double] = ???, indices: js.Array[Double] = ???, drawMode: Double = ???) = this()

    var texture: Texture = js.native
    var uvs: js.Array[Double] = js.native
    var vertices: js.Array[Double] = js.native
    var indices: js.Array[Double] = js.native
    var dirty: Boolean = js.native
    var blendMode: Double = js.native
    var canvasPadding: Double = js.native
    var drawMode: Double = js.native
    var shader: Shader | AbstractFilter = js.native

    def getBounds(matrix: Matrix = ???): Rectangle = js.native

    def containsPoint(point: Point): Boolean = js.native

    var _texture: Texture = js.native

    def _renderCanvasTriangleMesh(context: CanvasRenderingContext2D): Unit = js.native

    def _renderCanvasTriangles(context: CanvasRenderingContext2D): Unit = js.native

    def _renderCanvasDrawTriangle(context: CanvasRenderingContext2D, vertices: Double, uvs: Double, index0: Double, index1: Double, index2: Double): Unit = js.native

    def renderMeshFlat(Mesh: Mesh): Unit = js.native

    def _onTextureUpdate(): Unit = js.native
  }

  @js.native
  @JSName("PIXI.mesh.Mesh")
  object Mesh extends js.Object {
    var DRAW_MODES: js.Any = js.native
  }

  @js.native
  @JSName("PIXI.mesh.Rope")
  class Rope protected() extends Mesh {
    def this(texture: Texture, points: js.Array[Point]) = this()

    var _ready: Boolean = js.native

    def getTextureUvs(): TextureUvs = js.native

    var points: js.Array[Point] = js.native
    var colors: js.Array[Double] = js.native

    def refresh(): Unit = js.native
  }

  @js.native
  @JSName("PIXI.mesh.Plane")
  class Plane protected() extends Mesh {
    def this(texture: Texture, segmentsX: Double = ???, segmentsY: Double = ???) = this()

    var segmentsX: Double = js.native
    var segmentsY: Double = js.native
  }

  @js.native
  @JSName("PIXI.mesh.MeshRenderer")
  class MeshRenderer protected() extends ObjectRenderer {
    def this(renderer: WebGLRenderer) = this()

    def _initWebGL(mesh: Mesh): Unit = js.native

    var indices: js.Array[Double] = js.native

    def render(mesh: Mesh): Unit = js.native

  }

  @js.native
  trait MeshShader extends Shader {
  }

}

package ticker {

  @js.native
  @JSName("PIXI.ticker.Ticker")
  class Ticker extends js.Object {
    def _tick(time: Double): Unit = js.native

    var _emitter: utils.EventEmitter = js.native
    var _requestId: Double = js.native
    var _maxElapsedMS: Double = js.native

    def _requestIfNeeded(): Unit = js.native

    def _cancelIfNeeded(): Unit = js.native

    def _startIfPossible(): Unit = js.native

    var autoStart: Boolean = js.native
    var deltaTime: Double = js.native
    var elapsedMS: Double = js.native
    var lastTime: Double = js.native
    var speed: Double = js.native
    var started: Boolean = js.native
    var FPS: Double = js.native
    var minFPS: Double = js.native

    def add(fn: js.Function1[Double, Unit], context: js.Any = ???): Ticker = js.native

    def addOnce(fn: js.Function1[Double, Unit], context: js.Any = ???): Ticker = js.native

    def remove(fn: js.Function1[Double, Unit], context: js.Any = ???): Ticker = js.native

    def start(): Unit = js.native

    def stop(): Unit = js.native

    def update(): Unit = js.native
  }

  @JSName("PIXI.ticker")
  @js.native
  object Ticker extends js.Object {
    var shared: Ticker = js.native
  }

}

@JSName("PIXI")
@js.native
object PIXI extends js.Object {
  var VERSION: String = js.native
  var PI_2: Double = js.native
  var RAD_TO_DEG: Double = js.native
  var DEG_TO_RAD: Double = js.native
  var TARGET_FPMS: Double = js.native
  var RETINA_PREFIX: String = js.native
  var RESOLUTION: Double = js.native
  var FILTER_RESOLUTION: Double = js.native
  var SPRITE_BATCH_SIZE: Double = js.native

  def autoDetectRenderer(width: Double, height: Double, options: RendererOptions = null, noWebGL: Boolean = false): SystemRenderer = js.native

  var loader: loaders.Loader = js.native

}




