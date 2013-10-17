import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Main{
	public static void main(String []args){
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		double salary = s.nextDouble();
		double sales = s.nextDouble();
		DecimalFormat d = new DecimalFormat("#,###0.00");
		System.out.println("TOTAL = R$ "+(d.format(((sales*15)/100)+salary)));
	}
}
