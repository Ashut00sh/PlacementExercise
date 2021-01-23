import java.util.*;
public class factorial {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		int fact = 1;
		if(a == 0) {
			System.out.println("Factorai of "+a+" "+"is 1");
		}else {
			for(int i=1;i<=a;i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of "+a+" "+"is"+" "+fact );
		}
        sc.close();
	}

}
