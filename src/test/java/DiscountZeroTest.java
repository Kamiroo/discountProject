import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountZeroTest {

    @Test
    public void processDiscount() {
        Discount discountZero = new Discount();

        assertEquals(0 , discountZero.computeDiscount(2007));

    }
}
