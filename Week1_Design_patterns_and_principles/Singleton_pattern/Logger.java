public class Logger {
    // Step 1: Create a private static instance of the same class
    private static Logger singleInstance;

    // Step 2: Make the constructor private so it can't be instantiated outside
    private Logger() {
        System.out.println("Logger initialized");
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger(); // Lazy initialization
        }
        return singleInstance;
    }

   // A method to simulate logging
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}