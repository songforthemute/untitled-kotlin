package collections

val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)
val positives = numbers.filter { x -> x > 0 }
val negatives = numbers.filter { it < 0 }