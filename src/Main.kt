fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String não nula"
    } else {
        return "String nula ou vazia"
    }
}

fun main() {
    var neverNull = "Hello World!"
    var nullable = null

    println(describeString(neverNull))
    println(describeString(nullable))
}