package creational.singleton.structure

import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room
import creational.structure.Wall

open class MazeFactory {
    fun makeMaze(): Maze = Maze()
    open fun makeWall(): Wall = Wall()
    open fun makeRoom(number: Int): Room = Room(number)
    open fun makeDoor(room1: Room, room2: Room): Door = Door(room1, room2)
}