
package edu.asu.sis.oop2.store;


public class SingletonBook {
     private static SingletonBook instance;

    private SingletonBook() {
        System.out.println("new object has been created");
    }

    public static SingletonBook getInstance() {
        if (instance == null) {
            instance = new SingletonBook();
        }
        return instance;
    }
      public void File(){
        System.out.println("from singletonBook");
    }
}

