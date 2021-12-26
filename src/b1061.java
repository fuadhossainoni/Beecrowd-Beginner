import java.io.IOException;
import java.util.Scanner;
public class b1061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String StartDay = sc.nextLine();
		int sday = IntFinder(StartDay);
		String StartTimes = sc.nextLine();
		String [] StartTimesArray = StartTimes.split(" : ");
		int shour = Integer.parseInt(StartTimesArray[0]);
		int smin = Integer.parseInt(StartTimesArray[1]);
		int ssec = Integer.parseInt(StartTimesArray[2]);
		
		String EndDay = sc.nextLine();
		int eday = IntFinder(EndDay);
		String EndTimes = sc.nextLine();
		String [] EndTimesArray = EndTimes.split(" : ");
		int ehour = Integer.parseInt(EndTimesArray[0]);
		int emin = Integer.parseInt(EndTimesArray[1]);
		int esec = Integer.parseInt(EndTimesArray[2]);
		
		int days,hours,minutes,seconds;
		
		if(ssec>esec) {
			seconds = esec + 60 - ssec;
			emin--;
		}
		else {
			seconds = esec - ssec;
		}
//		System.out.println("esec: "+esec);
//		System.out.println("ssec: "+ssec);
//		System.out.println("seconds: "+seconds);
		if(smin>emin) {
			minutes = emin + 60 - smin;
			ehour--;
		}
		else {
			minutes = emin - smin;
		}
//		System.out.println("emin: "+emin);
//		System.out.println("smin: "+smin);
//		System.out.println("minutes: "+minutes);
		if(shour>ehour) {
			hours = ehour + 24 - shour;
			eday--;
		}
		else {
			hours = ehour - shour;
		}
		days = eday - sday;
		System.out.println(days+" dia(s)");
		System.out.println(hours+" hora(s)");
		System.out.println(minutes+" minuto(s)");
		System.out.println(seconds+" segundo(s)");
	}
	//Finds integer from a string
	public static int IntFinder(String sample) {
		char[] chars = sample.toCharArray();
	    StringBuilder sb = new StringBuilder();
	    for(char c : chars){
	       if(Character.isDigit(c)){
	          sb.append(c);
	       }
	    }
	    String s = sb.toString();	    
	    int number = Integer.parseInt(s);
	    return number;
	}
//	public static String[] IntSplitter(String s) {
//		String[] values = s.split(" : ");
//		return values;
//	}
}
