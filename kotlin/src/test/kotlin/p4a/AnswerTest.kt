package p4a;

import org.junit.Test
import kotlin.test.*
import base.BaseTest

/**
* Created by AoEiuV020 on 2017/05/09.
*/
class AnswerTest: BaseTest() {
    @Test
    fun t4a() {
        input("""
        8
        """)
        main()
        assertEquals("YES", output)
        input("""
        2
        """)
        main()
        assertEquals("NO", output)
    }
}
