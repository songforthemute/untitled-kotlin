package delegation

/**
 * 코틀린 표준 라이브러리에는 지연, 관찰 가능 등과 같은 유용한 델리게이트가 많음
 * 이러한 델리게이트는 바로 사용할 수 있으며,
 * 이를테면 lazy는 지연 초기화에 사용됨
 */

class LazySample {
    init {
        println("created!")
    }

    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }
}

fun doStandardDelegates() {
    /**
     * lazy 프로퍼티는 객체 생성 시 초기화되지 않음
     * get()을 처음 호출하면 lazy()에 인수로 전달된 람다 식을 실행하고 결과 저장
     * 이후, get()을 추가로 호출하면 저장된 결과 반환
     *
     * 스레드 안전성을 원한다면, 값이 하나의 스레드에서만 계산되고,
     * 모든 스레드에서 동일한 값을 볼 수 있도록 보장하는 blockingLazy() 사용
     */
    val sample = LazySample() // created!
    println("lazyStr = ${sample.lazyStr}")
    // computed!
    // lazyStr = my lazy
    println(" = ${sample.lazyStr}") // = my lazy
}