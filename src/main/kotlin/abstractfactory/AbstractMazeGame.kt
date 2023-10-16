package abstractfactory

import structure.*

class AbstractMazeGame {
    fun createMaze(mazeFactory: MazeFactory): Maze {
        val maze: Maze = mazeFactory.makeMaze()
        val room1: Room = mazeFactory.makeRoom(1)
        val room2: Room = mazeFactory.makeRoom(2)
        val door: Door =  mazeFactory.makeDoor(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.NORTH,  mazeFactory.makeWall())
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