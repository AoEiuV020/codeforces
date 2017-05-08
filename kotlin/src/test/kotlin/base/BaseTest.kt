package base

import java.io.*

/**
 * Created by AoEiuV020 on 2017/05/08.
 */
open class BaseTest {
    private val buffer = ByteArrayOutputStream()
    val output by lazy { buffer.toByteArray().inputStream().reader().readText() }
    init {
        System.setOut(PrintStream(buffer))
    }
    fun input(str: String) {
        System.setIn(str.trimIndent().byteInputStream())
    }
}

