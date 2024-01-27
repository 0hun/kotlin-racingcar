package view

object InputView {
    tailrec fun inputNames(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)")
        return readLine()?.replace(" ", "")?.split(",") ?: inputNames()
    }

    tailrec fun inputTimes(): Int {
        println("시도할 회수는 몇회인가요?")
        return readLine()?.toIntOrNull() ?: inputTimes()
    }
}
