package creational.singleton.structure

import creational.structure.Room
import creational.structure.enchanted.DoorNeedingSpell
import creational.structure.enchanted.EnchantedRoom
import creational.structure.enchanted.Spell

class EnchantedMazeFactory : MazeFactory() {
    override fun makeRoom(number: Int): EnchantedRoom = EnchantedRoom(number, Spell())

    override fun makeDoor(room1: Room, room2: Room): DoorNeedingSpell = DoorNeedingSpell(room1, room2)
}