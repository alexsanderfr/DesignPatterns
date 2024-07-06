package structural.decorator

open class Decorator(private val component: VisualComponent): VisualComponent() {
    override fun draw() {
        component.draw()
    }

    override fun resize() {
        component.resize()
    }

}