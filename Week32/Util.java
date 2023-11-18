package week32;

import javax.swing.JOptionPane;

public class Util {

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void print(int msg) {
        System.out.println(msg);

    }
    public static void print(double msg) {
        System.out.println(msg);

    }

    public static int readNumber() {
        return readNumber("Please enter a number");

    }

    public static int readNumber(String msg) {
        String str = JOptionPane.showInputDialog(msg);
        int number = Integer.parseInt(str);
        return number;
    }
}