package creational.builder

import creational.structure.*

class StandardMazeBuilder : MazeBuilder() {
    var _currentMaze: Maze? = null
    override fun buildMaze() {
        _currentMaze = Maze()
    }

    override fun buildRoom(number: Int) {
        if (_currentMaze?.roomNo(number) == null) {
            val room = Room(number)
            room.setSide(Direction.WEST, Wall())
            room.setSide(Direction.EAST, Wall())
            room.setSide(Direction.SOUTH, Wall())
            room.setSide(Direction.NORTH, Wall())

            _currentMaze?.addRoom(room)
        }
    }

    override fun buildDoor(roomFrom: Int, roomTo: Int) {
        val room1 = _currentMaze?.roomNo(roomFrom)
        val room2 = _currentMaze?.roomNo(roomTo)
        if (room1 != null && room2 != null) {
            val door = Door(room1, room2)
            val commonWall1 = commonWall(room1, room2)!!
            val commonWall2 = oppositeCommonWall(commonWall1)
            room1.setSide(commonWall1, door)
            room2.setSide(commonWall2, door)
            _currentMaze?.updateRoom(roomFrom, room1)
            _currentMaze?.updateRoom(roomTo, room2)
        }
    }

    override fun getMaze(): Maze {
        return _currentMaze!!
    }

    private fun commonWall(room1: Room, room2: Room): Direction? {
        if (room1.getSide(Direction.EAST) == Wall() && room2.getSide(Direction.WEST) == Wall()) {
            return Direction.EAST
        } else if (room1.getSide(Direction.WEST) == Wall() && room2.getSide(Direction.EAST) == Wall()) {
            return Direction.WEST
        } else if (room1.getSide(Direction.NORTH) == Wall() && room2.getSide(Direction.SOUTH) == Wall()) {
            return Direction.NORTH
        } else if (room1.getSide(Direction.SOUTH) == Wall() && room2.getSide(Direction.NORTH) == Wall()) {
            return Direction.SOUTH
        }
        return null
    }

    private fun oppositeCommonWall(direction: Direction) = when (direction) {
        Direction.NORTH -> Direction.SOUTH
        Direction.SOUTH -> Direction.NORTH
        Direction.WEST -> Direction.WEST
        Direction.EAST -> Direction.EAST
    }
}