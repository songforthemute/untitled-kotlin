package `scope-functions`

/**
 * also는 apply와 마찬가지로 주어진 블록을 실행하고 호출된 객체를 반환
 * 블록 내부에서 객체가 참조되므로 인자로 전달하기 더 쉬움
 *
 * 이 함수는 콜 체인 로그인과 같은 추가 작업을 임베드시킬 때 유용
 */

fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}

private val jake = Person("Jake", 30, "Android developer")
    .also {
        writeCreationLog(it)
    }

fun doAlso() {
    println(jake)
    /**
     * A new person Jake was created.
     * Person(name=Jake, age=30, about=Android developer)
     */
}