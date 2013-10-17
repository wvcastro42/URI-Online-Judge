import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Main{
	public static void main(String []args){
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int num;
		int hour;
		double price;
		num = s.nextInt();
		hour = s. nextInt();
		DecimalFormat d = new DecimalFormat("#,###0.00");
		price = s.nextDouble();
		System.out.println("NUMBER = "+num);
		System.out.println("SALARY = U$ "+d.format(price*hour));
	}
}
