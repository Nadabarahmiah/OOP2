
package Oop2.week52;


public class FactoryTest {
        public A createImp (int type) {
        if (type==1) {
            return new B();
        } else if (type==2) {
            return new C();
        }
       return null;
    }

}
