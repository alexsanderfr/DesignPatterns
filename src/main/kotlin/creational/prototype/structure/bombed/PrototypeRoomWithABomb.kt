package creational.prototype.structure.bombed

import creational.structure.bombed.RoomWithABomb

class PrototypeRoomWithABomb(number: Int) : RoomWithABomb(number) {
    fun clone(): RoomWithABomb {
        return this
    }
}