

import java.util.Scanner;

public class largenoofarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Element");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+ " element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int big = arr[0];
		int small = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > big) {
				big = arr[i];
			} else if(arr[i] < small){
				small = arr[i];
			}
		}
		System.out.println("Largest = "+big);
        sc.close();
	}

}
