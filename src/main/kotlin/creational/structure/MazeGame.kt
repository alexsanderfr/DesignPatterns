package creational.structure

class MazeGame {
    fun createMaze(): Maze {
        val maze = Maze()
        val room1 = Room(1)
        val room2 = Room(2)
        val door = Door(room1, room2)

        maze.addRoom(room1)
        maze.addRoom(room2)

        room1.setSide(Direction.NORTH, Wall())
        room1.setSide(Direction.EAST, door)
        room1.setSide(Direction.SOUTH, Wall())
        room1.setSide(Direction.WEST, Wall())

        room2.setSide(Direction.NORTH, Wall())
        room2.setSide(Direction.EAST, Wall())
        room2.setSide(Direction.SOUTH, Wall())
        room2.setSide(Direction.WEST, door)

        return maze
    }
}