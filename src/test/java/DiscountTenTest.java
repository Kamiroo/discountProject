import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTenTest {

    @Test
    public void processDiscount() {
        Discount discountZero = new Discount();

        assertEquals(10 , discountZero.computeDiscount(1993));

    }
}
