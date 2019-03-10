package assignmentTDD;
import java.util.Scanner;

public class Junit {
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = num.nextInt();
        Junit unit = new Junit();
        unit.divisible(num1);   
    }   
    public boolean divisible(int num) {
    	if(num%2==0 && num % 3 ==0) {
    		System.out.println(num +" is divisible by 2 and 3");
    		return true;
    	}
    	else {
    		System.out.println(num + " isnot divisible by 2 and 3");
    		return false;
    	}
    }

	
}

	


