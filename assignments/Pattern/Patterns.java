public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row<2*n; row++){
            if (row<=n){
                for(int col = 1; col<=row; col++)
                System.out.print("*");
            System.out.println();
            }
            else{
                for (int col = row-1; col>=0 ; col--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
