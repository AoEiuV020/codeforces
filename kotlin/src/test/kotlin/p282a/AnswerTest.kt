package p282a

import org.junit.Test
import kotlin.test.*
import base.BaseTest

/**
 * Created by AoEiuV020 on 2017/05/08.
 */
class AnswerTest: BaseTest() {
    @Test
    fun t282a() {
        input("""
        2
        ++x
        x++
        """)
        main()
        assertEquals("2", output)
    }
}

