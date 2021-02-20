import java.util.*;
import java.util.Map.Entry;

class HashMap1{
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        hm.put("cat", 10);
        hm.put("mat", 20);
        hm.put("bat", 30);
        // System.out.println(hm.entrySet());
        // System.out.println(hm.values());
        // System.out.println(hm.keySet());
        Set<Entry<String, Integer>> entry = hm.entrySet();
        System.out.println("hash map");
        //System.out.println(hm.entrySet());
        for(Entry<String,Integer> e:entry){
            //System.out.println(e.setValue(e.getValue()*10));
          //  System.out.println(e.getValue());
        }
        System.out.println(getHash("cat"));
        // System.out.println();
    }
    public static int getHash(String str){
        int hash=0;
        for(int i=0;i<str.length();i++){
            hash+=str.charAt(i);
        }
        return hash;
    }
}