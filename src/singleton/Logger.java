package singleton;

public class Logger {
    private static Logger instance;
    private Logger() {}
    public static Logger getLogger() {
        instance = new Logger();
        return instance;
    }
    public void logMessage(String message) {
        System.out.println(message);
    }
}
