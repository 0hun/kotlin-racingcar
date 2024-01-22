package domain

object CarFactory {
    fun makeCars(names: Array<String>): Cars {
        val carList: MutableList<Car> = ArrayList()

        val movableStrategy: MovableStrategy = CarMovableStrategy()

        for (name in names) {
            val newCar = Car(name, movableStrategy)
            carList.add(newCar)
        }

        return Cars(carList)
    }
}
