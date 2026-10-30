import java.util.Scanner;
public class CharArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
char[] arr=new char[n];
System.out.println("Enter characters:");
for(int i=0;i<n;i++){
arr[i]=sc.next().charAt(0);
}
String str=" ";
for(int i=0;i<n;i++){
str=str+arr[i];
}
System.out.println("String:"+str);
}
}