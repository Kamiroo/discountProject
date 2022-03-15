import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountFifteenTest {

    @Test
    public void processDiscount() {
        Discount discountZero = new Discount();

        assertEquals(15 , discountZero.computeDiscount(1975));

    }
}
