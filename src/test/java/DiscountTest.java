import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTest {

    Discount discount = new Discount();

    @Test
    public void shouldReturnZeroWhenYearOfBirthIsBetween2007And2021() {
        assertEquals(0 , discount.computeDiscount(2007));
        assertEquals(0, discount.computeDiscount(2021));
    }
    @Test
    public void shouldReturnFiveWhenYearOfBirthIsBetween1997And2006() {
        assertEquals(5, discount.computeDiscount(1997));
        assertEquals(5, discount.computeDiscount(2006));
    }
    @Test
    public void shouldReturnTenWhenYearOfBirthIsBetween1977and1996() {
        assertEquals(10, discount.computeDiscount(1977));
        assertEquals(10, discount.computeDiscount(1996));
    }
    @Test
    public void shouldReturnFiveWhenYearOfBirthIsBetween1957And1976() {
        assertEquals(15, discount.computeDiscount(1957));
        assertEquals(15, discount.computeDiscount(1976));
    }
    @Test
    public void shouldReturnFiveWhenYearOfBirthIsBetween1872And1956() {
        assertEquals(20, discount.computeDiscount(1872));
        assertEquals(20, discount.computeDiscount(1955));
    }
    @Test
    public void shouldReturnMinusOneWhenYearOfBirthIsLessThan1872() {
        assertEquals(-1, discount.computeDiscount(1871));
    }
    @Test
    public void shouldReturnMinusOneWhenYearOfBirthIsHigherThan2021() {
        assertEquals(-1, discount.computeDiscount(2022));
    }
}
