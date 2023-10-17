package creational.builder

import creational.structure.Maze

abstract class MazeBuilder {
    abstract fun buildMaze()
    abstract fun buildRoom(number: Int)
    abstract fun buildDoor(roomFrom: Int, roomTo: Int)
    abstract fun getMaze(): Maze
}