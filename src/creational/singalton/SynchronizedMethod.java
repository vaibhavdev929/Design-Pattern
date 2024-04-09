package creational.singalton;


/**
 *     SynchronizedMethod :--->

 *     Using the synchronised method we can  create the singleton class ,
 *     but the problem is every Time when any thread is call it will lock and check
 *     is it free or not and locking is very expensive
 */
public class SynchronizedMethod {
    private static SynchronizedMethod instance;

    private SynchronizedMethod() {
        // Private constructor
    }

    synchronized public static SynchronizedMethod getInstance() {

        if (instance == null) {
            instance = new SynchronizedMethod();
        }
        return instance;
    }
}
