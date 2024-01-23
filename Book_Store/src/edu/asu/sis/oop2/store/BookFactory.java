
package edu.asu.sis.oop2.store;

public class BookFactory {

    public Book cr(int type) {
        if (type==1) {
            return new FictionBook();
        } else if (type==2) {
            return new NonFictionBook();
        }
        return null;
    }
}
