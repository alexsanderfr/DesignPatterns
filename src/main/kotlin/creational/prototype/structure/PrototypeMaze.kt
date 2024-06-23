package creational.prototype.structure

import creational.structure.Maze

class PrototypeMaze: Maze() {
    fun clone(): Maze {
        return this
    }
}