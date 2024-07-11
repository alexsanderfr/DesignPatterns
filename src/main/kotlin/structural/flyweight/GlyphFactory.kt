package structural.flyweight

class GlyphFactory(private var characters: MutableList<Character>) {
    companion object {
        const val NCHARCODES = 128
    }

    init {
        characters = mutableListOf()
        for (i in 0 until NCHARCODES) {
            val char = Char(0)
            characters.add(Character(char))
        }
    }

    fun createCharacter(c: Char): Character {
        val character = Character(c)
        if (!characters.contains(Character(c))) {
            characters.add(Character(c))
        }
        val characterInList = characters.find { it == character }!!
        return characterInList
    }

    fun createRow(): Row = Row()
    fun createColumn(): Column = Column()
}