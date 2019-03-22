fun main() {
    val javaMethod = JavaMethod()
//    javaMethod.doSth(null)
//    javaMethod.doSth2(null)
//    javaMethod.doSth3(null) // yolo

//    val str1: String = null
    val str2: String? = "value here"
//    doSth(str2)
    doSth2(str2)
    println()

    val text1 = "some value"
    var text2 = "some variable"

    println(text2)

    val eeny = """
Eeny, meeny, miny, moe,
Catch a tiger by the toe.
If he hollers, let it go,
Eeny, meeny, miny, moe.
    """

    println(countE(eeny))

    println(eeny.countE2())

    println(countE(eeny) == eeny.countE2())

    val list = listOf("", "", "Kotlin", "Kotlin", "Kotlin", "Java")
    val javaStringCounter = JavaStringCounter()
    println(javaStringCounter.foo(list))
    val kotlinStringCounter = KotlinStringCounter()
    println(kotlinStringCounter.foo(list))
    println()
    println(kotlinStringCounter.countString(list))
    println()
    println(list.filterOnCondition {
        !it.contains("a")
    })
}

var a = 0
fun sideEffect(i: Int) { // nooooooooooooooooooooooooooooo!!!
    a += i
}