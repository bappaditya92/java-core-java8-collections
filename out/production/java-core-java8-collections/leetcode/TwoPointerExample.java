import java.util.Arrays;

public class TwoPointerExample {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 10;

        int[] result = findTwoSum(arr, target);

        if (result != null) {
            System.out.println("Pair found: "
                    + result[0] + " + " + result[1]
                    + " = " + target);
        } else {
            System.out.println("No pair found");
        }
    }

    public static int[] findTwoSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null;
    }
}
