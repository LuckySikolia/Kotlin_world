import org.junit.jupiter.api.Test

class DuplicateTest {
    @Test
    fun testDuplicate() {
        val z = "Coffee is a laxative"
        assetEquals("Tell me one random fact you know: $z", z)
    }

    private fun assetEquals(s: String, z: String) {

    }
}