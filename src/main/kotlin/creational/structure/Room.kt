package creational.structure

open class Room(val number: Int, val sides: HashMap<Direction, MapSite> = hashMapOf()) : MapSite() {
    fun getSide(direction: Direction): MapSite {
        return sides[direction]!!
    }
    fun setSide(direction: Direction, mapSite: MapSite) {
        sides[direction] = mapSite
    }

    override fun enter(): Boolean {
        return true
    }
}