package view

import domain.Cars

class ResultView {

    fun printRacingEndMessage() {
        println("실행결과")
    }

    private fun printNextLine() {
        println()
    }

    fun printPosition(cars: Cars) {
        cars.cars.stream()
            .filter { car -> car.position > 0 }
            .forEach { car -> printPath(car.name, car.position) }

        printNextLine()
    }

    private fun printPath(name: String, cuPosition: Int) {
        val path = StringBuilder()

        for (i in 0 until cuPosition) {
            path.append("-")
        }

        println("$name : $path")
    }

    fun printWinners(winners: String) {
        if (!winners.isNullOrBlank()) {
            println(winners + "가 최종 우승했습니다.")
        }
    }


}
