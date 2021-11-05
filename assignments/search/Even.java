public class Even {
    public static void main(String[] args){
        int ans = findNumbers({12,345,2,6,7896});
        System.out.println(ans);
    }

static int findNumbers(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++){
        if (((String)nums[i]).length() %2 == 0){
            count += 1;
        }
    }
    return count;
}
}