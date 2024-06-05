fun lambda1() {
    val actions: List<String> = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls: List<String> = actions.map { action -> "$prefix/$id/$action" }

    println(urls)
}

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) action()
}