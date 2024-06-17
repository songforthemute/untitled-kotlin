package generics

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(e: E) = elements.add(e)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size - 1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun generics() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack) // MutableStack(0.62, 3.14, 2.7)
}