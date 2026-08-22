import java.util.Scanner;
 class PositiveNumber{
 static void  askForPositiveNumber(){
 Scanner sc = new Scanner(System.in);
  int num;
  do{
  System.out.print("Enter a number : ");
  num =  sc.nextInt();
 }
 while(num < 0);
   System.out.println("You Entered a Positive no. "+  num);
 }
 public static void main (String[ ] args){
   askForPositiveNumber();
 }
}