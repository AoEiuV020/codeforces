package p71a;

import org.junit.Test
import kotlin.test.*
import base.BaseTest

/**
* Created by AoEiuV020 on 2017/05/09.
*/
class AnswerTest: BaseTest() {
    @Test
    fun t71a() {
        input("""
        4
        word
        localization
        internationalization
        pneumonoultramicroscopicsilicovolcanoconiosis
        """)
        main()
        assertEquals("""
        word
        l10n
        i18n
        p43s

        """.trimIndent(), output)
    }
}
