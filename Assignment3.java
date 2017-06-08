package session2;

import java.util.Scanner;

class Assignment3{

public static void main(String args[]){

Scanner in = new Scanner(System.in);

int a,b,c;

System.out.println("Enter your first number: ");
a= in.nextInt();

System.out.println("Enter your second number: ");
b= in.nextInt();

System.out.println("Enter your third number: ");
c= in.nextInt();

if ( a >b & a > c){
System.out.println(a + " is the highest number");
}
if (b > a & b>c){
System.out.println(b + " is the highest number");
}
if (c>a & c>b){
System.out.println(c + " is the highest number");
}
}

}


