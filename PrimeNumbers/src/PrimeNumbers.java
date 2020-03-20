import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
    	int n, p=0;
    	boolean r;
    	String prime="";
    	Scanner s = new Scanner (System.in);

	do{
		r = true;
		System.out.print("Input a prime number: ");
		n = s.nextInt();
		
		if (n <=1)
			r = false;
		for (int i = 2; i <= Math.sqrt (n) ; i++){
			if (n%i == 0)
				r=false;
		}
	if (r == true)
		prime += n + " ";
	} while (r);
	System.out.println("Here are the prime numbers that you entered: "+prime);




    }
    
}