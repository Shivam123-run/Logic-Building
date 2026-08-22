import java.util.*;
  class Leapyear{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
       System.out.print("Enter the year : ");
       int year = sc.nextInt();
       int yr = (year % 400 == 0) ? 1 : 0;
         switch(yr){
      case 1:
           System.out.println("The Entered year is Leap Year");
           break;
      case 0:
           System.out.println("The Entered year is not Leap Year");
           break;
      default :
           System.out.println("The Entered year is Invalid");
    }
  }
}