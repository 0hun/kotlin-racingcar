package controller

import domain.CarFactory
import domain.Cars
import view.ResultView

class CarRace(names: List<String>, val times: Int) {

    private val cars = CarFactory.makeCars(names)
    private var round = times

    fun start(): Cars {
        val resultView = ResultView()
        resultView.printRacingEndMessage()

        while(round > 0) {
            cars.move()

            resultView.printPosition(cars)

            round --
        }

        val winners = cars.findWinners(times);

        resultView.printWinners(winners)

        return cars
    }


}
