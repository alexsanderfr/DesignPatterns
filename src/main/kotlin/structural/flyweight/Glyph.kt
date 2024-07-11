package structural.flyweight

abstract class Glyph {
    abstract fun draw(window: Window, glyphContext: GlyphContext)
    abstract fun setFont(font: Font, glyphContext: GlyphContext)

    abstract fun first(glyphContext: GlyphContext)
    abstract fun next(glyphContext: GlyphContext)
    abstract fun isDone(glyphContext: GlyphContext): Boolean
    abstract fun current(glyphContext: GlyphContext): Glyph

    abstract fun insert(glyph: Glyph, glyphContext: GlyphContext)
    abstract fun remove(glyphContext: GlyphContext)
}