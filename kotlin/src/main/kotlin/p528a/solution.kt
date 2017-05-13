package p528a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/13.
 */
fun main(vararg args: String) {
    //val scanner = Scanner(System.`in`)
    var (w, h, n) = readLine()!!.split(' ').map(String::toInt)
    var wa = LinkedList<Int>()
    var ha = LinkedList<Int>()
    wa.add(w)
    ha.add(h)
    var wb = mutableListOf<Int>(w)
    var hb = mutableListOf<Int>(h)
    fun MutableList<Int>.insert(i: Int, b: MutableCollection<Int>) {
        var ite = listIterator()
        var l = 0
        while (ite.hasNext()) {
            var n = ite.next()
            if (n > i) {
                ite.previous()
                ite.add(i)
                b.remove(n - l)
                b.add(n - i)
                b.add(i - l)
                break
            }
            l = n
        }
        if (!ite.hasNext()) {
            ite.add(i)
        }
    }
    fun maxInterval(list: Collection<Int>): Int {
        var l = 0
        var m = 0
        list.forEach {
            var s = it - l
            if (s > m) {
                m = s
            }
            l = it
        }
        return m
    }
    for (i in 1..n) {
        var (c, x) = readLine()!!.split(' ')
        if (c == "H") {
            ha.insert(x.toInt(), hb)
        } else {
            wa.insert(x.toInt(), wb)
        }
        println(wb.max()!! * hb.max()!!)
    }
}
