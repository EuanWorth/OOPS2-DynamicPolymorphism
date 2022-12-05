public class Main {
    public static void main(String[] args) {
        Superclass mySuperclass = new Superclass();
        Superclass mySubClass = new SubClass();
        mySuperclass.method();
        mySubClass.method();
    }
}