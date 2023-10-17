package creational.factory

import creational.structure.*
import creational.structure.bombed.BombedWall
import creational.structure.bombed.RoomWithABomb
import creational.structure.enchanted.DoorNeedingSpell
import creational.structure.enchanted.EnchantedRoom
import creational.structure.enchanted.Spell

class FactoryMazeGame {
    private fun makeMaze(): Maze = Maze()
    private fun makeWall(): Wall = Wall()
    private fun makeBombedWall():BombedWall = BombedWall()
    private fun makeRoom(number: Int): Room = Room(number)
    private fun makeRoomWithBomb(number: Int): RoomWithABomb = RoomWithABomb(number)
    private fun makeEnchantedRoom(number: Int): EnchantedRoom = EnchantedRoom(number, Spell())
    private fun makeDoor(room1: Room, room2: Room): Door = Door(room1, room2)
    private fun makeDoorNeedingSpell(room1: Room, room2: Room): DoorNeedingSpell = DoorNeedingSpell(room1, room2)

    fun createMaze(): Maze {
        val maze: Maze = makeMaze()
        val room1: Room = makeRoom(1)
        val room2: Room = makeRoom(2)
        val door: Door = makeDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.NORTH, makeWall())
        room1.setSide(Direction.EAST, door)
        room1.setSide(Direction.SOUTH, makeWall())
        room1.setSide(Direction.WEST, makeWall())

        room2.setSide(Direction.NORTH, makeWall())
        room2.setSide(Direction.EAST, makeWall())
        room2.setSide(Direction.SOUTH, makeWall())
        room2.setSide(Direction.WEST, door)

        return maze
    }

    fun createBombedMaze(): Maze {
        val bombedRoom: Maze = makeMaze()
        val roomWithABomb1: Room = makeRoomWithBomb(1)
        val roomWithABomb2: Room = makeRoomWithBomb(2)
        val door: Door = makeDoor(roomWithABomb1, roomWithABomb2)

        bombedRoom.addRoom(roomWithABomb1)
        bombedRoom.addRoom(roomWithABomb2)

        roomWithABomb1.setSide(Direction.NORTH, makeBombedWall())
        roomWithABomb1.setSide(Direction.EAST, door)
        roomWithABomb1.setSide(Direction.SOUTH, makeBombedWall())
        roomWithABomb1.setSide(Direction.WEST, makeBombedWall())

        roomWithABomb2.setSide(Direction.NORTH, makeBombedWall())
        roomWithABomb2.setSide(Direction.EAST, makeBombedWall())
        roomWithABomb2.setSide(Direction.SOUTH, makeBombedWall())
        roomWithABomb2.setSide(Direction.WEST, door)

        return bombedRoom
    }

    fun createEnchantedMaze(): Maze {
        val enchantedMaze: Maze = makeMaze()
        val enchantedRoom1: Room = makeEnchantedRoom(1)
        val enchantedRoom2: Room = makeEnchantedRoom(2)
        val doorNeedingSpell: Door = makeDoorNeedingSpell(enchantedRoom1, enchantedRoom2)

        enchantedMaze.addRoom(enchantedRoom1)
        enchantedMaze.addRoom(enchantedRoom2)

        enchantedRoom1.setSide(Direction.NORTH, makeWall())
        enchantedRoom1.setSide(Direction.EAST, doorNeedingSpell)
        enchantedRoom1.setSide(Direction.SOUTH, makeWall())
        enchantedRoom1.setSide(Direction.WEST, makeWall())

        enchantedRoom2.setSide(Direction.NORTH, makeWall())
        enchantedRoom2.setSide(Direction.EAST, makeWall())
        enchantedRoom2.setSide(Direction.SOUTH, makeWall())
        enchantedRoom2.setSide(Direction.WEST, doorNeedingSpell)

        return enchantedMaze
    }
}