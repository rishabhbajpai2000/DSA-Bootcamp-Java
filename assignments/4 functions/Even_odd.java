import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (even(num) == true) {
            System.out.println("its an even number");
        } else {
            System.out.println("its an odd number");
        }

    }

    static Boolean even(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

}
