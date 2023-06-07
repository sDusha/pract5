public class Singleton2 {
    // через Lazy Initialization
    // ленивая, не потокобезопасно
    private static Singleton2 INSTANCE;

    private int number;

    private Singleton2(int n) {this.number = n;}

    public static Singleton2 getInstance(int n) {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2(n);
        }
        return INSTANCE;
    }

    public int getNumber() {
        return number;
    }
}
