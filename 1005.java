import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
  
public class Main{
     
    public static double peso(double A, double B){
        double MEDIA = (((A * 3.5) + (B * 7.5))/11);
        return MEDIA;
    }
     
    public static void main(String[] args) throws java.lang.Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double MEDIA = peso(A, B);
        DecimalFormat dec2 = new DecimalFormat("0.00000"); 
        System.out.println("MEDIA = " + dec2.format(MEDIA));
    }
}
