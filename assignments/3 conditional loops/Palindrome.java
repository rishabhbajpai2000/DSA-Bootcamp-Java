public class Palindrome {
    public static void main(String[] args) {
        String S = "121";
        int len = S.length();
        String new_S = "";
        for (int i = len-1; i >= 0; i--) {
            new_S += S.charAt(i);
        }
        if (new_S == (String)S){
            System.out.println("this is a palindrome");
        }
        else{
            System.out.println("this is not palindrome");
            System.out.println("s = " + S);
            System.out.println("new_S = "+ new_S);
        }
    }

}
