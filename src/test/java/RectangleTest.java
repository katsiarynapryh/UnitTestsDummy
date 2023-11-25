import junit.framework.Assert;
import org.junit.Test;

public class RectangleTest
{
    @Test
    public void checkLengthIsCorrect()
    {
        Rectangle rectangle = new Rectangle(4,2.1);
        Assert.assertEquals(4.0, rectangle.length);
    }

    @Test
    public void checkWidthIsCorrect()
    {
        Rectangle rectangle = new Rectangle(4,2.1);
        Assert.assertEquals(2.1, rectangle.width);
    }

    @Test
    public void checkAreaCalculation()
    {
        Rectangle rectangle = new Rectangle(4,2.1);
        Assert.assertEquals(8.4, rectangle.getArea());
    }
}
