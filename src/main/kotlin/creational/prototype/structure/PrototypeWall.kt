package creational.prototype.structure

import creational.structure.Wall

class PrototypeWall : Wall() {
    fun clone(): Wall {
        return this
    }
}