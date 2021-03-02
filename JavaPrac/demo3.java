import java.util.Locale;

public class demo3{
    public static void main(String[] args) {
        //System.out.println(0.0%0.0!=0.0/0.0);
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    break;
                    case 1:System.out.println("one");
                    case 2:System.out.println("two");
                    case 3:System.out.printf(Locale.getDefault(),"my name",1);
                // default:
                //     break;
            }
        }
        System.out.println("done");
    }
}