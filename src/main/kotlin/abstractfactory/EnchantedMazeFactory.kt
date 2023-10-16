package abstractfactory

import structure.Door
import structure.Room

abstract class EnchantedMazeFactory : MazeFactory() {
    override fun makeRoom(number: Int): Room {
        return EnchantedRoom(number, castSpell())
    }

    override fun makeDoor(room1: Room, room2: Room): Door {
        return DoorNeedingSpell(room1, room2)
    }

    private fun castSpell(): Spell {
        return Spell()
    }

    class Spell
    class EnchantedRoom(number: Int, spell: Spell) : Room(number)

    class DoorNeedingSpell(room1: Room, room2: Room) : Door(room1, room2)
}

