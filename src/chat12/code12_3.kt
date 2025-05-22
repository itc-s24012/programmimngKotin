package chat12

import kotlin.random.Random

fun main () {
    val x = Random.Default.nextInt(1,5)
    when (x) {
        1, 2 -> println("ワンツーのどちらかです")
        3 -> println("スリー")
        else -> println("ワン、ツー、スリー以外の数字です")
    }
}