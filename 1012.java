import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Main {
	
	static final double pi = 3.14159;
	
	public static double areaTriangulo(double a, double b){
		double area = ((a*b)/2);
		return area;
	} 
	
	public static double areaCirculo(double c){
		double area = (pi * (c * c));
		return area;
	}
	
	public static double areaTrapezio(double a, double b, double c){
		double area = (((a + b) * c)/2);
		return area;
	}
	
	public static double areaQuadrado(double b){
		double area = b * b;
		return area;
	}
	
	public static double areaRetangulo(double a, double b){
		double area = (a * b);
		return area;
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		DecimalFormat d = new DecimalFormat("#,###0.000");
		double triangulo = areaTriangulo(A, C);
		double circulo = areaCirculo(C);
		double trapezio = areaTrapezio(A, B, C);
		double quadrado = areaQuadrado(B);
		double retangulo = areaRetangulo(A, B);
		System.out.println("TRIANGULO: " + d.format(triangulo));
		System.out.println("CIRCULO: " + d.format(circulo));
		System.out.println("TRAPEZIO: " + d.format(trapezio));
		System.out.println("QUADRADO: " + d.format(quadrado));
		System.out.println("RETANGULO: " + d.format(retangulo));
	}
}
