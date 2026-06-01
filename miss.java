public class miss{

   public static void main(Static[] args) {
     
      int[] arr = {1,2,3,5};

     int n = 5;

     int expectedSum =n * (n + 1) / 2;

     int actualSum = 0;

     for(int num : arr) {
        actualSum += num;
    }

    int missing = expectedSum - actualSum;

    System.out.println("Missing Number = " + missing);
 }
}