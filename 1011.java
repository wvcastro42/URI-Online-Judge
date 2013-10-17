import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Locale;

public class Main{
	final static double pi = 3.14159;
	
	static double calcVolume(int raio){
		double vol = ((4.0/3.0) * pi * (Math.pow(raio, 3)));
		return vol;
	}
	
	public static void main(String []args){
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int R = s.nextInt();
		double volume = calcVolume(R);
		DecimalFormat d = new DecimalFormat("0.000");
		System.out.println("VOLUME = "+(d.format(volume)));
	}
}
