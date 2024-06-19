package `special-classes`

/**
 * 데이터 클래스를 사용하면 값을 저장하는 데 사용되는 클래스를 쉽게 만들 수 있음
 * 복사, 문자열 표현 가져오기와 컬렉션의 인스턴스 메서드가 자동으로 제공됨
 *
 * 클래스 선언에서 자체 구현으로 이러한 메서드를 재정의 가능
 */

data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) = other is User && other.id == this.id
}

fun doDataClasses() {
    val user = User("Alex", 1)
    println(user) // User(name=Alex, id=1)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}") // user == secondUser: true
    println("user == thirdUser: ${user == thirdUser}") // user == thirdUser: false

    // hashCode() function
    println(user.hashCode()) // 63347075
    println(secondUser.hashCode()) // 63347075
    println(thirdUser.hashCode()) // 2390846

    // copy() function
    println(user.copy()) // User(name=Alex, id=1)
    println(secondUser.copy()) // User(name=Alex, id=1)
    println(thirdUser.copy()) // User(name=Max, id=2)
    println(user.copy(id = 3)) // User(name=Alex, id=3)

    println("name = ${user.component1()}") // name = Alex
    println("id = ${user.component2()}") // id = 1
}