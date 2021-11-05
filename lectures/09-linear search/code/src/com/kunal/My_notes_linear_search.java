public class My_notes_linear_search {
    public static void main(String[] args) {
        int num[] = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 23;
        boolean ans = linear_search(nums, target);
        System.out.println(ans);
    }

    static boolean linear_search(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target);
            return true;
        }
        return false;
    }
}
