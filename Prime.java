import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
int count=0;
int num=2;
while(count<100){
int i;
for(i=2;i<num;i++){
if(num%i==0){
break;
}
}
if(i==num){
System.out.println(num + " ");
count++;
}
num++;
}
}
}
