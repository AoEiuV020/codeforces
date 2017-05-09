package p158b;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var count = 0
    val l = IntArray(5) // l[0] unused,
    for (i in 1..n) {
        ++l[scanner.nextInt()]
    }
    count += l[4]
    count += l[3]
    l[1] -= l[3]
    count += l[2] / 2
    l[2] %= 2
    if (l[2] == 1) {
        ++count
        l[1] -= 2
    }
    if (l[1] > 0) {
        count += l[1] / 4
        l[1] %= 4
    }
    if (l[1] > 0) {
        ++count
    }
    print(count)
}
