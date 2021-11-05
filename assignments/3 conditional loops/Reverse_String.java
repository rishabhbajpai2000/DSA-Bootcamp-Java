public class Reverse_String {
    public static void main(String[] args) {
        String S = "This is a string";
        int len = S.length();
        String new_1 = "";
        for(int i = len-1; i != 0; i--){
            new_1 += S.charAt(i);
        }
        System.out.println(new_1);
    }

}
