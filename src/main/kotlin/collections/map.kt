package collections

/**
 * 맵은 키/값 쌍의 모음으로, 각 키는 고유하며 해당 값을 검색하는 데 사용
 * infix 함수를 사용하면 초기화 시 노이즈가 감소함(?)
 */

const val POINTS_X_PASS: Int = 15

val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) -> println("ID $k: credit ${v}") }
}

fun doMap() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}

/**
 * EZ-Pass report:
 * ID 1: credit 100
 * ID 2: credit 100
 * ID 3: credit 100
 * Updating 1...
 * Updating 1...
 * Error: Trying to update a non-existing account (id: 5)
 * EZ-Pass report:
 * ID 1: credit 130
 * ID 2: credit 100
 * ID 3: credit 100
 */