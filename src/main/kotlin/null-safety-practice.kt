data class Empleyee (val name: String, var salary: Int)

fun employeeById(id: Int) = when (id) {
    1 -> Empleyee("Alice", 3000)
    2 -> null
    3 -> Empleyee("Bob", 2000)
    4 -> Empleyee("Carol", 4000)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary?: 0
