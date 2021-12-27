import java.util.Arrays;

public class SmallestMissingPositiveInteger {

    public static void main(String[] args) {

        int[] nums = { 0,1,2,3,4};
        int ans = 0;

        Arrays.sort(nums);

        int[] rem = Arrays.stream(nums).filter(num -> num > 0).toArray();

        for (int i = 0; i < rem.length; i++) {
            if (i == rem.length - 1 && rem[i] == i + 1) {

                ans = rem[i] + 1;
            } else if (rem[i] == i + 1) {
                continue;
            } else if (rem[i] > i + 1) {
                ans = i + 1;
                break;

            }

        }
        System.out.println(ans);
    }
}