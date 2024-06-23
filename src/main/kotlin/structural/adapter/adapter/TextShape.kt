package structural.adapter.adapter

import structural.adapter.Manipulator
import structural.adapter.Point
import structural.adapter.Shape
import structural.adapter.adaptee.TextManipulator
import structural.adapter.adaptee.TextView

class TextShape(private val textView: TextView) : Shape {
    override fun boundingBox(): Pair<Point, Point> {
        val extent = textView.getExtent()
        val width = extent.x
        val height = extent.y
        val origin = textView.getOrigin()
        val bottom = origin.x
        val left = origin.y
        val bottomLeft = Point(bottom, left)
        val topRight = Point(bottom+height, left+width)
        return Pair(bottomLeft, topRight)
    }

    override fun createManipulator(): Manipulator {
        return TextManipulator()
    }

    fun isEmpty(): Boolean {
        return textView.isEmpty()
    }
}