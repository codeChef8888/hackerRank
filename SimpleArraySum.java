import java.util.List;

public class SimpleArraySum {
    public static void main(String args[]) {
        List<Integer> arr = List.of(1, 2, 3);
        int ans = simpleArraySum(arr);
        System.out.println(ans);
    }

    public static int simpleArraySum(List<Integer> ar) {
        List<Integer> arr = ar;
        int count = 0;
        for (int i : arr) {
            count = count + i;
        }
        return count;
    }
}
