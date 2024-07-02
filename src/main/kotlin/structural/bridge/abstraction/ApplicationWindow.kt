package structural.bridge.abstraction

import structural.bridge.View
import structural.bridge.Window
import structural.bridge.WindowImp

abstract class ApplicationWindow(contents: View, imp: WindowImp) : Window(contents, imp) {
    fun drawContents() {
        contents.drawOn()
    }
}