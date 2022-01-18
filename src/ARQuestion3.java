import java.util.Arrays;
import java.util.Scanner;

public class ARQuestion3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sentence in which spaces need to be removed :");
        String sentence = scan.nextLine();
        String newSentence = sentence.trim();
        newSentence = newSentence.replaceAll(" ", "");
        System.out.println("The new sentence is " + newSentence);
    }
}
