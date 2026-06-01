import java.util.Arrays;
class run{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
for(int i=0;i<arr.length;i++){
System.out.print("Enter number:");
arr[i] = sc.nextInt();
}
System.out.println("Array elements:");
for (int n:arr)
{
System.out.println(n);
}
}
}