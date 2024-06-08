import kotlin.random.Random

data class Empolyee(val name: String, var salary: Int)

class RandomEmpolyeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

    fun generateEmpolyee(): Empolyee {
        return Empolyee(
            names.random(),
            Random.nextInt(from = minSalary, until = maxSalary)
//            (minSalary..maxSalary).random()
        )
    }
}