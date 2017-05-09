package p112a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val a = readLine()!!
    val b = readLine()!!
    val comp = a.compareTo(b, true)
    print(when {
        comp < 0 -> -1
        comp == 0 -> 0
        else -> 1
    })
}
