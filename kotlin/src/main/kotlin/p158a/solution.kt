package p158a;

import java.util.Scanner
/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val k = scanner.nextInt()
    var count = 0
    var lastScore = 0
    loop@for (i in 1..n) {
        val score = scanner.nextInt()
        when {
            score == 0 -> break@loop
            i < k -> ++count
            i == k -> {
                ++count
                lastScore = score
            }
            score == lastScore -> ++count
            else -> break@loop
        }
    }
    print(count)
}
