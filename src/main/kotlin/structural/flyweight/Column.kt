package structural.flyweight

class Column : Glyph() {
    override fun draw(window: Window, glyphContext: GlyphContext) {

    }

    override fun setFont(font: Font, glyphContext: GlyphContext) {

    }

    override fun first(glyphContext: GlyphContext) {

    }

    override fun next(glyphContext: GlyphContext) {

    }

    override fun isDone(glyphContext: GlyphContext): Boolean {
        return true
    }

    override fun current(glyphContext: GlyphContext): Glyph {
        return this
    }

    override fun insert(glyph: Glyph, glyphContext: GlyphContext) {

    }

    override fun remove(glyphContext: GlyphContext) {

    }
}