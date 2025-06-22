public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Keerthana");
        Observer webUser = new WebApp("Raj");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice(1025.50);
        stockMarket.setStockPrice(1040.75);

        stockMarket.removeObserver(webUser);
        stockMarket.setStockPrice(1010.00);
    }
}
