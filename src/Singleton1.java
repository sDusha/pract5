public class Singleton1 {
    // чурез getInstance() Synchronized Accessor
    // потокобезопасно, низка производительность при потоках
    private static Singleton1 instance;
    private int number;

    public Singleton1(int n) {
        this.number = n;
    }

    public static synchronized Singleton1 getInstance(int n) {
        if(instance == null) {
            instance = new Singleton1(n);
        }
        return instance;
    }

    public int getNumber() {
        return number;
    }
}
