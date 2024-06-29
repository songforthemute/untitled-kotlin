package collections

/**
 * associateBy/groupBy 함수는 지정된 키로 인덱싱된 컬렉션의 요소에서 map을 생성
 * 키는 keySelector 매개변수에 정의됨
 * 선택적 valueSelector를 지정해 맵 요소의 값에 저장할 내용을 정의할 수도 있음
 *
 * associateBy는 마지막으로 적합한 요소를 값으로 사용
 * groupBy는 모든 적합한 요소의 목록을 작성해 값으로 사용
 *
 * 반환된 map은 원래 컬렉션의 항목 반복 순서를 유지함
 */

data class Person(val name: String, val city: String, val phone: String)

val people = listOf(
    Person("John", "Boston", "123-456"),
    Person("Sarah", "Mumbai", "789-012"),
    Person("Mike", "New York", "345-678"),
    Person("John", "Boston", "123-456")
)

val phoneBook = people.associateBy { it.phone }
val cityBook = people.associateBy(Person::phone, Person::city)
val peopleCities = people.groupBy(Person::city, Person::name)
val lastPersonCity = people.associateBy(Person::city, Person::name)

fun doAssociateGroup() {
    println(phoneBook) // {123-456=Person(name=John, city=Boston, phone=123-456), 789-012=Person(name=Sarah, city=Mumbai, phone=789-012), 345-678=Person(name=Mike, city=New York, phone=345-678)}
    println(cityBook) // {123-456=Boston, 789-012=Mumbai, 345-678=New York}
    println(peopleCities) // {Boston=[John, John], Mumbai=[Sarah], New York=[Mike]}
    println(lastPersonCity) // {Boston=John, Mumbai=Sarah, New York=Mike}
}