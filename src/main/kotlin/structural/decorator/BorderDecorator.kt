package structural.decorator

class BorderDecorator(component: VisualComponent) : Decorator(component) {
    fun drawBorder(borderWidth: Int, borderHeight: Int) {}
}