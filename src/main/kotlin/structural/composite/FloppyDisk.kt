package structural.composite

abstract class FloppyDisk(name: String) : Equipment(name) {
    abstract override fun power(): Watt
    abstract override fun netPrice(): Currency
    abstract override fun discountPrice(): Currency
}

