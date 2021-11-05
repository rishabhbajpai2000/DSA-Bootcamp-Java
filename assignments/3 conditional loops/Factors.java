import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("please enter your number: ");
        int n = input.nextInt();
        for(int i = 1; i < (int)n/2; i++){
            if (n%i == 0 ){
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
    }
    
}
