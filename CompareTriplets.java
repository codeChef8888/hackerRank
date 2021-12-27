import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int countA = 0;
        int countB = 0;
        List<Integer> ans = new ArrayList<>();
        List<Integer> arr = a;
        List<Integer> brr = b;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == brr.get(i)) {
                countA = countA;
                countB = countB;
            } else if (arr.get(i) > brr.get(i)) {
                countA += 1;
            }else {
                countB+=1;
            }

        }
        return ans=List.of(countA,countB);

    }

    public static void main(String[] args) {
        List<Integer> a = List.of(7, 3, 11);
        List<Integer> b = List.of(6, 3, 10);
        List<Integer> c = compareTriplets(a, b);
        System.out.println(c);
    }
}
