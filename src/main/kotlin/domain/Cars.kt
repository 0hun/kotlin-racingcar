package domain

class Cars(var cars: List<Car>) {
    fun move() {
        this.cars.forEach(Car::move)
    }
}
