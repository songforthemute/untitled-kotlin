package functions

/**
 * vararg 수정자는 매개변수를 vararg로 변환
 * 이렇게 하면 원하는 수의 문자열 인수를 사용해 함수를 호출 가능하며,
 * 쉼표로 구분해 인수를 여러 개 전달 가능
 *
 * 값을 vararg 매개변수로 전달하려면 특수 스프레드 연산자 *를 사용해 항목(Array<String>) 대신,
 *  * 엔트리(문자열의 vararg)를 전달 가능
 */

/**
 * printAll("Hello", "Hallo", "Salut", "Hola", "你好")
 * Hello
 * Hallo
 * Salut
 * Hola
 * 你好
 */
fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

/**
 * printAllWithPrefix(
 *     "Hello", "Hallo", "Salut", "Hola", "你好",
 *     prefix = "Greeting: "                                          // 4
 * )
 * Greeting: Hello
 * Greeting: Hallo
 * Greeting: Salut
 * Greeting: Hola
 * Greeting: 你好
 */
fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

/**
 * log("Hello", "Hallo", "Salut", "Hola", "你好")
 * Hello
 * Hallo
 * Salut
 * Hola
 * 你好
 */
fun log(vararg entries: String) {
    printAll(*entries)
}