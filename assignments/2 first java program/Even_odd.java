import java.util.Scanner;

public class Even_odd{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int a = input.nextInt();
        if (a % 2 == 0){
            System.out.println("Number " + a + " is even");
        }
        else{
            System.out.println("number " + a + " is odd");
        }
    }
    
}
