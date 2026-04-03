package Arrays.Foundation;

class LeftRotateByKElement {

    public static void reverse(int[] nums, int st, int end) {
        while(st < end) {
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []nums = {1, 2, 3, 4, 5, 6};
        int n = nums.length;
        int k = 3;
        k = k%n;
        
        reverse(nums, n-k, n-1);
        reverse(nums, 0, (n-k)-1);
        reverse(nums, 0, n-1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}