package controller

import domain.CarFactory
import domain.Cars

class CarRace(names: Array<String>, var times: Int) {

    private val cars = CarFactory.makeCars(names)

    fun start(): Cars {
        while(times > 0) {
            cars.move()

            times --
        }

        return cars
    }


}
