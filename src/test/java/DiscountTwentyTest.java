import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTwentyTest {

    @Test
    public void processDiscount() {
        Discount discountZero = new Discount();

        assertEquals(20 , discountZero.computeDiscount(1930));

    }
}
