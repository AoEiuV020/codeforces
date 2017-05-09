package p118a;

import java.util.*

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
fun main(vararg args: String) {
    val str = readLine()!!
    str.map {
        it.toLowerCase()
    }.filterNot {
        it in "aoyeui"
    }.forEach {
        print(".$it")
    }
}
