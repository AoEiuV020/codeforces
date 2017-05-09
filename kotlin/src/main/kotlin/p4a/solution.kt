package p4a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val scanner = Scanner(System.`in`)
    val w = scanner.nextInt()
    print(if (w != 2 && w and 1 == 0) "YES" else "NO")
}
