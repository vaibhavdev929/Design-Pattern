package creational.singalton;

/**
 * Classic Singleton (Lazy Initialization): -->

 * This is the basic and most common way to implement Singleton.
 * It initializes the instance lazily (when first requested).
 */
public class ClassicSingleton {
    private static ClassicSingleton instance;

    private ClassicSingleton() {
        // Private constructor
    }

    public ClassicSingleton getInstance() {
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
