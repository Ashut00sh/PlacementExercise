class Dusara{
    void disp1(){
        System.out.println("class dusara ");
    }
}
public class Instanceof1 extends Dusara{
    public static void main(String[] args) {
        Dusara obj=new Instanceof1();
        //if we call method on thid object we get nullpointer exeption
        //obj=null;
        obj.disp1();
        //obj.show();
        System.out.println(obj instanceof Instanceof1);
    }
    static void show(){
        System.out.println("instaince of show mrthod called");
    }
}
