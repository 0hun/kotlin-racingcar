import controller.CarRace
import view.InputView


fun main(args: Array<String>) {
    val names: List<String> = InputView.inputNames()
    val times: Int = InputView.inputTimes()

    val carRace = CarRace(names, times)
    carRace.start()
}
