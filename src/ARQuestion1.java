import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ARQuestion1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sentence in which the shortest word needs to be determined :");
        String sentence = scan.nextLine();
        int min = Integer.MAX_VALUE;
        int[] i = new int[]{0};
        String[] strArray = sentence.split(" ");
        for (String s : strArray) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        i[0] = min;
        System.out.println("The words with the shortest length is/are :");
        Arrays.stream(strArray).filter(c -> c.length() == i[0]).forEach(System.out::println);
        System.out.println("The word with the shortest length is : " + min);
    }
}
