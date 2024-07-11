package structural.proxy

import structural.structure.Point
import java.io.InputStream
import java.io.OutputStream

class Image(val filename: String?) : Graphic() {
    override fun draw(point: Point) {
        super.draw(point)
    }
    override fun handleMouse(event: Event) {
        super.handleMouse(event)
    }

    override fun getExtent(): Point {
        return super.getExtent()
    }
    override fun load(inputStream: InputStream) {
        super.load(inputStream)
    }

    override fun save(outputStream: OutputStream) {
        super.save(outputStream)
    }
}