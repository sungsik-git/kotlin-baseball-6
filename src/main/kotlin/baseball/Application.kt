package baseball

import camp.nextstep.edu.missionutils.Randoms

fun main() {
    //TODO("프로그램 구현")
    val computer = makeRandomNumber()
    print(computer) //Debug
}

fun makeRandomNumber() : MutableList<Int> {
    val computer = mutableListOf<Int>()
    while (computer.size < 3) {
        val randomNumber = Randoms.pickNumberInRange(1, 9)
        if (!computer.contains(randomNumber)) {
            computer.add(randomNumber)
        }
    }
    return computer
}