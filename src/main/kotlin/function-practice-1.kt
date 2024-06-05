import kotlin.math.PI
import kotlin.math.pow

fun circleArea(radius: Int): Double {
    val radiusToDouble = radius.toDouble()
    val result = radiusToDouble.pow(2) * PI

    return result
}

fun circleAreaSingle(radius: Int): Double = radius.toDouble().pow(2) * PI

fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0): Int {
    return ((hours * 60) + minutes) * 60 + seconds
}