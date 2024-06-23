package creational.singleton.structure

import creational.structure.Wall
import creational.structure.bombed.BombedWall
import creational.structure.bombed.RoomWithABomb

class BombedMazeFactory : MazeFactory() {
    override fun makeWall(): Wall = BombedWall()
    override fun makeRoom(number: Int): RoomWithABomb = RoomWithABomb(number)
}