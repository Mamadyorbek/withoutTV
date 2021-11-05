package withouttv;
import java.util.Scanner;
public class WithoutTV {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1st value?");
        int a = inp.nextInt();
        System.out.println("2st value?");
        int b = inp.nextInt();        
        System.out.println("Bf Sw: a = " + a + "; b = " + b);
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("Af Sw: a = " + a + "; b = " + b);
    }
    
}
