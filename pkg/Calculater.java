
package pkg;
import java.util.Scanner;
public class Calculater {

    public static void main(String[] args) {
       Scanner t= new Scanner(System.in);
        System.out.println("Enter first num");
        int t1=t.nextInt();
        System.out.println("Enter second num");
        int t2=t.nextInt();
        System.out.println("Chose the opration: \n Enter 1 for + \n Enter 2 for - \n Enter 3 for / \n Enter 4 for * ");
        int t3=t.nextInt();
        if (t3==1){
            System.out.println(t1+t2);
    
        }else if(t3==2){
            System.out.println(t1-t2);
        }else if(t3==3){
            System.out.println(t1/t2);
        }else if(t3==4){
            System.out.println(t1*t2);
        }
    }
    
}
