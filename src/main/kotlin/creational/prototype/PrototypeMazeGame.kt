package creational.prototype

import creational.structure.Direction
import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room

class PrototypeMazeGame {
    // MazePrototypeFactory can be replaced with BombedMazePrototypeFactory
    fun createMaze(mazePrototypeFactory: MazePrototypeFactory): Maze {
        val maze: Maze = mazePrototypeFactory.makeMaze()
        val room1: Room = mazePrototypeFactory.makeRoom(1)
        val room2: Room = mazePrototypeFactory.makeRoom(2)
        val door: Door = mazePrototypeFactory.makeDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.NORTH, mazePrototypeFactory.makeWall())
        room1.setSide(Direction.EAST, door)
        room1.setSide(Direction.SOUTH, mazePrototypeFactory.makeWall())
        room1.setSide(Direction.WEST, mazePrototypeFactory.makeWall())

        room2.setSide(Direction.NORTH, mazePrototypeFactory.makeWall())
        room2.setSide(Direction.EAST, mazePrototypeFactory.makeWall())
        room2.setSide(Direction.SOUTH, mazePrototypeFactory.makeWall())
        room2.setSide(Direction.WEST, door)

        return maze
    }
}