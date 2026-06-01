class missing{
public static void main(String[] args)
{
int[] arr = {1,2,4,6};
int n=6;
for(int i=1;i<=n;i++)
{
Boolean found = false;
for(int j=0;j<arr.length;j++)
{
if(arr[j] == i){
found = true;
break;
}
}
if(!found){
System.out.println(i);
}
}
}
}