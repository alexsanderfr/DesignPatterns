package creational.abstractfactory

import creational.structure.Direction
import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room

class AbstractFactoryMazeGame {

    // AbstractMazeFactory can be replaced with AbstractBombedMazeFactory or AbstractEnchantedMazeFactory
    fun createMaze(abstractMazeFactory: AbstractMazeFactory): Maze {
        val maze: Maze = abstractMazeFactory.makeMaze()
        val room1: Room = abstractMazeFactory.makeRoom(1)
        val room2: Room = abstractMazeFactory.makeRoom(2)
        val door: Door =  abstractMazeFactory.makeDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.NORTH,  abstractMazeFactory.makeWall())
        room1.setSide(Direction.EAST, door)
        room1.setSide(Direction.SOUTH, abstractMazeFactory.makeWall())
        room1.setSide(Direction.WEST, abstractMazeFactory.makeWall())

        room2.setSide(Direction.NORTH, abstractMazeFactory.makeWall())
        room2.setSide(Direction.EAST, abstractMazeFactory.makeWall())
        room2.setSide(Direction.SOUTH, abstractMazeFactory.makeWall())
        room2.setSide(Direction.WEST, door)

        return maze
    }
}