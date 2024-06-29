package collections

/**
 * zip 함수는 주어진 두 컬렉션을 새 컬렉션으로 병합
 * 기본적으로 결과 컬렉션에는 인덱스가 같은 원본 컬렉션 요소 pair가 포함됨
 *
 * 하지만 결과 컬렉션 요소 구조를 직접 정의 가능
 * 결과 컬렉션의 크기는 원본 컬렉션의 최소 크기와 동일
 */

val A = listOf("a", "b", "c", "d")
val B = listOf(1, 2, 3, 4)

val resultPairs = A zip B // [(a, 1), (b, 2), (c, 3), (d, 4)]
val resultReduce = A.zip(B) { a, b -> "$a$b" } // [a1, b2, c3, d4]

fun doZip() {
    println("A = $A")
    println("B = $B")
    println("resultPairs = $resultPairs")
    println("resultReduce = $resultReduce")
}