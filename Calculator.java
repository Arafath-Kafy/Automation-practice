import org.testng.annotations.Test;
import org.testng.Assert;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(2, 3), 5);
        Assert.assertEquals(calc.add(0, 0), 0);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.subtract(3, 2), 1);
        Assert.assertEquals(calc.subtract(0, 1), -1);
    }
}
