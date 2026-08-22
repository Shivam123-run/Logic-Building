import java.util.*;
 class GradeSwitch{
  public static void main(String[ ] args){
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter marks : ");
        int marks = sc.nextInt();
      switch(marks / 10){
       case 10:
             System.out.println("Your Grade is O");
              break;
        case 9:
             System.out.println("Your Grade is A");
             break;
        case 8:
             System.out.println("Your Grade is B");
             break;
        case 7:
             System.out.println("Your Grade is C");
             break;
         case 6:
             System.out.println("Your Grade is D");
             break;
        default :
             System.out.println("Your Grade is F");
             break;
    }
  }
}
