package functions

/**
 * 특정 함수를 연산자로 '업그레이드'하여 해당 연산자 기호로 호출 가능
 */

// .times()의 연산자 기호는 *
// println(2 * "Bye ") // Bye Bye
operator fun Int.times(str: String) = str.repeat(this)

// 연산자 함수를 사용하면 문자열에서 쉽게 range에 액세스 가능
// val str = "Always forgive your enemies; nothing annoys them so much."
// println(str[0..14]) // Always forgive
operator fun String.get(range: IntRange) = substring(range)