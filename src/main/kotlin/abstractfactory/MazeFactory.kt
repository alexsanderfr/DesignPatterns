package abstractfactory

import structure.Door
import structure.Maze
import structure.Room
import structure.Wall

abstract class MazeFactory {
    abstract fun makeMaze(): Maze
    abstract fun makeWall(): Wall
    abstract fun makeRoom(number: Int): Room
    abstract fun makeDoor(room1:Room, room2: Room): Door
}