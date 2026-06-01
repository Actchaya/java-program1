public class end{
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                  arr[index] = arr[i];
                  index++;
                }
              }
              while(index < arr.length) {
                 arr[index] =0;
                 index++;
            }
for(int n : arr) {
            System.out.print(n + " ");
          }
      }
}