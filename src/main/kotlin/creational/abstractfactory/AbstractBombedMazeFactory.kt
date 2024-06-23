package creational.abstractfactory

import creational.structure.Room
import creational.structure.Wall
import creational.structure.bombed.BombedWall
import creational.structure.bombed.RoomWithABomb

abstract class AbstractBombedMazeFactory : AbstractMazeFactory() {
    override fun makeWall(): Wall {
        return BombedWall()
    }

    override fun makeRoom(number: Int): Room {
        return RoomWithABomb(number)
    }
}
