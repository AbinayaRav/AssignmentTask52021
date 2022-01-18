import java.util.Scanner;

public class ARQuestion4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sentence to determine the isogram :");
        String sentence = scan.nextLine().trim();
        ARQuestion4 ar = new ARQuestion4();
        if (ar.determineIsogram(sentence)) {
            System.out.println("The above string is an isogram.");
        } else {
            System.out.println("The above string is not an isogram.");
        }
    }

    public boolean determineIsogram(String str1) {
        boolean flag = true;
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (!(c == ' ')) {
                for (int j = i + 1; j < str1.length(); j++) {
                    char d = str1.charAt(j);
                    if ((Character.toUpperCase(c) == Character.toUpperCase(d))) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }
}
