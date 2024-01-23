package controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CarRaceTest {

    @Test
    fun `자동차 1대를 경주를 4회만큼 이동 테스트`() {
        // given
        val names = listOf("강호동")
        val times = 4

        // when
        val carRace = CarRace(names , times)
        val cars = carRace.start()

        // then
        assertThat(cars.cars[0].curPosition()).isGreaterThan(0)
    }

        @Test
    fun `자동차 1대를 경주를 0회 입력 후 거리가 0인지 테스트`() {
        // given
        val names = listOf("강호동")
        val times = 0

        // when
        val carRace = CarRace(names , times)
        val cars = carRace.start()

        // then
        assertThat(cars.cars[0].curPosition()).isEqualTo(0)
    }

}
