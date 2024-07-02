package structural.adapter.adapter

import structural.adapter.Manipulator
import structural.structure.Point
import structural.adapter.Shape
import structural.adapter.adaptee.TextManipulator
import structural.adapter.adaptee.TextView
import structural.structure.Coord

class TextShape(private val textView: TextView) : Shape {
    override fun boundingBox():Coord {
        val extent = textView.getExtent()
        val width = extent.x
        val height = extent.y
        val origin = textView.getOrigin()
        val bottom = origin.x
        val left = origin.y
        val bottomLeft = Point(bottom, left)
        val topRight = Point(bottom+height, left+width)
        return Coord(bottomLeft, topRight)
    }

    override fun createManipulator(): Manipulator {
        return TextManipulator()
    }

    fun isEmpty(): Boolean {
        return textView.isEmpty()
    }
}