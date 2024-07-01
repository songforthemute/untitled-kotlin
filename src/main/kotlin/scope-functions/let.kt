package `scope-functions`

/**
 * 코틀린 표준 라이브러리 함수 let은 범위 지정 및 null 검사에 사용
 * 객체에서 호출되면 let은 지정된 코드 블록을 실행하고 마지막 표현식의 결과 반환
 * 객체는 블록 내에서 참조(기본값) 또는 사용자 지정 이름을 통해 액세스 가능
 */

fun customPrint(string: String) {
    print(string.uppercase())
}

private val empty = "test".let {
    customPrint(it)
    it.isEmpty()
}

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstStr ->
        strTwo?.let { secondString ->
            customPrint("$firstStr : $secondString")
            println()
        }
    }
}

fun doLet() {
    println(empty) // TESTfalse
    println(" is empty: $empty") // is empty: false

    printNonNull(null) // Printing "null":
    printNonNull("my string")
    /**
     * Printing "my string":
     * 	MY STRING
     */
    printIfBothNonNull("First", "Second") // FIRST : SECOND
}