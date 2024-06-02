# Kotlin
- Docs from [Kotlinlang.org](https://kotlinlang.org/docs/kotlin-tour-hello-world.html)
- [Kotlin in IntelliJ](https://wikidocs.net/173844)

## 목차
1. [Hello world](#hello-world)
2. [Basic types](#basic-types)
3. [Collections](#collections)

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
- 