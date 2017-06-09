package p3b;

import org.junit.Test
import kotlin.test.*
import base.BaseTest

/**
A group of tourists is going to kayak and catamaran tour. A rented lorry has arrived to the boat depot to take kayaks and catamarans to the point of departure. It's known that all kayaks are of the same size (and each of them occupies the space of 1 cubic metre), and all catamarans are of the same size, but two times bigger than kayaks (and occupy the space of 2 cubic metres).

Each waterborne vehicle has a particular carrying capacity, and it should be noted that waterborne vehicles that look the same can have different carrying capacities. Knowing the truck body volume and the list of waterborne vehicles in the boat depot (for each one its type and carrying capacity are known), find out such set of vehicles that can be taken in the lorry, and that has the maximum total carrying capacity. The truck body volume of the lorry can be used effectively, that is to say you can always put into the lorry a waterborne vehicle that occupies the space not exceeding the free space left in the truck body.

Input
The first line contains a pair of integer numbers n and v (1 ≤ n ≤ 105; 1 ≤ v ≤ 109), where n is the number of waterborne vehicles in the boat depot, and v is the truck body volume of the lorry in cubic metres. The following n lines contain the information about the waterborne vehicles, that is a pair of numbers ti, pi (1 ≤ ti ≤ 2; 1 ≤ pi ≤ 104), where ti is the vehicle type (1 – a kayak, 2 – a catamaran), and pi is its carrying capacity. The waterborne vehicles are enumerated in order of their appearance in the input file.

Output
In the first line print the maximum possible carrying capacity of the set. In the second line print a string consisting of the numbers of the vehicles that make the optimal set. If the answer is not unique, print any of them.
 * Created by AoEiuV020 on 2017/06/09-17:08:58.
 */
class AnswerTest: BaseTest() {
    @Test
    fun t3b() {
        input("""
        3 2
        1 2
        2 7
        1 3
        """)
        main()
        check("""
        7
        2
        """)
        input("""
        5 3
        1 9
        2 9
        1 9
        2 10
        1 6
        """)
        main()
        check("""
        24
        3 1 5
        """)
        input("""
        10 10
        1 14
        2 15
        2 11
        2 12
        2 9
        1 14
        2 15
        1 9
        2 11
        2 6
        """)
        main()
        check("""
        81
        6 1 7 2 4 3
        """)
        input("""
        6 1
        2 895
        2 447
        2 2
        2 74
        2 280
        2 689
        """)
        main()
        check("""
        0

        """)
    }

    fun check(answer: String) {
        val (v, n) = output.trimIndent().lines()
        val (av, an) = answer.trimIndent().lines()
        assertEquals(av, v)
        assertEquals(an.split(' ').sorted(), n.split(' ').sorted())
    }
}
