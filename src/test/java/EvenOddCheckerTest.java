import junit.framework.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {
    @Test
    public void checkEvenPositiveShouldReturnTrue()
    {
        Assert.assertEquals("This number is Even!", true, EvenOddChecker.check(4));
    }

    @Test
    public void checkEvenPositiveShouldReturnFalse()
    {
        Assert.assertEquals("This number is Odd!", false, EvenOddChecker.check(5));
    }

    @Test
    public void checkZeroShouldReturnTrue()
    {
        Assert.assertEquals("0 is Even!", true, EvenOddChecker.check(0));
    }

    @Test
    public void checkEvenNegativeShouldReturnTrue()
    {
        Assert.assertEquals("This number is Even!", true, EvenOddChecker.check(-4));
    }

    @Test
    public void checkEvenNegativeShouldReturnFalse()
    {
        Assert.assertEquals("This number is Odd!", false, EvenOddChecker.check(-5));
    }

}
