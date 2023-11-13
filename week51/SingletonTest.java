
package Oop2.week51;

public class SingletonTest {
    private static SingletonTest instance;

    private SingletonTest() {}

    public static SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest ();
        }
        return instance;
    }
    public void hello(){
        System.out.println("hello from singletonTest");
    }
}
