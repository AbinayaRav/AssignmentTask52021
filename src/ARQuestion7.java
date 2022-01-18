import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ARQuestion7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string whose letters needs to be swapped as Upper and lower cases : ");
        String sentence = scan.nextLine().trim();
        StringBuffer buffer = new StringBuffer(sentence);
        for (int i = 0; i < buffer.length(); i++) {
            if (Character.isUpperCase(buffer.charAt(i))) {
                buffer.setCharAt(i, Character.toLowerCase(buffer.charAt(i)));
            } else if (Character.isLowerCase(buffer.charAt(i))) {
                buffer.setCharAt(i, Character.toUpperCase(buffer.charAt(i)));
            }
        }
        System.out.println("The resultant string is " + buffer.toString());
    }
}
