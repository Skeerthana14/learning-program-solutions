public class TestLogger {
    public static void main(String[] args) {
        // Get first instance
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get second instance
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Check if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. Singleton confirmed.");
        } else {
            System.out.println("Different instances. Singleton failed.");
        }
    }
}
