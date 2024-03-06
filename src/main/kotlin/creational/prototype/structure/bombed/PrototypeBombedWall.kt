package creational.prototype.structure.bombed

import creational.structure.bombed.BombedWall

class PrototypeBombedWall : BombedWall() {
    fun clone(): BombedWall {
        return this
    }
}