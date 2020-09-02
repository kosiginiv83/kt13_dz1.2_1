import kotlin.math.ceil


fun main() {
    val amount: Array<Int> = arrayOf(100_00, 1000_00, 4666_65, 4666_66, 4666_67, 5000_00)
    for (x in amount) {
        val result: Int = if (x < 4666_67) 3500 else ceil(x * 0.0075).toInt()
        println("С суммы $x коп. комиссия: $result коп.")
    }
}