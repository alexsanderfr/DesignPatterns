package structural.bridge

import structural.structure.Point

abstract class WindowImp {
    fun impTop() = 0
    fun impBottom() = 0
    fun impSetExtent(point: Point) = 0
    fun impSetOrigin(point: Point) = 0

    fun deviceRect(pointA: Point, pointB: Point, pointC: Point, pointD: Point) = 0
    fun deviceText(text: String, pointA: Point, pointB: Point) = 0
    fun deviceBitmap(text: String, pointA: Point, pointB: Point) = 0
}
