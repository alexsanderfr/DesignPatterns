package creational.structure

open class Door(val room1: Room, val room2: Room, val isOpen: Boolean = true) : MapSite() {

    override fun enter(): Boolean {
        return isOpen
    }
}