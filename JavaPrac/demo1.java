//import java.util.*;
class demo1{
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // //\u0000 System.out.println("demo1232323");
        // System.out.println("ho print sta sta");
        // sc.close();
        int a[][]={{5,6,7},{8,9,10}};
        int b[][]={{3,4,5},{11,12,13}};
        int c[][]=new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}