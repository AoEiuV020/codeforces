package p231a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val scanner = Scanner(System.`in`)
    val n = readLine()!!.toInt()
    var count = 0
    for (i in 1..n) {
        if (readLine()!!.split(' ').sumBy { it.toInt() } >= 2) {
            ++count
        }
    }
    print(count)
}
