
public class demo4 {
    public static void main(String[] args) {
        int ret= new demo4().testmethod();
        System.out.println("return alue"+ret);
    }
    public int testmethod(){
        int i=0;
        try {
            i=100/0;
            return 1;
        } catch (Exception e) {
            i=200/0;
            return 1;
        }finally{
            i=300;
        }
    }
}
