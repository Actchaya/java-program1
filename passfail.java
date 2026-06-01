import java.util.Scanner;
class passfail{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks:");
int marks = sc.nextInt();
if(marks >= 45){
System.out.println("PASS");
}
else{
System.out.println("FAIL`");
}
}
}
