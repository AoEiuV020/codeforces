package p500a;

import java.util.*

/**
 * 这题目并没有看懂，看别人代码还是没懂，随便了，
 * Created by AoEiuV020 on 2017/06/09-16:04:42.
 */
fun main(vararg args: String) {
    var (n, t) = readLine()!!.split(' ').map(String::toInt)
    t = t - 1
    val a = readLine()!!.split(' ').map(String::toInt)
    var s = 0
    while (s < t) {
        s += a[s]
    }
    print(if (s == t) "YES" else "NO")
}
