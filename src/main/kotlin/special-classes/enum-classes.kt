package `special-classes`

/**
 * Enum 클래스는 방향, 상태, 모드 등
 * 고유한 값의 고유한 집합을 나타내는 타입을 모델링하는 데 사용
 *
 * Enum은 세미콜론으로 Enum 상수 목록에서 분리된 다른 클래스와 같은 속성과 메서드를 포함 가능
 */

enum class State {
    IDLE, RUNNING, FINISHED
}

fun doEnumClasses() {
    val state = State.RUNNING

    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }

    println(message) // It's running
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun doColorEnumClasses() {
    val red = Color.RED
    println(red) // RED
    println(red.containsRed()) // true
    println(Color.BLUE.containsRed()) // false
    println(Color.YELLOW.containsRed()) // true
}

