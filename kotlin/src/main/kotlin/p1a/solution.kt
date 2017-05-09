package p1a;

import java.util.Scanner
/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val m = scanner.nextLong()
    val a = scanner.nextLong()
    val x = n / a + if (n % a == 0L) 0L else 1L
    val y = m / a + if (m % a == 0L) 0L else 1L
    print(x * y)
}
