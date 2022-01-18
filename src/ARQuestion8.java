import java.util.Scanner;

public class ARQuestion8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the combination of braces to check if they are balanced : ");
        String str = scan.nextLine();
        StringBuilder braces = new StringBuilder(str);
        char initBrace = ' ';
        int initIndex = 0;
        int count = 0;
        String[] brace = new String[]{"{}", "()", "[]"};
        char finalBrace = ' ';
        int i;
        boolean flag;
        while (braces.length() > 0) {
            i = 0;
            flag = false;
            initBrace = braces.charAt(i);
            //System.out.println(initBrace + " init braces");
            for (int k = 0; k < brace.length; k++) {
                if (brace[k].contains(String.valueOf(initBrace))) {
                    initIndex = brace[k].indexOf(initBrace);
                    if (initIndex == 0)
                        finalBrace = brace[k].charAt(1);
                    else if (initIndex == 1)
                        finalBrace = brace[k].charAt(0);
                }
            }
            for (int j = i + 1; j < braces.length(); j++) {
                if (braces.charAt(j) == finalBrace) {
                    //System.out.println(initBrace + "  " + finalBrace);
                    braces.deleteCharAt(j);
                    braces.deleteCharAt(i);
                    flag = true;
                    break;
                }
            }
            i++;
            if (flag == false)
                break;
        }
        if (braces.length() == 0)
            System.out.println("The braces are balanced ");
        else
            System.out.println("The braces are not balanced");

    }
}

