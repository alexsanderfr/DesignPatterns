package abstractfactory

import structure.Room
import structure.Wall

abstract class BombedMazeFactory : MazeFactory() {
    override fun makeWall(): Wall {
        return BombedWall()
    }

    override fun makeRoom(number: Int): Room {
        return RoomWithABomb(number)
    }

    class BombedWall : Wall()

    class RoomWithABomb(number: Int) : Room(number)
}
