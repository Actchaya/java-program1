class abc{
public static void main(String[] args)
{
for (int i=1;i<=5;i++)
{
for(char ch='A'; ch<='A' +i - 1; ch++)
{
System.out.print(ch);
}
System.out.println();
}
}
}