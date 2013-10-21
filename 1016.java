import java.util.Scanner;
import java.util.Locale;
public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int X = 60;
		int d = s.nextInt();
		int temp = ((X * d)/30);
		System.out.println(temp + " minutos");
		s.close();
	}
}
