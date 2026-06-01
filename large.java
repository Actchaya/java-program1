class large{
public static void main(String[] args)
{
int[] arr ={5,8,2,10};
int max = arr[0];
for (int n:arr){
if(n>max){
max = n;
}
}
System.out.println(max);
}
}