package OmniCart;

import java.util.ArrayList;
import java.util.List;

public class CheckoutService {

    private List<Double> itemPrices;
    private double discountPercent;

    public CheckoutService() {
        this.itemPrices = new ArrayList<>();
        this.discountPercent = 0;
    }

    public void addItem(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        itemPrices.add(price);
    }

    public void applyDiscount(double percent) {
        if (percent < 0 || percent > 100)
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        this.discountPercent = percent;
    }

    public double calculateSubtotal() {
        return itemPrices.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double calculateDiscount() {
        return calculateSubtotal() * (discountPercent / 100);
    }

    public double calculateTotal() {
        return calculateSubtotal() - calculateDiscount();
    }

    public int getItemCount() {
        return itemPrices.size();
    }

    public void clearCart() {
        itemPrices.clear();
        discountPercent = 0;
    }
}
