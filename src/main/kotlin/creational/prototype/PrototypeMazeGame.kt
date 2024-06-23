package creational.prototype

import creational.structure.Direction
import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room

class PrototypeMazeGame {
    // PrototypeMazeFactory can be replaced with PrototypeBombedMazeFactory
    fun createMaze(prototypeMazeFactory: PrototypeMazeFactory): Maze {
        val maze: Maze = prototypeMazeFactory.makeMaze()
        val room1: Room = prototypeMazeFactory.makeRoom(1)
        val room2: Room = prototypeMazeFactory.makeRoom(2)
        val door: Door = prototypeMazeFactory.makeDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.NORTH, prototypeMazeFactory.makeWall())
        room1.setSide(Direction.EAST, door)
        room1.setSide(Direction.SOUTH, prototypeMazeFactory.makeWall())
        room1.setSide(Direction.WEST, prototypeMazeFactory.makeWall())

        room2.setSide(Direction.NORTH, prototypeMazeFactory.makeWall())
        room2.setSide(Direction.EAST, prototypeMazeFactory.makeWall())
        room2.setSide(Direction.SOUTH, prototypeMazeFactory.makeWall())
        room2.setSide(Direction.WEST, door)

        return maze
    }
}