package creational.prototype.structure

import creational.structure.Door
import creational.structure.Room

class PrototypeDoor(room1: Room, room2: Room) : Door(room1, room2) {
    fun clone(): Door {
        return this
    }
}