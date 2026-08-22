import java.util.*;
 class DaySwitch{
   public static void main(){
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter number for Day from 1 to 7 : ");
       int day = sc.nextInt();
      switch(day){
       case 1:
        System.out.println("Today is Sunday");
       break;
       case 2:
        System.out.println("Today is Monday");
       break;
       case 3:
        System.out.println("Today is Tuesday");
       break;
       case 4:
        System.out.println("Today is Wednesday");
       break;
       case 5:
        System.out.println("Today is Thursday");
       break;
       case 6:
        System.out.println("Today is Friday");
       break;
       case 7:
        System.out.println("Today is Saturday");
       break;
       default :
         System.out.println("Invalid number choice");
       break;
    }
  }
}