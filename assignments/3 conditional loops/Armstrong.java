import static java.lang.Math.pow;
public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int n_i = n;
        String S = String.valueOf(n);
        int len = S.length();
        int r = 0;
        double compare = 0;
        while (n != 0){
            r = n%10;
            n = n/10;
            compare += pow(r,len);
        }
        if ((int)compare == n_i){
        System.out.println("yes its an armstrong number");
        }
        else{
            System.out.println("no this is not a arm number");
            System.out.println("compare = "+ compare + " " + "n = " + n);
        }
    }
    
}
