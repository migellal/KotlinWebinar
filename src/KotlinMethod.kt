fun doSth(str: String) {
    println(str.length)
}

fun doSth2(str: String?) {
    println(str?.length)
    println(str?.length ?: -1)
    println(str!!.length)
}