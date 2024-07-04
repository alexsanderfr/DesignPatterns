package structural.composite

class Currency(private var value: Int = 0) {
    fun value(): Int = value
    operator fun plusAssign(netPrice: Currency) {
        value += netPrice.value
    }
}