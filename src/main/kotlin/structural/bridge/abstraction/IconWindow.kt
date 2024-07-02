package structural.bridge.abstraction

import structural.bridge.View
import structural.bridge.Window
import structural.bridge.WindowImp
import structural.structure.Point

abstract class IconWindow(val bitmapName: String, contents: View, imp: WindowImp) : Window(contents, imp) {
    fun drawContents() {
        imp.deviceBitmap(bitmapName, Point(0, 0), Point(0, 0))
    }
}