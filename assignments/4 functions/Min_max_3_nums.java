import java.util.Scanner;

public class Min_max_3_nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min_1 = minimum(a,b,c);
        int max_1 = maximum(a,b,c);
        System.out.println("minimum = "+ min_1 + " "+ "maximum = " + max_1);
    }
    static int minimum(int a, int b, int c ){
        int loc_min = Math.min(a, b);
        return Math.min(loc_min, c);
    }
    static int maximum(int a, int b, int c ){
        int loc_max = Math.max(a, b);
        return Math.max(loc_max, c);
    }
}
