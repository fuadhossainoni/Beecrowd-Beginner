import java.io.IOException;
import java.util.Scanner;
public class b1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			if(M>0&&N>0) {
				int sum=0;
				if(N<M) {
					M=M+N;
					N=M-N;
					M=M-N;
//					System.out.println("M = "+M+" ,N = "+N);
				}
				for(int x=M;x<=N;x++) {
					sum+=x;
					System.out.printf(x+" ");
				}
				System.out.println("Sum="+sum);
			}
			else if(M<=0||N<=0) {
				break;
			}
		}
	}

}
