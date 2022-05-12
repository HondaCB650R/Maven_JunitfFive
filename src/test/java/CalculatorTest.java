import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("2 + 1 = 3")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2,1),"2 + 1 should equal 3");

    }

    @Test
    @DisplayName("2 - 1 = 1")
    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(2, 1), "2 - 1 should equal 1");

    }

    @Test
    @DisplayName("5 * 5 = 25")
    void multiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.multiply(5,5),"5 * 5 should equal 25");
    }

    @Test
    @DisplayName("30 / 2 = 15")
    void divideTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.divide(30, 2), "30 / 2 should equal 15");

    }



}