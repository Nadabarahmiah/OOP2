package week32;

public final class Circle {

    public static final double PI = 3.14;
    private int rad;

    public Circle(int rad) {
        setRad(rad);
    }

    public Circle() {

    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        if (rad >= 0) {
            this.rad = rad;
        }
    }

    public double getRound() {
        double round = 2 * PI * rad;
        return round;
    }

    public double getArea() {
        double area = PI * rad * rad;
        return area;
    }

}
