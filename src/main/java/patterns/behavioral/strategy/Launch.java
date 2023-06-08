package patterns.behavioral.strategy;


//позволяет задать нужную стратегию в зависимости и изменять её во время выполнения программы
public class Launch {
    public static void main(String[] args) {
        int startPrice = 100;
        PriceStrategy priceStrategy = new PriceStrategy(new NormalPrice());
        double finalPrice = priceStrategy.getFinalPrice(startPrice);
        System.out.println(finalPrice);
        priceStrategy = new PriceStrategy(new DiscountPrice());
        double finalPriceWithDiscount = priceStrategy.getFinalPrice(startPrice);
        System.out.println(finalPriceWithDiscount);

    }
}
