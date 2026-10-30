import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size:");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println("Enter numbers:");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Reverse Array:");
for(int i=n-1;i>=0;i--){
System.out.println(a[i] + " ");
}
}
}