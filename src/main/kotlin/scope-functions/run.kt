package `scope-functions`

/**
 * let과 마찬가지로 run은 코틀린 표준 라이브러리의 범위 지정 함수
 * 기본적으로 코드 블록을 실행하고, 그 결과를 반환한다는 점은 동일하나,
 * 차이점은 run 내부에서 객체에 접근한다는 점.
 * 객체를 인수로 전달하지 않고 객체의 메서드를 호출하는 경우 유용
 */

fun getNullableLength(ns: String?) {
    println("for \"$ns\":")
    ns?.run {
        println("\tis empty? " + isEmpty())
        println("\tlength = $length")
        length
    }
}

fun doRun() {
    getNullableLength("")
    /**
     * for "":
     * 	is empty? true
     * 	length = 0
     */
    getNullableLength(null) // for "null":
    getNullableLength("what a kotlin")
    /**
     * for "what a kotlin":
     * 	is empty? false
     * 	length = 13
     */
}