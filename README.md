# Kotlin
- Docs from [Kotlinlang.org](https://kotlinlang.org/docs/kotlin-tour-hello-world.html)
- [Kotlin in IntelliJ](https://wikidocs.net/173844)

## 목차
1. [Hello world](#hello-world)
   - [Hello world](#1-hello-world)
   - [Variables](#2-variables)
     - [String templates](#string-templates)
2. [Basic types](#basic-types)
3. [Collections](#collections)
   - [List](#list)
     - [Casting](#casting)
   - [Set](#set)
   - [Map](#map)
4. [Control Flow](#control-flow)
   - [Conditional Expressions](#conditional-expressions)
   - [Ranges](#ranges)
   - [Loops](#loops)
5. [Functions](#functions)
   - [Named arguments](#named-arguments)
   - [Default parameter](#default-parameter)
   - [Functions without return](#functions-without-return)
   - [Single-expression functions](#single-expression-functions)
   - [Lambda expression](#lambda-expressions)
   - [Assign to variable](#assign-to-variable)
   - [Pass to another function](#pass-to-another-function)
   - [Return from a function](#return-from-a-function)
   - [Invoke separately](#invoke-separately)
   - [Trailing lambdas](#trailing-lambdas)
6. [Classes](#classes)
   - [Properties](#properties)
   - [Create instance](#create-instance)
   - [Access properties](#access-properties)
   - [Member functions](#member-functions)
   - [Data classes](#data-classes)
     - [Print as string](#print-as-string)
     - [Compare instances](#compare-instances)
     - [Copy Instance](#copy-instance)
7. [Null safety](#null-safety)
    - [Nullable types](#nullable-types)

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

### Control Flow
#### Conditional Expressions
##### **`if`**
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
##### **`when`**
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

hello() // Hello, world!

fun sum(x: Int, y: Int): Unt {
    return x + y
}

println(sum(1, 2)) // 3
```

#### Named arguments
```kt
fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun main() {
    // Use named argumnets with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello 
}
```
- 매개변수 이름을 포함하면 어떤 순서로든 매개변수를 작성 가능

#### Default parameter
```kotlin
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
  println("[$prefix] $message")
}

printMessageWithPrefix("Hello", "Log") // [Log] Hello
printMessageWithPrefix("Hello") // [Info] Hello
printMessageWithPrefix(prefix = "Log", message = "Hello") // [Log] Hello
```

#### Functions without return
```kt
fun printMessage(message: String) {
    println(message)
    // `return Unit` or `return` is optional
}

printMessage("Hello") // Hello
```
- 함수가 useful value를 반환하지 않는 경우, `Unit` 타입 반환
- `Unit` 타입은 값이 단 하나만 있는 타입
- 함수 본문에서 `Unit`이 반환된다는 것을 명시할 필요는 없음

#### Single-expression functions
```kotlin
fun sum1(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int) = x + y
```

#### Lambda expressions
```kotlin
fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun main() {
    println(uppercaseString("hello")) // HELLO
    println({ text: String -> text.uppercase() }("hello")) // HELLO
    { println("Log message") } // Log message
}
```

##### Assign to variable
```kotlin
val upperCaseString = { text: String -> text.uppercase() }
println(upperCaseString("hello")) // HELLO
```

##### Pass to another function
```kt
val numbers: List<Int> = listOf(1, -2, 3, -4, 5, -6)
val positives = numbers.filter { x -> x > 0 }
val negatives = numbers.filter { x -> x < 0 }
println(positives) // [1, 3, 5]
println(negatives) // [-2, -4, -6]

val doubled = numbers.map { x -> x * 2 }
val tripled = numbers.map { x -> x * 3 }
println(doubled) // [2, -4, 6, -8, 10, -12]
println(tripled) // [3, -6, 9, -12, 15, -18]
```

##### Return from a function
```kt
fun toSeconds(time: String): (Int) -> Int = when (time) {
  "hour" -> { value -> value * 60.pow() }
  "minute" -> { value -> value * 60 }
  "second" -> { value -> value }
  else -> { value -> value }
}

val timesInMinutes: List<Int> = listOf(2, 10, 15, 1)
val min2sec = toSeconds("minute")
val totalTimeInSeconds = timesInMinutes.map(min2Sec).sum()
println("Total tiem is $totalTimeInSeconds secs") // Total time is 1680 secs
```

##### Invoke separately
```kotlin
println({ text: String -> text.uppercase() }) // HELLO
```
- 람다 표현식은 중괄호 뒤에 소괄호를 추가하고, 매개 변수를 포함하면 자체적으로 호출 가능

##### Trailing lambdas
```kotlin
// The initial value is zero.
// The operation sums the initial value with every item in the list cumulatively.
println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

// Alternatively, in the form of a trailing lambda
println(listOf(1, 2, 3).fold(0) { x, item -> x + item }) // 6
```
- 람다 표현식이 유일한 함수 매개 변수인 경우, 함수 괄호를 삭제 가능
- 람다 표현식이 함수의 마지막 매개 변수로 전달되는 경우, 함수 괄호 밖에 표현식 작성 가능
  - 이를 **후행 람다**라고 함

### Classes
```kotlin
class Customer
```

#### Properties
```kotlin
class Contact(val id: Int, var email: String = "example@gmail.com") {
   val category: String = "work
}
```
- 클래스 인스턴스가 생성된 후 변경해야 하는 경우가 아니라면, 프로퍼티를 read-only(`val`)로 선언하는 것이 좋음
- 괄호 안에 `val`, `var` 없이 프로퍼티를 선언할 수 있지만, 인스턴스가 생성된 후에는 이러한 프로퍼티에 액세스 불가
- 소괄호 내 포함된 콘텐츠를 **클래스 헤더**라고 함
- 클래스 속성을 선언할 때 [후행 쉼표](https://kotlinlang.org/docs/coding-conventions.html#trailing-commas)를 사용할 수 있음

#### Create instance
```kotlin
class Contact(val id: Int, var email: String)

fun main() {
   val contact = Contact(1, "mary@gmail.com")
}
```
- 클래스에서 객체를 생성하려면, [생성자(constructor)](https://kotlinlang.org/docs/classes.html#constructors)를 이용해 클래스 인스턴스 선언
- 기본적으로 Kotlin은 클래스 헤더에 선언된 매개 변수를 사용해 생성자 자동 생성
- Kotlin 클래스에는 사용자가 직접 정의한 생성자를 포함해 여러 생성자가 존재 가능

#### Access properties
```kotlin
class Contact(val id: Int, var email: String)

fun main() {
   val contact = Contact(1, "mary@gmail.com")

   // Prints the value of property: email
   println(contact.email) // mary@gmail.com

   // Updates the value of the property: email
   contact.email = "jane@gmail.com"

   // Prints the new value of the property: email
   println(contact.email)
   // jane@gmail.com
   
   println("Their email address is: ${contact.email}")
}
```

#### Member functions
```kotlin
class Contact (val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    // Calls member function printId()
    contact.printId()
    // 1
}
```
- 객체 특성의 일부로 프로퍼티를 선언하는 것 외에도 멤버 함수를 사용해 객체의 동작을 정의할 수 있음

#### Data classes
```kotlin
data class User(val name: String, val id: Int)
```

| Functions          | Description                         |
|--------------------|-------------------------------------|
| `.toString()`      | 클래스 인스턴스와 그 프로퍼티를 문자열로 출력           |
| `.equals()` or `==` | 클래스의 인스턴스 비교                        |
| `.copy()` | 다른 속성을 가진 클래스 인스턴스를 복사해 클래스 인스턴스 생성 |

- 데이터 클래스는 클래스와 동일한 기능을 갖지만, 멤버 함수가 자동으로 제공됨
- 이러한 함수는 자동으로 사용할 수 있으므로 보일러플레이트를 작성할 필요가 없음

##### Print as string
```kotlin
val user = User("Alex", 1)

// Automatically uses toString() function so that output is easy to read
println(user) // User(name=Alex, id=1)
```

##### Compare instances
```kotlin
val user = User("Alex", 1)
val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)

// Compares user to second user
println("user === secondUser: ${user == secondUser}") // user == secondUser: true

// Compares user to third user
println("user == thirdUser: ${user == thirdUser}") // user == thirdUser: false
```

##### Copy instance
```kotlin
val user = User("Alex", 1)
val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)

// Create an exact copy of user
println(user.copy()) // User(name=Alex, id=1)

// Creates a copy of user with name: "Max"
println(user.copy("Max")) // User(name=Max, id=1)

// Creates a copy of user with id: 3
println(user.copy(id = 3)) // User(name=Alex, id=3)
```
- 데이터 클래스 인스턴스의 정확한 복사본을 만들려면 인스턴스에서 `.copy()` 함수를 호출
- 데이터 클래스 인스턴스의 복사본을 만들고 일부 속성을 변경하려면, 인스턴스 `.copy()` 함수를 호출하고 속성의 대체 값을 함수 매개 변수로 추가
- 인스턴스의 복사본을 만드는 것이, 원본 인스턴스를 수정하는 것보다 안전함
  - 원본 인스턴스에 의존하는 모든 코드는 복사본과 복사본으로 수행하는 작업의 영향을 받지 않기 때문
  - [Data classes docs](https://kotlinlang.org/docs/data-classes.html)

### Null safety
- Kotlin에서는 `null` 값을 가질 수 있음
- 프로그램에서 `null`값으로 인한 문제를 방지하기 위해 Kotlin에는 null safety 기능 존재
- null safety는 런타임이 아닌, 컴파일 시점에 null 값의 잠재적 문제를 감지함

#### Nullable types