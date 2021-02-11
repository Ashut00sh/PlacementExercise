public class pq10 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            int num=45/3;
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("cought exp");
        }
        finally{
            System.out.println("fianly block");
        }
        System.out.println("Main Method");
    }
}
