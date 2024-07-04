package structural.composite

class Cabinet(equipments: MutableList<Equipment>, name: String) : CompositeEquipment(equipments, name) {
    override fun power(): Watt = Watt(120)
    override fun netPrice(): Currency = Currency(999)
    override fun discountPrice(): Currency = Currency(799)
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

    fun makeCabinet() {
        val cabinet: Cabinet = Cabinet(mutableListOf(), "PC Cabinet")
        val chassis: Chassis = Chassis(mutableListOf(), "PC Chassis")
        cabinet.addEquipment(chassis)
    }
}