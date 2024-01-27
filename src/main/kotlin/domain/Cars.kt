package domain

import java.util.stream.Collectors

class Cars(var cars: List<Car>) {
    fun move() {
        this.cars.forEach(Car::move)
    }

    fun findWinners(times: Int): String {
        return cars.stream()
            .filter { car: Car -> car.position == times }
            .map(Car::name)
            .collect(Collectors.joining(","))
    }
}
