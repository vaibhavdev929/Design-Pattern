package creational.singalton;

/**
 *   Eager Initialization Singleton: -->

 *   This approach initializes the instance when the class is loaded.
 *   It ensures thread-safety because class loading is inherently thread-safe.
 */
public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {
        // private constructor
    }

    public static EagerInitialization getInstance() {
        return instance;
    }
}