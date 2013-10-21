import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static double distancia(int x1, int y1, int x2, int y2){
		double dist = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
		return dist;
	}
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("#,###0.0000");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		System.out.println(d.format(distancia(x1, y1, x2, y2)));
		s.close();
	}
}
