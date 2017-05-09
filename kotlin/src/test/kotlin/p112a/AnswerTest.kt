package p112a;

import org.junit.Test
import kotlin.test.*
import base.BaseTest

/**
 * Created by AoEiuV020 on 2017/05/09.
 */
class AnswerTest: BaseTest() {
    @Test
    fun t112a() {
        input("""
        aaaa
        aaaA
        """)
        main()
        assertEquals(0, output.toInt())
        input("""
        abs
        Abz
        """)
        main()
        assertEquals(-1, output.toInt())
        input("""
        abcdefg
        AbCdEfF
        """)
        main()
        assertEquals(1, output.toInt())
    }
}
