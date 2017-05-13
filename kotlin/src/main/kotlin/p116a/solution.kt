package p116a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/13.
 */
fun main(vararg args: String) {
    var n = readLine()!!.toInt()
    var max = 0
    var total = 0
    for (i in 1..n) {
        var (a, b) = readLine()!!.split(' ').map(String::toInt)
        total -= a
        total += b
        if (total > max) {
            max = total
        }
    }
    print(max)
}
