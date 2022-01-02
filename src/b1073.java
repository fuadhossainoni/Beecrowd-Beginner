import java.io.IOException;
import java.util.Scanner;

public class b1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>5&&N<2000) {
			for(int i=2;i<=N;i=i+2) {
				System.out.println(i+"^2 = "+i*i);
			}
		}
	}

}
