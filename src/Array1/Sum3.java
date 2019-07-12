package Array1;

public class Sum3 {
    public static int sum3(int[] nums) {
        int sum=0;

        for (int i:nums
             ) {
            sum += nums[i];
        }

        return sum;
    }
}
