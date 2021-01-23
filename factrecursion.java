import java.util.Scanner;
public class factrecursion {
    static int factorial(int n) {
		if(n == 0) {
		return 1;
		}
		else {
			return (n*factorial(n-1));
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		n = factorial(n);
        System.out.println(n);
        sc.close();
	}
}
