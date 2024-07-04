package structural.composite

abstract class Equipment(private val name: String) {
    fun name(): String = name
    abstract fun power(): Watt
    abstract fun netPrice(): Currency
    abstract fun discountPrice(): Currency
    abstract fun addEquipment(equipment: Equipment)
    abstract fun removeEquipment(equipment: Equipment)
    abstract fun createIterator(): Iterator<Equipment>
}