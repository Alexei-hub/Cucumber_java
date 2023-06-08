package patterns.behavioral.strategy;

public class DiscountPrice implements Strategy {
    @Override
    public double getFinalPrice(double startPrice) {
        return startPrice * 0.5;
    }
}
