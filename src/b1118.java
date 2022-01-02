import java.io.IOException;
import java.util.Scanner;
public class b1118 {

	public static void main(String[] args) {
		mymethod();
	}
	
	public static void choice() {
		System.out.println("novo calculo (1-sim 2-nao)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1) {
			mymethod();
		}
		else if(choice==2) {
			sc.close();
			System.exit(0);
		}
		else {
			choice();
		}
	}
	
	public static void mymethod() {
		Scanner sc = new Scanner(System.in);
		double score1,score2;
		while(true) {
			double temp = sc.nextDouble();
			if(temp>=0&&temp<=10) {
				score1 = temp;
				while(true) {
					temp = sc.nextDouble();
					if(temp>=0&&temp<=10) {
						score2 = temp;
						sc.close();
						System.out.println("media = "+(score1+score2)/2);
						choice();
					}
					else {
						System.out.println("nota invalida");
					}
				}
			}
			else {
				System.out.println("nota invalida");
			}
		}
	}
}
