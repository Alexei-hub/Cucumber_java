package patterns.behavioral.strategy;

public class PriceStrategy implements Strategy {
    Strategy strategy;

    public PriceStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public double getFinalPrice(double startPrice) {
        return strategy.getFinalPrice(startPrice);
    }
}
