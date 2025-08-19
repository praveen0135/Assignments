
import java.util.Scanner;

public class A4 {                // operator evaluation
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.println("enter two values/n");
       int x =scanner.nextInt();
       int y =scanner.nextInt();
        System.out.println("Addition:" +(x + y));
        System.out.println("subtraction:" +(x-y));
        System.out.println("Multiplication:" +(x*y));
        System.out.println("division:"+(x/y));
        System.out.println("module:" +(x%y));
        System.out.println("and:" +(x&y));
        scanner.close();

        
    }
}
