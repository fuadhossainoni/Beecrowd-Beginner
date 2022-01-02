import java.util.Scanner;

public class reverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(reverse(number));
	}
	    public static int reverse(int x) {
	        boolean isneg=false;
	        if(x<0){
	            isneg = true;
	            x=x*(-1);
	        }
	        int y=0;
	        while(true){
	            if(x/10>0){
	               y=y*10+(x%10);
	                x=x/10;
	            }
	            else{
	                y=y*10+x;
	                break;
	            }
	        }
	        if(isneg==true){
	            y=y*(-1);
	        }
	            return y;
	}
}
