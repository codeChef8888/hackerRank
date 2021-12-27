import java.util.List;
import java.util.Arrays;

public class DiagonalDifferene {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(2, 2, 2),
                Arrays.asList(3, 3, 3));
        int ans = diagonalDifference(list);

    }

    public static int diagonalDifference(List<List<Integer>> ar) {
        List<List<Integer>> list = ar;
        int ans = 0;
        // initialize the array,
        // specify only the number of rows
        int[][] arr = new int[list.size()][];

        int[][] tempArray = new int[0][0];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {

                arr[i][j] = list.get(i).get(j);
            }
        }
        // int left = arr[0][0] + arr[1][1] + arr[2][2];
        // int right = arr[0][2] + arr[1][1] + arr[2][0];
        // System.out.println(left);
        // System.out.println(right);
        // ans = Math.abs(left - right);

        for (int[] is : tempArray) {
            System.out.println(is);
        }
        return ans;
    }
}
