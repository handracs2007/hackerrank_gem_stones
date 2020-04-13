// https://www.hackerrank.com/challenges/gem-stones/problem

fun gemstones(arr: Array<String>): Int {
    var intersection = setOf<Char>()

    for (i in 1 until arr.size) {
        val stone1 = if (i == 1) arr[i - 1].toSet() else intersection
        val stone2 = arr[i].toSet()

        intersection = stone1.intersect(stone2)
    }

    return intersection.size
}

fun main() {
    println(gemstones(arrayOf("abcdde", "baccd", "eeabg")))
}