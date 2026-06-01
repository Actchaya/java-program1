import java.util.Scanner;

class trafficsignal{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter signal colour:");
String signal = sc.nextLine();
switch(signal)
{
case "Red":
System.out.print("STOP");
break;
case "Yellow":
System.out.print("WAIT");
break;
case "Green":
System.out.print("GO");
break;
default:
System.out.println("Invalid ");
}
}
}
