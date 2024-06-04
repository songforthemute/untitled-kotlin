# Kotlin
- Docs from [Kotlinlang.org](https://kotlinlang.org/docs/kotlin-tour-hello-world.html)
- [Kotlin in IntelliJ](https://wikidocs.net/173844)

## 목차
1. [Hello world](#hello-world)
2. [Basic types](#basic-types)
3. [Collections](#collections)
4. [Functions](#functions)

### Hello world
#### 1. Hello world
```kt
fun main() {
    println("Hello, world!")
}
```
- `fun` 함수 정의
- `main()` 프로그램이 시작되는 엔트리 포인트
- `println()`, `print()` 표준 출력 함수

#### 2. Variables
```kt
val popcorn = 5
val hotdog = 7

var customers = 10

customers = 8

println(customers) // 8
```
- `val` read-only 변수
- `var` mutable 변수

##### String templates
```kt
val customers = 10
println('There are $customers customers') // There are 10 customers
println('There are ${customers + 1} customers') // There are ${customers + 1} customers
```
- 문자열 템플릿을 사용하면, 변수 내용을 표준 출력으로 내보내기 편리함
- 템플릿 표현식을 사용해 변수 및 기타 객체에 저장된 데이터 액세스하고, 이를 문자열로 변환 가능
- [_more docs..._](https://kotlinlang.org/docs/strings.html)
- Kotlin은 타입 추론 기능이 존재함

### Basic Types
```kt
val c = "world"

val d: Int
d = 3

val e: string = "hello"

println(c) // world
println(d) // 3
println(e) // hello
```
- Kotlin의 모든 변수 및 데이터 구조에는 데이터 유형이 존재
  - 데이터 유형은 컴파일러에 해당 변수/데이터 구조로 수행할 수 있는 작업을 알려줌
  - 즉, 어떤 함수와 속성을 갖고 있는지 알려줌
- Kotlin은 타입 추론 기능이 존재
  - 컴파일러는 이를 통해 어떤 작업을 수행할 수 있음을 인지

| Category      | Basic types                 |
|---------------|-----------------------------|
| Integers      | `Byte`, `Short`, `Int`, `Long`      |
| Unsigned Integers | `UByte`, `UShort`, `UInt`, `ULong` |
| Floating-point numbers | `Float`, `Double` |
| Booleans | `Boolean` |
| Characters | `Char` |
| Strings | `String` |

### Collections
| Collection type | Description                |
| --------------- |----------------------------|
| Lists | 순서가 있는 컬렉션                 |
| Sets | 고유한 비순차적 컬렉션               |
| Maps | 하나의 값에만 매핑되는 고유한 키-값 세트 집합 |
- 각 컬렉션 타입은 <u>mutable</u>하거나 <u>read-only</u>일 수 있음

#### List
```kt
// Read only list
val readOnlyShapes = listOf("triangle", "square", "circle")
println(readOnlyShapes) // [triangle, square, circle]

// Mutable list with explicit type declaration
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
println(shapes) // [triangle, square, circle]

println(shapes[0]) // triangle
println("${shapes.first()}, ${shapes.last()}") // triangle, circle

println(readOnlyShapes.count()) // 3

println("circle" in readOnlyShapes) // true

shapes.add("pentagon")
println(shapes) // [triangle, square, circle, pentagon]

shapes.remove("pentagon")
println(shapes) // [triangle, square, circle]
```
- 아이템을 추가한 순서대로 나열
- 중복 아이템 허용
- 리스트를 생성할 때, Kotlin은 저장된 아이템의 타입 추론
- 목록의 항목에 액세스하려면 인덱스 연산자 `[]` 사용
- `listOf()` 읽기 전용 리스트 생성
- `mutableListOf()` 변경 가능한 리스트 생성
- `.first()`, `.last()` 리스트의 첫/마지막 아이템에 접근
  - [확장 함수(extension functions)](https://kotlinlang.org/docs/extensions.html#extension-functions)
- `.count()` 리스트의 길이 반환
- `in` 리스트가 해당 아이템을 가지고 있는지 검사하는 연산자
- `.add()`, `.remove()` 특정 아이템을 리스트에 추가/삭제

##### Casting
```kt
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapesLocked: List<String> = shapes
```
- 원치 않는 수정을 방지하기 위해 `mutableList`를 `list`에 할당해서 read-only를 얻을 수 있음

#### Set
```kt
// Read-only set
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

println(readOnlyFruit) // [apple, banana, cherry]

val fruitLocked: Set<String> = fruit

println("This set has ${readOnlyFruit.count()} items") // This set has 3 items

fruit.add("dragonfruit")
println(fruit) // [apple, banana, cherry, dragonfruit]

fruit.remove("dragonfruit")
println(fruit) // [apple, banana, cherry]
```
- 정렬되지 않고, 고유 항목만 저장
  - 세트는 순서가 지정되지 않으므로, 특정 인덱스 항목에 액세스 불가
  - 세트를 생성할 때 Kotlin은 저장된 항목의 유형을 유추 가능
  - 원치 않는 변경을 방지하기 위해서 **캐스팅** 사용 가능
- `setOf()` 읽기 전용 세트 생성
- `mutableSetOf()` 변경 가능한 세트 생성
- `.count()` 세트의 항목 개수 반환
- `in` 세트가 해당 아이템을 가지고 있는지 검사하는 연산자
- `.add()`, `.remove()` 세트에 아이템 추가/삭제

#### Map
```kt
// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to "100")
println(readOnlyJuiceMenu) // {apple=100, kiwi=190, orange=100}

// Mutable map with explicit type declaration
val juiceMenu = MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(juiceMenu) // {apple=100, kiwi=190, orange=100}

// Prevent unwanted modifications, obtain read-only views of mutable maps by casting
val juiceMenuLocked: Map<String, Int> = juiceMenu

println(readOnlyJuiceMenu["apple"]) // 100
println(readOnlyJuiceMenu.count()) // 3

juiceMenu.put("coconut", 150)
println(juiceMenu) // {apple=100, kiwi=190, orange=100, coconut=150}

juiceMenu.remove("orange")
println(juiceMenu) // {apple=100, kiwi=190, coconut=150}

println(readOnlyJuiceMenu.containsKey("kiwi")) // true

println(readOnlyJuiceMenu.keys) // [apple, kiwi, orange]
println(readOnlyJuiceMenu.value) // [100, 190, 100]

println("orange" in readOnlyJuiceMenu.keys) // true
println(200 in readOnlyJuiceMenu.values) // false
```
- 항목을 키-값 쌍으로 저장
  - 키를 참조하여 값에 액세스
  - 맵을 생성할 때 Kotlin은 아이템의 타입 추론
- `mapOf()` 읽기 전용 맵 생성
- `mutableMapOf()` 변경 가능한 맵 생성
- `[key] **to** [value]`
- `map[key] // value`
- `.count()` 맵에 저장된 항목의 수
- `.put()`, `.remove()` 맵에 항목을 추가/제거
- `.containsKey()` 해당 키가 맵에 존재하는지 여부
- `.keys`, `.values` 맵에 존재하는 키/값 목록을 리스트로 반환
  - `.keys`, `.values` 는 객체의 프로퍼티

#### Control Flow
##### Conditional Expressions
###### **`if`**
```kt
val d: Int
val check: Boolean = true

if (check) {
    d = 1
} else {
    d = 2
}

println(d) // 1

val a = 1
val b = 2
pinrtln(if (a > b) a else b) // 2
```
###### **`when`**
```kotlin
val obj = "Hello"

when (obj) {
    // Check whether obj equals to "1"
    "1" -> println("One")
    // Check whether obj equals to "Hello"
  "Hello" -> println("Greeting")
    // Default statement
    else -> println("Unknown")
} // Greeting

val result = when (obj) {
    // If obj equals "1", sets result to "one"
    "1" -> "One"
    // If obj equals "Hello", sets result to "Greeting"
    "Hello" -> "Greeting"
    // Sets result to "Unknown" if no previous condition is satisfied
    else -> "Unknown"
}

println(result) // Greeting

val temp = 18
val description = when {
    temp < 0 -> "very cold"
    temp < 10 -> "a bit cold"
    temp < 20 -> "warm"
    else -> "hot"
}

println(description) // warm
```

#### Ranges
- `1..4` 1, 2, 3, 4
- `1..<4` 1, 2, 3
- `4 downTo 1` 4, 3, 2, 1
- `1..5 step 2` 1, 3, 5
- `'a'..'d'` 'a', 'b', 'c', 'd'
- `'z' downTo 's' step 2` 'z', 'x', 'v', 't'

#### Loops
```kt
// for 
for (number in 1..5) {
    // number is the iterator and 1..5 is the range
    print(number)
} // 12345

val cakes = listOf("carrot", "cheese", "chocolate")
for (cake in cakes) {
    println("Yummy, it's a $cake cake!")
}
// Yummy, it's a carrot cake!
// Yummy, it's a cheese cake!
// Yummy, it's a chocolate cake!

// while
var cakesEaten = 0
while (cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++
}
// Eat a cake
// Eat a cake
// Eat a cake

var cakesBaked: Int = 0
do {
    pritnln("Bake a cake")
    cakesBaked++
} while (cakesBaked < cakesEaten)
// Bake a cake
// Bake a cake
// Bake a cake
```

### Functions
```kotlin
fun hello() {
    return println("Hello, world!")
}

fun main() {
    hello() // Hello, world!
}
```
- `fun` 키워드로 함수 선언