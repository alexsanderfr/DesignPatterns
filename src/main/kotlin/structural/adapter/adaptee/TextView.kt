package structural.adapter.adaptee

import structural.structure.Point

interface TextView {
    fun getOrigin(): Point
    fun getExtent(): Point
    fun isEmpty(): Boolean
}