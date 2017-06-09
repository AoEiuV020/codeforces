package p3b;

import java.util.*

/**
 * 强行用贪心解01背包问题，
 * 代码相当混乱，
 * Created by AoEiuV020 on 2017/06/09-17:08:58.
 */
fun main(vararg args: String) {
    val (n, v) = readLine()!!.split(' ').map(String::toInt)
    var s = 0
    val l = LinkedList<Int>()
    var last = arrayOf<Int>(0, 0, 0)
    val m = Array(n) {
        val (t, p) = readLine()!!.split(' ').map(String::toInt)
        arrayOf(t, p, it + 1)
    }.sortedByDescending {
        it[1].toDouble() / it[0]
    }.sumBy {
        if (s + it[0] <= v) {
            s += it[0]
            l.add(it[2])
            if(it[0] == 1) {
                last = it
            }
            it[1]
        } else if (it[0] == 2 && s == v - 1 && last[0] == 1 && it[1] >= last[1]) {
            System.err.println("$s, ${it[0]}, ${it[1]}, ${last}")
            s += 1
            l.remove(last[2])
            l.add(it[2])
            val t = last[1]
            last = it
            it[1] - t
        } else {
            0
        }
    }
    println(m)
    println(l.joinToString(" "))
}
