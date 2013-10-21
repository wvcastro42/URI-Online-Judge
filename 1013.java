import java.util.Scanner;

public class Main {
	
	public static int maiorAB(int a, int b){
		int maior = ((a + b + Math.abs(a-b))/2);
		return maior;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(maiorAB(a, b) > c){
			System.out.println(maiorAB(a,b) +" eh o maior");
		} else{
			System.out.println(c +" eh o maior");
		}
		s.close();
	}
}
