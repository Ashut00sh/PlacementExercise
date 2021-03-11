
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupliCharInStr{
    public static void main(String[] args) {
        String str="a bb ccc dddd";
        char ch[]=str.replaceAll(" ", "").toCharArray();
        Map<Character,Integer>hm=new HashMap<>();
        for(char i:ch){
            if (hm.containsKey(i)) {
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i, 1);
            }
        }
        Set<Map.Entry<Character,Integer>>entr=hm.entrySet();
        for(Map.Entry<Character,Integer> me:entr){
            if (me.getValue()>1) {
                System.out.println("count is= "+me.getValue()+"\t"+"Duplicate char is= "+me.getKey());
            }
        }
    }
}