package library;

public class User {
    private static int idCounter = 0;
    private final String userId;
    private String name;
    private String contactInfo;

    public static void setIdCounter(int idCounter) {
        User.idCounter = idCounter;
    }
}
