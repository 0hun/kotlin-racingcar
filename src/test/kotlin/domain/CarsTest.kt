package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarsTest {

    @Test
    fun `자동차 목록 생성 테스트`() {
        // given
        val names = listOf("강호동", "유재색")

        // when
        val cars = CarFactory.makeCars(names)

        // then
        assertThat(cars.cars.size).isEqualTo(2)
    }

}
