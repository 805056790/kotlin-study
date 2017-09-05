package kt.study.kt01.test

import org.junit.Test

/**
 * @author  : panxin
 */
class KotlinTests {

    @Test fun test_01() {
        println("this is kt test.")
    }

    @Test fun testForEach() {
        println("闭区间")
        for (age in 1..5) {
            print(age.toString() + ", ")
        }
        println()

        println("半开区间")
        for (age in 1 until 5) {
            print(age.toString() + ", ")
        }
        println()

        println("先试试")
        for (age in 5 downTo 1) {
            print(age.toString() + ", ")
        }
        println()

        println("再试试")
        for (age in 2..10 step 2) {
            print(age.toString() + ", ")
        }
        println()
    }

    @Test fun testIfNull () {
        val data1 = createData(1)
        assert(!data1.isNullOrEmpty())
        data1?.let { println("data1 is : " + data1) } ?: println("data1 is null")

        val data2 = createData(3)
        assert(data2.isNullOrEmpty())
        data2?.let { println("data 2 is: " + data2) } ?: println("data2 is null")
    }

    private fun createData(data: Int) :String?{
        return when(data) {
            1 -> "hello"
            2 -> "apple"
            3 -> ""
            else -> null
        }
    }

}