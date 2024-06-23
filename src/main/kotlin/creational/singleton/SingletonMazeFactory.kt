package creational.singleton

import creational.singleton.structure.BombedMazeFactory
import creational.singleton.structure.EnchantedMazeFactory
import creational.singleton.structure.MazeFactory
import creational.singleton.structure.MazeFactoryType

class SingletonMazeFactory(val type: MazeFactoryType) {
    private var instance: MazeFactory? = null

    fun getInstance(): MazeFactory {
        if (instance == null) {
            instance = when (type) {
                MazeFactoryType.STANDARD -> MazeFactory()
                MazeFactoryType.BOMBED -> BombedMazeFactory()
                MazeFactoryType.ENCHANTED -> EnchantedMazeFactory()
            }

        }
        return instance as MazeFactory
    }
}