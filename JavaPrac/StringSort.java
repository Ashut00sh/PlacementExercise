
import java.util.Arrays;
import java.util.Collections;

public class StringSort{
    public static void main(String[] args) {
        String str="20,30,10";
        String[] numbers = str.split(",");
        // for (int i = 0; i < str.length(); i++) {
        //     System.out.println("array of string "+numbers[i].trim()+" ");
        // }
        // Convert the string numbers into Integer and placed it into
        // an array of Integer.
        Integer[] intValues = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intValues[i] = Integer.parseInt(numbers[i]);
            //System.out.print("convert int values "+intValues[i]+"  ");
        }
        //System.out.println("intvalue length= "+intValues.length);
        Arrays.sort(intValues);
        for (int i = 0; i < intValues.length; i++) {
            // if (intValues[i]>intValues[i+1]) {
            //     int temp=intValues[i];
            //     intValues[i]=intValues[i+1];
            //     intValues[i+1]=temp;
            // }
            System.out.println("intval "+intValues[i]);
        }
        
        for (int i = 0; i < intValues.length; i++) {
            System.out.println("desc= "+intValues[i]);
        }
        // Sort the number in ascending order using the
        // Collections.sort() method.
        Collections.sort(Arrays.asList(intValues));

        // Convert back the sorted number into string using the
        // StringBuilder object. Prints the sorted string numbers.
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < intValues.length; i++) {
            Integer intValue = intValues[i];
            builder.append(intValue);
            if (i < intValues.length - 1) {
                builder.append(", ");
            }
        }
       // System.out.println("Before = " + str);
       // System.out.println("After  = " + builder.toString());
        
    }
}