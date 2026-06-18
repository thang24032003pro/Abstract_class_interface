package OmniCart;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private CheckoutService checkoutService;

    @BeforeEach
    void setUp() {
        checkoutService = new CheckoutService();
    }

    @Test
    @DisplayName("Testing empty cart total is zero")
    void testEmptyCartTotal() {
        double expected = 0.0;
        double result = checkoutService.calculateTotal();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtotal with multiple items")
    void testSubtotalWithItems() {
        checkoutService.addItem(10.0);
        checkoutService.addItem(20.0);
        double expected = 30.0;

        double result = checkoutService.calculateSubtotal();
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing total after applying discount")
    void testTotalWithDiscount() {
        checkoutService.addItem(100.0);
        checkoutService.applyDiscount(10.0);
        double expected = 90.0;

        double result = checkoutService.calculateTotal();
        assertEquals(expected, result, 0.001);
    }

    @Test
    @DisplayName("Testing item count")
    void testItemCount() {
        checkoutService.addItem(5.0);
        checkoutService.addItem(15.0);
        checkoutService.addItem(25.0);

        assertEquals(3, checkoutService.getItemCount());
    }

    @Test
    @DisplayName("Testing clear cart resets all values")
    void testClearCart() {
        checkoutService.addItem(50.0);
        checkoutService.clearCart();

        assertEquals(0, checkoutService.getItemCount());
        assertEquals(0.0, checkoutService.calculateTotal());
    }

    @Test
    @DisplayName("Testing negative price throws exception")
    void testNegativePriceThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> checkoutService.addItem(-5.0));
    }
}
