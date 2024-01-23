package util

import kotlin.random.Random

private const val RANDOM_SIZE = 10

fun generateRandomNumber(): Int {
    return Random.nextInt(RANDOM_SIZE)
}
