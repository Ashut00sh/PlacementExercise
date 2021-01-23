import java.util.*;
public class reversestring {
    public static String reverse(String sentence) {
        if (sentence.isEmpty())
          return sentence;

        return reverse(sentence.substring(1)) + sentence.charAt(0);
      }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Sentences :");
    String sentence = sc.nextLine();
        String reversed = reverse(sentence);
        System.out.println(" " + reversed);
        sc.close();
}
}
