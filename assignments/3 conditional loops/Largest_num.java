import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        System.out.println("please enter the number of numbers you want to compare from");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("now start entering the numbers");
        var m = input.nextInt();
        for (int i = 1; i < n; i++) {
            int j = input.nextInt();
            m = Math.max(m, j);
        }
        System.out.println(m);
    }
}
