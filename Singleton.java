/* It is a creation pattern
Singleton class will have only one instance and provides global point of access to it */
public class Singleton {
    /*
     * instance is private to restrict direct access, and static as it belongs to
     * class rather than any object
     */
    private static Singleton instance = null;

    /* private constructor to restrict instantiation of the class */
    private Singleton() {
        System.out.println("a new instance is created");
    }

    /*
     * a public method that returns the only object, being a static method it can be
     * invoked without an object
     */
    public static Singleton getInstance() {
        if (instance == null) {
            /* thread safe */
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
