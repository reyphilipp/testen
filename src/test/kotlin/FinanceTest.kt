import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.hamcrest.CoreMatchers
import org.junit.Test

import org.junit.Assert.*

class FinanceTest {

    @Test
    fun betragCalc() {
        val mockCalc : ICalculator = mock()

        whenever(mockCalc.add(44.0,66.0)).thenReturn(8.0)

        val finance = Finance(mockCalc)

        finance.betragCalc()

        verify(mockCalc).add(44.0,66.0)
    }
}