package domain

import util.generateRandomNumber


private const val MOVE_CONDITION_NUM = 4

class CarMovableStrategy : MovableStrategy {
    override fun isMovable(): Boolean {
        return generateRandomNumber() >= MOVE_CONDITION_NUM
    }

}

fun interface MovableStrategy {
    fun isMovable(): Boolean
}
