import org.junit.jupiter.api.Test

class FunctionsTest {
    @Test
    private fun testSumDoubles() {
        val a = 1.1
        val b = 2.1
        val c = 6.9
        val sum: Double = a + b + c
        //check if function(sumDoubles) is working as expected
        //the 0.00001 is the tolerance level
        assertEquals("sumDoubles($a, $b, $c) should return $sum", sum, sumDoubles(a, b, c), 0.000001)
    }

    private fun assertEquals(s: String, sum: Double, sumDoubles: Double, d: Double) {

    }

    @Test
    fun test1() = testSumDoubles()

    @Test
    fun test2() {
        val a = 0.0
        val b = 42.0
        val c = -42.0
        val sum: Double = a + b + c
        assertEquals("sumDoubles($a, $b, $c) should return $sum", sum, sumDoubles(a, b, c), 0.000001)
    }
}