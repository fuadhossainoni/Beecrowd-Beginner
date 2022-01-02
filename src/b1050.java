import java.io.IOException;
import java.util.Scanner;
public class b1050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Map<String, String> dictionary = new HashMap<String, String>();
//		dictionary.put("61", "Brasilia");
//		dictionary.put("71", "Salvador");
//		dictionary.put("11", "Sao Paulo");
//		dictionary.put("21", "Rio de Janeiro");
//		dictionary.put("32", "Juiz de Fora");
//		dictionary.put("19", "Campinas");
//		dictionary.put("27", "Vitoria");
//		dictionary.put("31", "Belo Horizonte");
//		String k = sc.nextLine();
//		
//		if(dictionary.get(k)!=null) {
//			System.out.println(dictionary.get(k));
//			System.out.println("");
//		}
//		else {
//			System.out.println("DDD nao cadastrado");
//			System.out.println("");
//		}
		int k = sc.nextInt();
		if(k==61){
			System.out.println("Brasilia");
		}
		else if(k==71){
			System.out.println("Salvador");
		}
		else if(k==11){
			System.out.println("Sao Paulo");
		}
		else if(k==21){
			System.out.println("Rio de Janeiro");
		}
		else if(k==32){
			System.out.println("Juiz de Fora");
		}
		else if(k==19){
			System.out.println("Campinas");
		}
		else if(k==27){
			System.out.println("Vitoria");
		}
		else if(k==31){
			System.out.println("Belo Horizonte");
		}
		else {
			System.out.println("DDD nao cadastrado");
		}
	}

}
