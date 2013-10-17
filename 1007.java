import java.util.Scanner;
 
public class Main{
 
    public static int direfenca(int A, int B, int C, int D){
        int dif = (A * B - C * D);
        return dif;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
 
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        DIFERENCA = direfenca(A, B, C, D);
        System.out.println("DIFERENCA = "+DIFERENCA);
    }
}
