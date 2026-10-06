fun findMax(nombres: List<Int>, compare: (Int, Int) -> Int): Int {
    return nombres.reduce(compare)
}

fun main() {
    val maListe = listOf(15, 42, 8, 99, 23, 67)
    val maximum = findMax(maListe) { a, b -> if (a > b) a else b }

    println("Liste originale : $maListe")
    println("Le nombre le plus grand est : $maximum")
}