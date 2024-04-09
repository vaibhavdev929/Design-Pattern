package creational.singalton;

/**
 *  Bill Pugh Singleton (Initialization-on-demand holder idiom): -->

 *  This is a thread-safe way to implement Singleton using a static inner helper class.
 */
public class BillPughSingleton {
    private BillPughSingleton() {
        // private constructor
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}