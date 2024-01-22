package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarsTest {

    @Test
    fun `자동차 목록 생성 테스트`() {
        // given
        val car1 = Car("강호동", null)
        val car2 = Car("유재색", null)

        // when
        val cars = Cars(arrayListOf(car1, car2))

        // then
        assertThat(cars.cars.size).isEqualTo(2)
    }
    @Test
    fun `자동차 목록 이동 테스트`() {
        // given
        val randomNumber = (Math.random() * 10 + 4).toInt()
        val movableStrategy = MovableStrategy { randomNumber >= 4 }

        val car1 = Car("강호동", movableStrategy)
        val car2 = Car("유재색", movableStrategy)
        val cars = Cars(arrayListOf(car1, car2))

        // when
        cars.move()

        // then
        assertThat(cars.cars[0].position).isEqualTo(1)
        assertThat(cars.cars[1].position).isEqualTo(1)
    }

}
