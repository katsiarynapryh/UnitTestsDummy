import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void calculatorCheckPlus()
    {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        if (result != 4) {
            Assert.fail();
        }
    }

    @Test
    public void calculatorCheckMinus()
    {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void calculatorCheckIncreease()
    {
        Calculator calculator = new Calculator();
        Assert.assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    public void calculatorCheckDivide()
    {
        Calculator calculator = new Calculator();
        Assert.assertEquals(4, calculator.divide(12, 3));
    }
}
