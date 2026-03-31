package Arrays.Foundation;

public class second_largest_element {

    public static int SecondLargestElelment(int []nums) {
        int large = nums[0], secLarge = -1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > large) {
                secLarge = large;
                large = nums[i];
            }
            else if (nums[i] > secLarge && nums[i] < large) {
                secLarge = nums[i];
            }
        }
        return secLarge;
    }

    public static void main(String []args) {
        int []arr = {103, 103, 34, 67, 98, 12, 34, 6, 42};

        System.out.println("Second largest element is: " + SecondLargestElelment(arr));
    }

    
}
