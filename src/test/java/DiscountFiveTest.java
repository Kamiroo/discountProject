import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountFiveTest {

    @Test
    public void processDiscount() {
        Discount discountZero = new Discount();

        assertEquals(5 , discountZero.computeDiscount(1999));

    }
}
