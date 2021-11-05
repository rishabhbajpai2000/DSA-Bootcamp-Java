import java.util.Scanner;

public class Greeting {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = input.next();
        System.out.println("oh hellow " + name);
        
    }
    
}
