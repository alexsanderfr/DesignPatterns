package structural.adapter.adaptee

import structural.adapter.Point

interface TextView {
    fun getOrigin(): Point
    fun getExtent(): Point
    fun isEmpty(): Boolean
}