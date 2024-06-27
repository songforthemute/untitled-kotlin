package collections

private val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

private val first = words.find { it.startsWith("some") }
private val last = words.findLast { it.startsWith("some") }

private val nothing = words.find { it.contains("nothing") }