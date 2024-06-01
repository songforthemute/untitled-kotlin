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
