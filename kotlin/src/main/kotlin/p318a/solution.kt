package p318a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/06/09.
 */
fun main(vararg args: String) {
    val (n, k) = readLine()!!.split(' ').map { it.toLong() }
    val m = (n + 1) / 2
    print(if (k > m) 2 * (k - m) else 2 * k - 1)
    //print(((2 * (k - m)).takeIf { k > m } ?: (2 * k - 1)))
}
