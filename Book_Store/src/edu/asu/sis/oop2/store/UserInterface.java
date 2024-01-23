
package edu.asu.sis.oop2.store;
// Concrete Observer
 public class UserInterface implements InventoryObserver {
    @Override
    public void update(String message) {
        System.out.println("User Interface notified: " + message);
    }
}

