package domain

import java.util.*

class CarMovableStrategy : MovableStrategy {
    override fun isMovable(): Boolean {
        return RandomNumber.generator() >= MOVE_CONDITION_NUM
    }

    companion object {
        private const val MOVE_CONDITION_NUM = 4
    }
}

fun interface MovableStrategy {
    fun isMovable(): Boolean
}

object RandomNumber {
    private const val RANDOM_SIZE = 10

    fun generator(): Int {
        val random = Random()
        return random.nextInt(RANDOM_SIZE)
    }
}
