package domain

class Car(val name: String, var movableStrategy: MovableStrategy) {

    var position: Int = 0

    init {
        require(name.length <= 5) { "이름은 5글자를 초과할 수 없습니다." }
    }

    fun move() {
        if (movableStrategy.isMovable()) {
            this.position += 1
        }
    }

}
