package `special-classes`

import java.util.*

/**
 * 코틀린의 클래스와 객체는 대부분의 객체 지향 언어와 동일한 방식으로 동작
 *
 * 코틀린에는 object 키워드도 존재하는데,
 * 이 키워드는 단일 구현(singleton pattern)으로 데이터 유형을 가져오는 데 사용
 * - 두 개의 스레드가 클래스를 생성하려고 시도해도 해당 클래스의 인스턴스가 하나만 생성되도록 보장
 *
 * 코틀린에서 이를 달성하려면, 클래스나 생성자 없이 lazy 인스턴스만 선언하면 됨
 * - 객체에 액세스할 때 한 번만 생성되기 때문
 */

class LuckDispatcher {
    fun getNumber() {
        val objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun doObjectKeyword() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber() // 26
    d2.getNumber() // 53
}

/**
 * object 표현식의 일반적인 사용법
 * 하나의 객체를 생성하고, 멤버를 생성하고, 하나의 함수 내에서 액세스.
 */

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    // 자바에서의 익명 클래스 역할
    val dayRates = object {
        val standard: Int = 30 * standardDays
        val festivity: Int = 50 * festivityDays
        val special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")
}

fun doRentPrice() {
    rentPrice(10, 2, 1) // Total price: $1620
}

/**
 * object 선언들 사용할 수도 있음
 * 이 선언은 표현식이 아니므로, 변수 할당에는 사용할 수 없음
 * 멤버에 직접 액세스하는 데 사용
 */

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth params: $username:$password")
    }
}

fun doDoAuth() {
    DoAuth.takeParams("foo", "qwerty") // input Auth params: foo:qwerty
}

/**
 * companion 객체
 *
 * 구문 상으로는 클래스 이름의 한정자로 사용하여, 객체 멤버를 호출하는 자바의 정적 메서드와 유사
 * 코틀린에서 companion 객체를 사용하려는 경우, 패키지 수준 함수를 대신 사용하는 것을 고려 가능
 *
 * 컴패니언 객체 메서드를 정의하면 해당 클래스를 통해
 * 컴패니언 객체 메서드를 호출 가능
 */
class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun doBigBen() {
    BigBen.getBongs(12) // BONG BONG BONG BONG BONG BONG BONG BONG BONG BONG BONG BONG
}