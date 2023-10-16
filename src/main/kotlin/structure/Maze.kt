package structure

class Maze(private val rooms: MutableList<Room> = mutableListOf()) {
    fun addRoom(room: Room) {
        rooms.add(room)
    }

    fun updateRoom(number: Int, room: Room) {
        val currentRoom = roomNo(number)
        rooms.remove(currentRoom)
        addRoom(room)
    }

    fun roomNo(number: Int): Room {
        return rooms.first { room -> room.number == number }
    }
}