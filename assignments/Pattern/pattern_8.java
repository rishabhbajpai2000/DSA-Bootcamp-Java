public class pattern_8 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            //print space
            for (int j = 0; j <= 5-i;j++) {
                System.out.print("0");
            }
            // print the stars
            for (int j = 1; j <2*i;j++) {
                System.out.print("*");
            }

            System.out.println();
           
        }
    }    
}
