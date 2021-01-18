package p318a;

import org.junit.Test
import kotlin.test.*
import base.BaseTest

/**
Being a nonconformist, Volodya is displeased with the current state of things, particularly with the order of natural numbers (natural number is positive integer number). He is determined to rearrange them. But there are too many natural numbers, so Volodya decided to start with the first n. He writes down the following sequence of numbers: firstly all odd integers from 1 to n (in ascending order), then all even integers from 1 to n (also in ascending order). Help our hero to find out which number will stand at the position number k.

Input
The only line of input contains integers n and k (1 ≤ k ≤ n ≤ 1012).

Please, do not use the %lld specifier to read or write 64-bit integers in C++. It is preferred to use the cin, cout streams or the %I64d specifier.

Output
Print the number that will stand at the position number k after Volodya's manipulations.
 * Created by AoEiuV020 on 2017/06/09.
 */
class AnswerTest: BaseTest() {
    @Test
    fun t318a() {
        input("""
        10 3
        """)
        main()
        assertEquals(5, output.toInt())
        input("""
        7 7
        """)
        main()
        assertEquals(6, output.toInt())
        input("""
        8 5
        """)
        main()
        assertEquals(2, output.toInt())
        input("""
        1000000000000 500000000001
        """)
        main()
        assertEquals(2, output.toInt())
    }
}