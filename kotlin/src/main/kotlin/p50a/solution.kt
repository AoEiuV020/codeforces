package p50a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    print(when {
        n == 1 -> m / 2
        m == 1 -> n / 2
        n % 2 == 0 -> n / 2 * m
        m % 2 == 0 -> m / 2 * n
        else -> n / 2 * m + m / 2
        })
    }
