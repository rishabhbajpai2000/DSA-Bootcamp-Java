public class pattern_11{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            
            // print the space
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
            }
            // print the stars
            for (int j = 1; j <= 6-i; j++) {
               System.out.print("* "); 
            }
            System.out.println();
        }
    }
}