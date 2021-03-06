import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class mapdemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("cat", 100);
        hm.put("dog",200);
        hm.put("tea",650);
        Set<Entry<String,Integer>>entry=hm.entrySet();
        for(Entry<String,Integer>en:entry){
            System.out.println(en);
        }
    }
}
