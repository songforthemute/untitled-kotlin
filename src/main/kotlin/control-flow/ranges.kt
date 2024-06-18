package `control-flow`

fun doRanges() {
    for (i in 0..3) {
        print(i) // 0123
    }

    for (i in 0 until 3) {
        print(i) // 012
    }

    for (i in 2..8 step 2) {
        print(i) // 2468
    }

    for (i in 3 downTo 0) {
        print(i) // 3210
    }

    for (c in 'a'..'d') {
        print(c) // abcd
    }

    for (c in 'z' downTo 's' step 2) {
        print(c) // zxvw
    }

    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5") // x is in range from 1 to 5
    }
    
    if (x !in 6..10) {
        print("x is not in range from 6 to 10") // x is not in range from 6 to 10
    }
}