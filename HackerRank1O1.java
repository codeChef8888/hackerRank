import javax.sound.sampled.SourceDataLine;

public class HackerRank1O1 {

    public static void main(String[] args) {

        int i = 15;
        HackerRank1O1.fizzBuzz(i);

    }

    public static void fizzBuzz(int n) {
        int input = n;
        String in = String.valueOf(input);
        int len = in.length();
        System.out.println(len);
        final int[] ints1 = in.chars().map(x -> x - '0').toArray();
  
       
        for (int i = 0; i < len; i++) {
            if (ints1[i] % 3 == 0 && ints1[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (ints1[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (ints1[i] % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(ints1[i]);
            }

        }
    }

}
