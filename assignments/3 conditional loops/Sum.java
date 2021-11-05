import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("please start entering your numbers and when you want to stop enter 0");
        int n = 0;
        int i = -1;
        Scanner input = new Scanner(System.in);
        while(i != 0){
        i = input.nextInt();
        n += i;
    }
    System.out.println(n);
}
}
