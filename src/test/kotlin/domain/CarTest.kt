package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.function.Executable

internal class CarTest {

    @Test
    fun `자동차 생성 테스트`() {
        // given
        val name = "강호동"

        // when
        val car = Car(name, null)

        // then
        assertThat(car).extracting("name", "position")
            .contains(name, 0)
    }

    @Test
    fun `자동차 생성 실패 테스트 - 이름 5글자 초과`() {
        // given
        val name = "강호동유재석박명수"

        // when
        // then
        assertThrows<IllegalArgumentException> {
            Car(name, null)
        }
    }

    @Test
    fun `자동차 랜덤 이동 테스트`() {
        // given
        val name = "강호동"
        val randomNumber = (Math.random() * 10 + 4).toInt()

        val movableStrategy = MovableStrategy { randomNumber >= 4 }
        val car = Car(name, movableStrategy)

        // when
        car.move()

        // then
        assertThat(car.position).isEqualTo(1)
    }

    @Test
    fun `자동차 랜덤 이동 실패 테스트`() {
        // given
        val name = "강호동"
        val randomNumber = (Math.random() + 3).toInt()

        val movableStrategy = MovableStrategy { randomNumber >= 4 }
        val car = Car(name, movableStrategy);

        // when
        car.move()

        // then
        assertThat(car.position).isEqualTo(0)
    }

}
