package p158b;

import org.junit.Test
import kotlin.test.*
import base.BaseTest

/**
After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus together. They decided to get there by taxi. Each car can carry at most four passengers. What minimum number of cars will the children need if all members of each group should ride in the same taxi (but one taxi can take more than one group)?

Input
The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren. The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by a space, si is the number of children in the i-th group.

Output
Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.

 * Created by AoEiuV020 on 2017/05/09.
 */
class AnswerTest: BaseTest() {
    @Test
    fun t158b() {
        input("""
        5
        1 2 4 3 3
        """)
        main()
        assertEquals(4, output.toInt())
        input("""
        8
        2 3 4 4 2 1 3 1
        """)
        main()
        assertEquals(5, output.toInt())
        input("""
        12
        1 1 1 1 1 1 1 1 1 1 1 1
        """)
        main()
        assertEquals(3, output.toInt())
    }
}
