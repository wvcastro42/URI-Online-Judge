import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) throws java.lang.Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double R, A;
        R = scan.nextDouble();
        double PI = 3.14159;
        A = ((R * R) * PI);
        DecimalFormat dec = new DecimalFormat("#,###0.0000");
        System.out.println("A=" + dec.format(A));
    }
}
