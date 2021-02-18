import java.util.*;
import java.util.Map.Entry;
public class maxcharusingmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        //create hash map to get associative array
        HashMap<Character,Integer>hm=new HashMap<>();
        //convert string into char array
        char[]c=str.replaceAll("\\s", "").toCharArray();
        for (char d : c) {
            if (hm.containsKey(d)) {
                hm.put(d, hm.get(d)+1);
            }else{
                hm.put(d,1);
            }
        }
        //Set<Entry<Character, Integer>> entrySet = hm.entrySet();
        int maxcnt=0;
        char maxchar=' ';
        for (Entry<Character,Integer>  me : hm.entrySet()){
            if (maxcnt<me.getValue()) {
                maxcnt=me.getValue();
                maxchar=me.getKey();
            }
        }
        System.out.println("max char= "+maxchar);
    }
}
