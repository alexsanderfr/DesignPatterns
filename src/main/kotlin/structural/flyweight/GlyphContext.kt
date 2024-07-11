package structural.flyweight

abstract class GlyphContext(val index: Int) {
    abstract fun next(step: Int = 1)
    abstract fun insert(quantity: Int = 1)
    abstract fun getFont(): Font
    abstract fun setFont(font: Font, span: Int = 1)
}