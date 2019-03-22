fun countE(str: String): Int {
    return str.count {
        it.toLowerCase() == 'e'
    }

}

fun String.countE2(): Int {
    return this.count {
        it.toLowerCase() == 'e'
    }
}