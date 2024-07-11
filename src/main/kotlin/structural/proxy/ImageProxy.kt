package structural.proxy

import structural.structure.Point
import java.io.InputStream
import java.io.OutputStream

open class ImageProxy(imageFile: String) : Graphic() {
    private var image: Image? = null
    private var extent: Point? = Point(0, 0)
    private var filename: String? = imageFile

    protected fun getImage(): Image? {
        if (image == null) {
            image = Image(filename)
        }
        return image
    }

    override fun draw(point: Point) {
        getImage()?.draw(point)
    }

    override fun handleMouse(event: Event) {
        getImage()?.handleMouse(event)
    }

    override fun getExtent(): Point {
        if (extent == Point(0, 0)) {
            extent = image?.getExtent()
        }
        return extent!!
    }

    override fun load(inputStream: InputStream) {
        getImage()?.load(inputStream)
    }

    override fun save(outputStream: OutputStream) {
        getImage()?.save(outputStream)
    }
}