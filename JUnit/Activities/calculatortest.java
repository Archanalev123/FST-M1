import org.junit.jupiter.api.BeforeEach;

public class calculatortest {

	private Calculator calculator;
	 
    @BeforeEach
    public void setUp() throws Exception {
        calculatortest = new Calculator();
    }
 
    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }
}
