import java.util.Scanner;

public class CharString {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//char to string
System.out.print("Enter a character:");
char ch=sc.next().charAt(0);
String str=String.valueOf(ch);
System.out.println("Char to String:\""+ str+"\"");
//string to char
System.out.print("Enter a String:");
String input=sc.next();
System.out.print("String to Char:");
for(int i=0;i<input.length();i++){
System.out.print(""+ input.charAt(i)+ "");
if(i<input.length()-1){
System.out.print(",");
}
}
}
}
