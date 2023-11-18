
package week32;

import static week32.Util.*;

public class Test {

    public static void main(String args[]) {

        Circle c1 = new Circle(6);
        print(c1.getRound());
        Circle c2 = new Circle();
        c2.setRad(8);
        print(c2.getArea());

    }
}
