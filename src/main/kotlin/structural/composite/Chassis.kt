package structural.composite

class Chassis(equipments: MutableList<Equipment>, name: String) : CompositeEquipment(equipments, name) {
    override fun power(): Watt = Watt(110)
    override fun netPrice(): Currency = Currency(899)
    override fun discountPrice(): Currency = Currency(699)
    override fun addEquipment(equipment: Equipment) {
        equipments.add(equipment)
    }

    override fun removeEquipment(equipment: Equipment) {
        equipments.remove(equipment)
    }

    override fun createIterator(): Iterator<Equipment> {
        val iterator = equipments.iterator()
        return iterator
    }
}