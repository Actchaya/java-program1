import java.util.Scanner;

class swi{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter day number (1-7):");
int day = sc.nextInt();
switch(day)
{
case 1:
System.out.print("Sunday");
case 2:
System.out.print("Monday");
case 3:
System.out.print("Tuesday");
case 4:
System.out.print("Wednesday");
case 5:
System.out.print("Thursday");
case 6:
System.out.print("Friday");
case 7:
System.out.print("Saturday");
break;
default:
System.out.println("Invalid Day");
}
 }
  }




