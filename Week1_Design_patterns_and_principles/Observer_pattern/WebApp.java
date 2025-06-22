public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(double price) {
        System.out.println("Web App - " + user + ": Stock price is now ₹" + price);
    }
}
