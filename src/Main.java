public class Main {
    public static void main(String[] args) {
        Singleton1 singleton11 = Singleton1.getInstance(1);
        Singleton1 singleton12 = Singleton1.getInstance(2);

        Singleton2 singleton21 = Singleton2.getInstance(1);
        Singleton2 singleton22 = Singleton2.getInstance(2);

        Singleton3 singleton31 = Singleton3.getInstance();
        Singleton3 singleton32 = Singleton3.getInstance();

        System.out.println(singleton11.getNumber());
        System.out.println(singleton12.getNumber());

        System.out.println(singleton21.getNumber());
        System.out.println(singleton22.getNumber());

        System.out.println(singleton31.hashCode());
        System.out.println(singleton32.hashCode());
    }
}