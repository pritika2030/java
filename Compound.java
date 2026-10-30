import java.util.Scanner;

public class Compound {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Principal:");
double p=sc.nextDouble();
System.out.print("Enter Rate:");
double r=sc.nextDouble();
System.out.print("Enter time (in year):");
double t=sc.nextDouble();
double amount=p*Math.pow((1+r/100),t);
double compoundIntrest=amount-p;
System.out.println("Compound Intrest=" + compoundIntrest);
System.out.println("Amount=" + amount);
}
}
