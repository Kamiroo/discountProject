import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountOverLimitTest {

    @Test
    public void processDiscount() {
        Discount discountZero = new Discount();

        assertEquals(-1 , discountZero.computeDiscount(2023));

    }
}
