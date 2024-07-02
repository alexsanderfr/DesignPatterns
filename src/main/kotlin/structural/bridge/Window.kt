package structural.bridge

import structural.structure.Point

abstract class Window(val contents: View, val imp: WindowImp) {
    abstract fun open()
    abstract fun close()
    abstract fun iconify()
    abstract fun deiconify()

    abstract fun setOrigin(point: Point)
    abstract fun setExtent(point: Point)
    abstract fun raise()
    abstract fun lower()

    abstract fun drawLine(pointA: Point, pointB: Point)
    abstract fun drawRect(pointA: Point, pointB: Point)
    abstract fun drawPolygon(points: List<Point>, n: Int)
    abstract fun drawText(text: String, point: Point)
}