import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
  
public class Main{
     
    public static double peso(double A, double B, double C){
        double MEDIA = (((A * 2) + (B * 3) + (C * 5))/10);
        return MEDIA;
    }
     
    public static void main(String[] args) throws java.lang.Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double MEDIA = peso(A, B, C);
        DecimalFormat dec2 = new DecimalFormat("0.0"); 
        System.out.println("MEDIA = " + dec2.format(MEDIA));
    }
}
