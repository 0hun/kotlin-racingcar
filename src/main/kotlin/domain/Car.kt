package domain

class Car(name: String, movableStrategy: MovableStrategy?) {

    val name: String = name
    var position: Int = 0
    var movableStrategy: MovableStrategy? = movableStrategy

    fun move() {
        if (movableStrategy!!.isMovable()) {
            this.position += 1
        }
    }

    fun curPosition(): Int {
        return this.position
    }
}
