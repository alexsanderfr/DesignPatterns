package structure

open class Wall : MapSite() {
    override fun enter(): Boolean {
        return false
    }
}