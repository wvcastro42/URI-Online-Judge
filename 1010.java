import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Main{

	public static double calcPrice(int qtde1, double price1, int qtde2, double price2){
		double price = ((qtde1*price1)+(qtde2*price2));
		return price;
	}

	public static void main(String []args){
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int code1 = s.nextInt();
		int qtde1 = s.nextInt();
		String sPrice1 = s.nextLine();
		int code2 = s.nextInt();
		int qtde2 = s.nextInt();
		String sPrice2 = s.nextLine();
		double price1 = Double.parseDouble(sPrice1);
		double price2 = Double.parseDouble(sPrice2);
		double price = calcPrice(qtde1, price1, qtde2, price2);
		DecimalFormat d = new DecimalFormat("#,###0.00");
		System.out.println("VALOR A PAGAR: R$ "+ d.format(price));
	}
}
