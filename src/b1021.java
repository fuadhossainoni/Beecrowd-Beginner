import java.io.IOException;
import java.util.Scanner;
public class b1021 {
		 
	   public static void main(String[] args) throws IOException {
	 
	        /**
	         * Escreva a sua solução aqui
	         * Code your solution here
	         * Escriba su solución aquí
	         */
	         Scanner sc = new Scanner(System.in);
	         double N;
	         int n100,n50,n20,n10,n5,n2,c1,cdot5,cdot25,cdot1,cdot05,cdot01;
	         N = sc.nextDouble();
	         n100 = (int) N/100;
	         N = N%100;
	         n50 = (int) N/50;
	         N = N%50;
	         n20 = (int) N/20;
	         N = N%20;
	         n10 = (int) N/10;
	         N = N%10;
	         n5 = (int) N/5;
	         N = N%5;
	         n2 = (int) N/2;
	         N = N%2;
	         c1 = (int) N/1;
	         N = N%1;
	         N = Math.round(N*100);
	         System.out.println(N);
	         cdot5 = (int) (N/50);
	         N = N%50;
	         cdot25 = (int) (N/25);
	         N = N%25;
	         cdot1 = (int) (N/10);
	         N = N%10;
	         cdot05 = (int) (N/5);
	         cdot01 = (int) (N%5);
	         System.out.println("NOTAS:");
	         System.out.println(n100+" nota(s) de R$ 100.00");
	         System.out.println(n50+" nota(s) de R$ 50.00");
	         System.out.println(n20+" nota(s) de R$ 20.00");
	         System.out.println(n10+" nota(s) de R$ 10.00");
	         System.out.println(n5+" nota(s) de R$ 5.00");
	         System.out.println(n2+" nota(s) de R$ 2.00");
	         System.out.println("MOEDAS:");
	         System.out.println(c1+" moeda(s) de R$ 1.00");
	         System.out.println(cdot5+" moeda(s) de R$ 0.50");
	         System.out.println(cdot25+" moeda(s) de R$ 0.25");
	         System.out.println(cdot1+" moeda(s) de R$ 0.10");
	         System.out.println(cdot05+" moeda(s) de R$ 0.05");
	         System.out.println(cdot01+" moeda(s) de R$ 0.01");
	         sc.close();
	    }
}
