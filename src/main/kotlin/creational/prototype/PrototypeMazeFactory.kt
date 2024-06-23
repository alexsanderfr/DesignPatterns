package creational.prototype

import creational.prototype.structure.PrototypeDoor
import creational.prototype.structure.PrototypeMaze
import creational.prototype.structure.PrototypeRoom
import creational.prototype.structure.PrototypeWall
import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room
import creational.structure.Wall

open class PrototypeMazeFactory(maze: Maze, wall: Wall, room: Room, door: Door) {
    private val prototypeMaze: PrototypeMaze = maze as PrototypeMaze
    private val prototypeWall: PrototypeWall = wall as PrototypeWall
    private val prototypeRoom: PrototypeRoom = room as PrototypeRoom
    private val prototypeDoor: PrototypeDoor = door as PrototypeDoor


    fun makeMaze(): Maze {
        return prototypeMaze.clone()
    }

    open fun makeWall(): Wall {
        return prototypeWall.clone()
    }

    open fun makeRoom(number: Int): Room {
        val room = prototypeRoom.clone()
        room.initialize(number)
        return room
    }

    fun makeDoor(room1: Room, room2: Room): Door {
        val door = prototypeDoor.clone()
        door.initialize(room1, room2)
        return door
    }
}