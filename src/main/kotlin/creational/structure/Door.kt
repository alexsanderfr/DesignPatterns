package creational.structure

open class Door(var room1: Room, var room2: Room, private val isOpen: Boolean = true) : MapSite() {

    override fun enter(): Boolean {
        return isOpen
    }

    fun initialize(room1: Room, room2: Room) {
        this.room1 = room1
        this.room2 = room2
    }
}