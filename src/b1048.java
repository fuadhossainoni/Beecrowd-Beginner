import java.io.IOException;
import java.util.Scanner;
public class b1048 {
	public static void main(String[] args) throws IOException {
		 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
		Scanner sc = new Scanner(System.in);
		double CurrentSalary,NewSalary;
		int percentage=0;
		CurrentSalary = sc.nextDouble();
		if(CurrentSalary<=400) {
			percentage = 15;
		}
		else if(CurrentSalary<=800) {
			percentage = 12;
		}
		else if(CurrentSalary<=1200) {
			percentage = 10;
		}
		else if(CurrentSalary<=2000) {
			percentage = 7;
		}
		else {
			percentage = 4;
		}
		NewSalary = CurrentSalary+(CurrentSalary*percentage)/100;
		System.out.printf("Novo salario: "+"%.2f", NewSalary);
		System.out.println("");
		System.out.printf("Reajuste ganho: "+"%.2f",(NewSalary-CurrentSalary));
		System.out.println("");
		System.out.println("Em percentual: "+percentage+" %");
    }
}
