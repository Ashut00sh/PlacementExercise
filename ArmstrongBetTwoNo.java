import java.util.*;
public class ArmstrongBetTwoNo {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a low limit");
		int low = sc.nextInt();
		System.out.println("Enter a high limit");
		int high = sc.nextInt();
		
		for(int i = low;i<high;i++) {
			int temp,rem,c= 0;
			temp = i;
			while(temp != 0) {
				rem = temp%10;
				temp = temp/10;
				c = c+(rem*rem*rem);
			}
			if(c == i) {
				System.out.println(i+" ");
			}
		}
        sc.close();
	}

}
