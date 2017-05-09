package p96a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    var last = ' '
    var times = 0
    print(if (readLine()!!.any {
        when (it) {
            last -> ++times
            else -> {
                last = it
                times = 1
            }
        }
        times == 7
    }) "YES" else "NO")
}
