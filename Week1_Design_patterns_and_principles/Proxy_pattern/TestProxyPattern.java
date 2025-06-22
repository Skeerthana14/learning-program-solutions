public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // First time loading
        System.out.println("\nFirst call to display photo1:");
        image1.display();

        System.out.println("\nFirst call to display photo2:");
        image2.display();

        // Cached display
        System.out.println("\nSecond call to display photo1 (should be cached):");
        image1.display();
    }
}
