import java.io.IOException;
import java.util.Scanner;
public class b1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C=0,R=0,S=0;
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			int number = sc.nextInt();
			String type = sc.next();
			if(type.equals("C")) {
				C=C+number;
			}
			else if(type.equals("R")) {
				R=R+number;
			}
			else if(type.equals("S")) {
				S=S+number;
			}
		}
		int total = C+R+S;
		System.out.println("Total: "+total+" cobaias");
		System.out.println("Total de coelhos: "+C);
		System.out.println("Total de ratos: "+R);
		System.out.println("Total de sapos: "+S);
		double Cpercent = (double)(C*100)/total;
		System.out.printf("Percentual de coelhos: "+"%.2f", Cpercent);
		System.out.println(" %");
		double Rpercent = (double)(R*100)/total;
		System.out.printf("Percentual de ratos: "+"%.2f", Rpercent);
		System.out.println(" %");
		double Spercent = (double)(S*100)/total;
		System.out.printf("Percentual de sapos: "+"%.2f", Spercent);
		System.out.println(" %");
	}

}
