import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BusinessLogicTest {

    @Test
    void testCalculateDiscount() {
        BusinessLogic logic = new BusinessLogic();
        assertEquals(20, logic.calculateDiscount(100, 20));
        assertEquals(0, logic.calculateDiscount(100, 0));
    }

    @Test
    void testIsValidUser() {
        BusinessLogic logic = new BusinessLogic();
        assertTrue(logic.isValidUser("validUser123"));
        assertFalse(logic.isValidUser("short"));
        assertFalse(logic.isValidUser(null));
    }

    @Test
    void testAddTwoNumbers() {
        BusinessLogic logic = new BusinessLogic();
        assertEquals(5, logic.addTwoNumbers(2, 3));
        assertEquals(0, logic.addTwoNumbers(0, 0));
        assertEquals(-1, logic.addTwoNumbers(1, -2));
    }

    @Test
    void testCalculateTax() {
        BusinessLogic logic = new BusinessLogic();
        assertEquals(2000, logic.calculateTax(10000));
        assertEquals(0, logic.calculateTax(0));
        assertEquals(500, logic.calculateTax(2500));
    }

    @Test
    void testIsPrime() {
        BusinessLogic logic = new BusinessLogic();
        assertTrue(logic.isPrime(5));
        assertFalse(logic.isPrime(4));
        assertFalse(logic.isPrime(-1));
    }
}
