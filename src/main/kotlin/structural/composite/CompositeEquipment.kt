package structural.composite

abstract class CompositeEquipment(val equipments: MutableList<Equipment>, name: String) : Equipment(name) {
    abstract override fun power(): Watt
    override fun netPrice(): Currency {
        val iterator = createIterator()
        val total = Currency(0)
        iterator.forEach { item -> total += item.netPrice() }
        return total
    }
    abstract override fun discountPrice(): Currency
    abstract override fun addEquipment(equipment: Equipment)
    abstract override fun removeEquipment(equipment: Equipment)
    abstract override fun createIterator(): Iterator<Equipment>
}