const val ATTRIBUTE = "val"

fun main (args: Array<String>) {
    val playerName = "Estragon"
    val name = "Petya"
    var experiencePoints = 2
    val status = when (experiencePoints){
        1 -> "FAILED, $name"
        in 2..3 -> "LOOSER, ${2 + 3}"
        4 -> "GOOD ONE"
        5 -> "EXCELLENT"
        else -> "CANT FIGURE OUT"

    }
    println(status)
    println(getSuperString(10))
}

private fun getSuperString (Count : Int) : String {
    var result = ""
    for (i in 1 .. Count){
        result += "Opa "
    }
    return result
}