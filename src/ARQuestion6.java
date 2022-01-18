import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ARQuestion6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<Integer>();
        List<List<Integer>> resultantList = new ArrayList<>();
        System.out.println("Please enter the numbers where odd and even numbers need to picked from a group of numbers :");
        while (scan.hasNextInt()) {
            list1.add(scan.nextInt());
        }
        System.out.println("The number/numbers that are even : ");
        list1.stream().filter(c -> c % 2 == 0).forEach(x -> {
            System.out.print(x + "\t");
        });
        System.out.println();
        System.out.println("The number/numbers that are odd : ");
        list1.stream().filter(c -> c % 2 != 0).forEach(x -> {
            System.out.print(x + "\t");
        });
    }
}
