package structural.proxy

class TextDocument {
    init {
        insert(ImageProxy("fileName"))
    }

    private fun insert(graphic: Graphic) {}
}