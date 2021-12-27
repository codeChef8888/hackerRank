import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SalesByMatch {

    public static void main(String[] args) {
        List<Integer> ar = Stream.of(10, 20 ,20 ,10, 10, 30, 50, 10, 20).collect(Collectors.toList());
        int[] input = ar.stream().mapToInt(Integer::intValue).toArray();
        int count = 0;

        aa: for (int i = 0; i < input.length - 1; i++) {
            bb: for (int j = i + 1; j < input.length; j++) {

                if (input[i] == input[j] && j < input.length-1 && input[j]!=input[j+1]) {

                    i++;
                    count = count + 1;

                    continue aa;
                }else if(input[i] == input[j] && j < input.length-1 &&  input[j]==input[j+1]){

                    i++;
                    count = count + 1;
                    continue aa;
                    
                }else if(input[i] == input[j] && j == input.length-1){
                    count = count + 1;

                    continue aa;
                }

            }

        }

        System.out.println(count);
    }

}
