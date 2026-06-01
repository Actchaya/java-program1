import java.util.Scanner;
class arithmetic{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int a = sc.nextInt();
System.out.println("Enter second number:");
int b = sc.nextInt();
int max = (a>b)?a:b;
System.out.println("largest no"+max);
}
}
