package src.Entities.Discounts;

import src.Entities.Order.Order;

import java.math.BigDecimal;

public class DiscountForMoreThan10Items extends Discount  {

    public DiscountForMoreThan10Items(Discount next) {
        super(next);
    }
    public BigDecimal calculate(Order order) {
        if (order.items > 10) {
            return order.total.multiply(BigDecimal.valueOf(0.05));
        }
        return next.calculate(order);
    }
}
