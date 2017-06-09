package p61a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/06/09-16:37:06.
 */
fun main(vararg args: String) {
    val a = readLine()!!.map { it == '1' }
    val b = readLine()!!.map { it == '1' }
    print(a.zip(b).map { if(it.first != it.second) 1 else 0 }.joinToString(""))
}
