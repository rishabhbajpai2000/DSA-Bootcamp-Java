import java.util.Scanner;

public class SI {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        float p, r, t;
        System.out.println("please enter your principle amount: ");
        p = input.nextFloat();
        System.out.println("please enter annual rate of intrest: ");
        r = input.nextFloat();
        System.out.println("please enter the time in years: ");
        t = input.nextFloat();
        float si = p * r * t/100;
        System.out.println("your SI for the time is: " + si);
        }
}
