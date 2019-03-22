class KotlinStringCounter {

    fun foo(list: List<String>): Map<String, Int> {
        val result = mutableMapOf<String, Int>()
        for (str in list) {
            if (result.containsKey(str)) {
                val c = result[str]?.plus(1)
                if (c != null)
                    result[str] = c
            } else {
                result[str] = 1
            }
        }
        return result.toMap()
    }

    fun countStringPrev(list: List<String>): Map<String, Int> {
        val map: Map<String, Int> = list.groupBy {
            it
        }.mapValues { entry ->
            println(entry)
            entry.value.count()
        }
        return map
    }

    fun countString(list: List<String>): Map<String, Int> =
        list.groupBy {
            it
        }.mapValues {
            it.value.count()
        }

}

fun Iterable<String>.filterOnCondition(condition: (String) -> Boolean): ArrayList<String> {
    val result = arrayListOf<String>()
    for (item in this) {
        if (condition(item)) {
            result.add(item)
        }
    }
    return result
}