import java.io.IOException;
import java.util.Scanner;
public class b2896 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int cases = sc.nextInt();
			for(int i=0;i<cases;i++) {
				int bought = sc.nextInt();
				int exchange = sc.nextInt();
				if (exchange>bought) {
					System.out.println(bought);
				}
				else {
					System.out.println((bought/exchange)+(bought%exchange));
				}
			}
		}
	}