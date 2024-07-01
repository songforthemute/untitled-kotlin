package `scope-functions`

/**
 * apply는 객체에서 코드 블록을 실행하고 객체 자체를 반환
 * 블록 내에서 객체는 이 함수에 의해 참조됨
 * 객체를 초기화할 때 유용
 */

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

private val jake = Person()
private val stringDesc = jake.apply {
    name = "Jake"
    age = 30
    about = "Jake is a dude."
}.toString()

fun doApply() {
    println(jake)
    println(stringDesc)
}