package structural.decorator

class Screen {
    fun makeScreen() {
        val screen = BorderDecorator(ScrollDecorator(TextView()))
    }
}