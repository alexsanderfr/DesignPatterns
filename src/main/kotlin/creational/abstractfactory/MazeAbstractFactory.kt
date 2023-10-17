package creational.abstractfactory

import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room
import creational.structure.Wall

abstract class MazeAbstractFactory {
    abstract fun makeMaze(): Maze
    abstract fun makeWall(): Wall
    abstract fun makeRoom(number: Int): Room
    abstract fun makeDoor(room1: Room, room2: Room): Door
}