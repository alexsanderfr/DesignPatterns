package structural.adapter

interface Shape {
    fun boundingBox(): Pair<Point, Point>
    fun createManipulator(): Manipulator
}