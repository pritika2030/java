import java.util.Scanner;
public class ReverseString {
static String reverse(String str){
if(str.length() == 0){
return str;
}
return 
reverse(str.substring(1)) + str.charAt(0);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String str=sc.nextLine();
String result=reverse(str);
System.out.println("Reversed String:"+ result);
}
}
