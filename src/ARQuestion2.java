import java.util.Arrays;
import java.util.Scanner;

public class ARQuestion2 {
    public static void main(String[] args) {
        System.out.println("Please enter the size of the array : ");
        Scanner scan = new Scanner(System.in);
        try {
            int size = scan.nextInt();
            int[] array1 = new int[size];
            System.out.println("Please enter the elements of the array whose sum needs to be determined except highest and lowest values :");
            for (int i = 0; i < size; i++) {
                array1[i] = scan.nextInt();
            }
            int max = Arrays.stream(array1).max().getAsInt();
            int min = Arrays.stream(array1).min().getAsInt();
            int sum = Arrays.stream(array1).sum() - (max + min);
            System.out.println("The sum of all the elements of the array excluding max and min values : " + sum);
        } catch (Exception e) {
            System.out.println("Some exception !! Please try again!!");
        }
    }
}
