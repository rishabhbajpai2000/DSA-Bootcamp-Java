public class pattern_12 {
   public static void main(String[] args) {
       int n = 5;
       for (int i = 1; i < 2*n; i++) {
           // printing the space 
           int l = 0;
           int m = 0;
           if (i<=n){
             l = i;
             m=n-i;
           }
           else{
            m = i-n;
            l = 2*n-i;
           }
            for (int j = 0; j <= l; j++) {
                System.out.print(" ");
                
            }
           // printing the stars
            for (int j = 0; j <= m; j++) {
                System.out.print("* ");
                
            }

           System.out.println();
       }
   }
}
