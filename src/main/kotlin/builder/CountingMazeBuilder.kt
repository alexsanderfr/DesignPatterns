package builder

import structure.Maze

abstract class CountingMazeBuilder: MazeBuilder() {
    private var _rooms = 0
    private var _doors = 0

    override fun buildRoom(number: Int) {
        _rooms++
    }

    override fun buildDoor(roomFrom: Int, roomTo: Int) {
        _doors++
    }

    fun getCounts(): Pair<Int, Int> {
        return Pair(_rooms, _doors)
    }
}