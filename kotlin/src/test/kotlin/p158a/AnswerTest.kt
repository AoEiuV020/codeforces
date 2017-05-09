package p158a;

import org.junit.Test
import kotlin.test.*
import base.BaseTest

/**
"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.
* Created by AoEiuV020 on 2017/05/09.
*/
class AnswerTest: BaseTest() {
    @Test
    fun t158a() {
        input("""
        8 5
        10 9 8 7 7 7 5 5
        """)
        main()
        assertEquals(6, output.toInt())
        input("""
        4 2
        0 0 0 0
        """)
        main()
        assertEquals(0, output.toInt())
        input("""
        17 14
        16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
        """)
        main()
        assertEquals(14, output.toInt())
    }
}
