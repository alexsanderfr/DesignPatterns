package creational.abstractfactory

import creational.structure.Direction
import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room

class AbstractFactoryMazeGame {

    // MazeAbstractFactory can be replaced with BombedMazeAbstractFactory or EnchantedMazeAbstractFactory
    fun createMaze(mazeAbstractFactory: MazeAbstractFactory): Maze {
        val maze: Maze = mazeAbstractFactory.makeMaze()
        val room1: Room = mazeAbstractFactory.makeRoom(1)
        val room2: Room = mazeAbstractFactory.makeRoom(2)
        val door: Door =  mazeAbstractFactory.makeDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.NORTH,  mazeAbstractFactory.makeWall())
        room1.setSide(Direction.EAST, door)
        room1.setSide(Direction.SOUTH, mazeAbstractFactory.makeWall())
        room1.setSide(Direction.WEST, mazeAbstractFactory.makeWall())

        room2.setSide(Direction.NORTH, mazeAbstractFactory.makeWall())
        room2.setSide(Direction.EAST, mazeAbstractFactory.makeWall())
        room2.setSide(Direction.SOUTH, mazeAbstractFactory.makeWall())
        room2.setSide(Direction.WEST, door)

        return maze
    }
}