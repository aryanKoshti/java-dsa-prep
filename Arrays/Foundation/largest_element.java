package Arrays.Foundation;

public class largest_element{
    public static void main(String args[]) {
        int arr[] = {34, 56, 32, 87, 90, 123, 253};
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("Largest Element : " + largest);
    }
}
