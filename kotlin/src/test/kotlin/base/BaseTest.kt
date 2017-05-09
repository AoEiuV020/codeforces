package base

import java.io.*

/**
 * Created by AoEiuV020 on 2017/05/08.
 */
open class BaseTest {
    private lateinit var buffer: ByteArrayOutputStream
    val output 
        get() = buffer.toByteArray().inputStream().reader().readText()
    fun input(str: String) {
        System.setIn(str.trimIndent().byteInputStream())
        buffer = ByteArrayOutputStream()
        System.setOut(PrintStream(buffer))
    }
}

