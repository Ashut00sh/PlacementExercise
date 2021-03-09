
import java.util.Arrays;
import java.util.Collections;

public class StringSort{
    public static void main(String[] args) {
        String str="20,30,10";
        String[] numbers = str.split(",");

        // Convert the string numbers into Integer and placed it into
        // an array of Integer.
        Integer[] intValues = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intValues[i] = Integer.parseInt(numbers[i].trim());
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
        System.out.println("Before = " + str);
        System.out.println("After  = " + builder.toString());
        
    }
}