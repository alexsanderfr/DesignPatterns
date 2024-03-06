package creational.prototype.structure

import creational.structure.Room

class PrototypeRoom(number: Int) : Room(number) {
    fun clone() : Room {
        return this
    }
}