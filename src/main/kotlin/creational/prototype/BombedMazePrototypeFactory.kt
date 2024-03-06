package creational.prototype

import creational.prototype.structure.bombed.PrototypeBombedWall
import creational.prototype.structure.bombed.PrototypeRoomWithABomb
import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room
import creational.structure.Wall
import creational.structure.bombed.BombedWall
import creational.structure.bombed.RoomWithABomb

class BombedMazePrototypeFactory(
    maze: Maze,
    wall: Wall,
    room: Room,
    door: Door
) : MazePrototypeFactory(maze, wall, room, door) {
    private val prototypeWall: PrototypeBombedWall = wall as PrototypeBombedWall
    private val prototypeRoom: PrototypeRoomWithABomb = room as PrototypeRoomWithABomb
    override fun makeWall(): BombedWall {
        return prototypeWall.clone()
    }

    override fun makeRoom(number: Int): RoomWithABomb {
        val room = prototypeRoom.clone()
        room.initialize(number)
        return room
    }
}