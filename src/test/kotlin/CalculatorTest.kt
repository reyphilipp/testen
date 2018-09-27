import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.hamcrest.CoreMatchers
import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {

    @Test
    fun add() {
        //Triple T
        //Arrange
        val sut = Calculator()

        //Act
        val result = sut.add(5.0,1.0)

        //Assert
        assertThat(result, CoreMatchers.equalTo(6.0))
    }
    @Test
    fun addMock(){
        val mockCalc : ICalculator = mock()

        whenever(mockCalc.add(2.0,5.0)).thenReturn(8.0)

        val result = mockCalc.add(5.0, 1.0)

        assertThat(result,CoreMatchers.equalTo(8.0))
        /*
        val result = mockCalc.add(2.0,5.0)
        verify(mockCalc).add(2.0,5.0)*/

    }
}