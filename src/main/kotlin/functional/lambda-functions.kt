package functional

/**
 * 단일 매개변수를 갖는 람다의 경우 명시적으로 이름을 지정할 필요가 없으며, 대신 암시적 변수 it를 사용 가능
 * 람다가 단일 함수 호출로 구성된 경우 함수 포인터(::)를 사용 가능
 */

val upperCase1: (String) -> String = { str: String -> str.uppercase() }
var upperCase2: (String) -> String = { str -> str.uppercase() }
val upperCase3 = { str: String -> str.uppercase() }
//val upperCase4 = { str -> str.uppercase() } // error

val upperCase5: (String) -> String = { it.uppercase() }
val upperCase6: (String) -> String = String::uppercase