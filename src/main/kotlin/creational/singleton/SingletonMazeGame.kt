package creational.singleton

import creational.singleton.structure.MazeFactoryType
import creational.structure.Direction
import creational.structure.Door
import creational.structure.Maze
import creational.structure.Room

class SingletonMazeGame {
    fun createMaze(): Maze {
        val singletonMazeFactory = SingletonMazeFactory(MazeFactoryType.STANDARD)
        val mazeFactory = singletonMazeFactory.getInstance()

        val maze: Maze = mazeFactory.makeMaze()
        val room1: Room = mazeFactory.makeRoom(1)
        val room2: Room = mazeFactory.makeRoom(2)
        val door: Door = mazeFactory.makeDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.NORTH, mazeFactory.makeWall())
        room1.setSide(Direction.EAST, door)
        room1.setSide(Direction.SOUTH, mazeFactory.makeWall())
        room1.setSide(Direction.WEST, mazeFactory.makeWall())

        room2.setSide(Direction.NORTH, mazeFactory.makeWall())
        room2.setSide(Direction.EAST, mazeFactory.makeWall())
        room2.setSide(Direction.SOUTH, mazeFactory.makeWall())
        room2.setSide(Direction.WEST, door)

        return maze
    }
}