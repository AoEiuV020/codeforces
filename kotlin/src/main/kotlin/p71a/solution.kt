package p71a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        var word = readLine()!!
        if (word.length > 10) {
            word = "${word.first()}${word.length - 2}${word.last()}"
        }
        println(word)
    }
}
