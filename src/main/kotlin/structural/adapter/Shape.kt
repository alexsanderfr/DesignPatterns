package structural.adapter

import structural.structure.Coord

interface Shape {
    fun boundingBox(): Coord
    fun createManipulator(): Manipulator
}