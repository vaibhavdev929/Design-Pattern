package creational.singalton;

/**
 *  Thread-Safe Singleton (Double-Checked Locking): -->

 *  To make the classic Singleton thread-safe,
 *  you can use double-checked locking to ensure that only one instance is created
 *  even in a multithreaded environment.
 */
public class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }

        }
        return instance;
    }
}
