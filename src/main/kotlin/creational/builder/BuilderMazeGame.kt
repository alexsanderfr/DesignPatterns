package creational.builder

import creational.structure.Maze

class BuilderMazeGame {
    fun createMaze(builder: MazeBuilder): Maze {
        builder.buildMaze()
        builder.buildRoom(1)
        builder.buildRoom(2)
        builder.buildDoor(1, 2)

        return builder.getMaze()
    }
}