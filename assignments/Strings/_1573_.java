import java.util.Arrays;

public class _1573_ {
    public static void main(String args[]) {
        // System.out.println("rishabh".substring(0, 2));
        // String[] print = splittor("10101", 0, 1, 5);
        // System.out.println(Arrays.toString(print));
        int ans = numWays("000");
        System.out.println(ans);
    }

    static int numWays(String s) {
       // we count the number of ones till ith index
        int len = s.length();
        int[] ones = new int[len];
        for (int i = 0; i<len; i++){
            if (i == 0){
                if (s.charAt(i) == '0')
                    ones[i] = 0;
                else
                    ones[i] = 1;
            }
            else
                if (s.charAt(i) == '1')
                    ones[i] = 1 + ones[i-1];
                else
                    ones[i] = ones[i-1];
                
        }
        // now checking for the values 
        int count = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                // validating the string. 
                int first = ones[i];
                int second = ones[j] - ones[i];
                int third = ones[len-1] - ones[j];
                if (first == second && second == third){
                    count++;
                }
            }
        }
        return count;
        
    }
}