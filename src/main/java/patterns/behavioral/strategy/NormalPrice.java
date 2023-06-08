package patterns.behavioral.strategy;

public class NormalPrice implements Strategy {
    @Override
    public double getFinalPrice(double startPrice) {
        return startPrice;
    }
}
