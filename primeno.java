import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		boolean flag=false;
		if(a==0 || a==1) {
			System.out.println(a+" "+"Not a Prime no");
		}else {
			for(int i=2;i<=a/2;i++) {
				if(a%i == 0) {
					System.out.println(a+" "+"Not a Prime Number");
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.println(a+" "+" is Prime Number");
			}
		}
		
        sc.close();
	}
  
}
