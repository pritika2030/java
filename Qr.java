import java.util.Scanner;

public class Qr {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter Dividend=");
int dividend=sc.nextInt();
System.out.print("Enter Divisor=");
int divisor=sc.nextInt();
int quotient=dividend/divisor;
System.out.println("Quotient="+ quotient);
int reaminder=dividend%divisor;
System.out.println("Remainder=" + reaminder);
}
}
