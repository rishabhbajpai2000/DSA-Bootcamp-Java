public class pattern_9 {
   public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            //print space
            for (int j = 1; j<i;j++) {
                System.out.print(" ");
            }
            // print the stars
           for (int j = 1; j <= 2*(5-i) + 1; j++) {
               System.out.print("*");
           } 

            System.out.println();
           
        }
    } 
}
