import java.util.Scanner;

public class ARQuestion5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sentence which needs to be reversed :");
        String sentence = scan.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println("The reversed string is : " + sb.reverse());
    }
}
