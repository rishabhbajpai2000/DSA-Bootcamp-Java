public class pattern_13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // printing the spaces
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("0");
            }

            // rest of the pattern
            if (i==1){
            System.out.print("*");
            }
            else if(i==n){
                for (int j = 1; j <= 2*n-1; j++) {
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                // for the spaces
                for (int j = 1; j <=i+1; j++) {
                    System.out.print("0");
                }
                System.out.print("*");
            }


            System.out.println();
        }
    }
}