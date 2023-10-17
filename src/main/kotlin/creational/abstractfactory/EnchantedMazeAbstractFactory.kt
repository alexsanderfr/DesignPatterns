package creational.abstractfactory

import creational.structure.Door
import creational.structure.Room
import creational.structure.enchanted.DoorNeedingSpell
import creational.structure.enchanted.EnchantedRoom
import creational.structure.enchanted.Spell

abstract class EnchantedMazeAbstractFactory : MazeAbstractFactory() {
    override fun makeRoom(number: Int): Room {
        return EnchantedRoom(number, castSpell())
    }

    override fun makeDoor(room1: Room, room2: Room): Door {
        return DoorNeedingSpell(room1, room2)
    }

    private fun castSpell(): Spell {
        return Spell()
    }
}

