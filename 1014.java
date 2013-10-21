import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		double Y = s.nextDouble();
		DecimalFormat d = new DecimalFormat("#,###0.000");
		System.out.println(d.format(X / Y)+" km/l");
	}
}
