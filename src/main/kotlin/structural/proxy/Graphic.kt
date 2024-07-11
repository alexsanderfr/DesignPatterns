package structural.proxy

import structural.structure.Point
import java.io.InputStream
import java.io.OutputStream

open class Graphic {
    open fun draw(point: Point) {}
    open fun handleMouse(event: Event) {}
    open fun getExtent(): Point = Point(0, 0)
    open fun load(inputStream: InputStream) {}
    open fun save(outputStream: OutputStream) {}
}