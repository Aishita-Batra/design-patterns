public class SingletonDemo {
    public static void main(String[] args) {
        /*
         * the output "a new instance is created" will appear only once and
         * obj1,obj2,obj3 will store reference of the same object
         */
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj1 + " " + obj2 + " " + obj3);
    }
}
