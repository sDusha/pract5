public class Singleton3 {
    // 3 способ? Simple Solution
    // не ленивая инициализация
    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}
