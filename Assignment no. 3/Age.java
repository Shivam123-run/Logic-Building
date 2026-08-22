import java.util.Scanner;

 class Age{
  public static void checkAgeCategory(int age){
  if (age >= 60)
  {
 System.out.println("The Person is Senior Citizen");
}
 else if (age <= 30)
  {
 System.out.println("The Person is Adult");
}
else if (age <= 18)
  {
 System.out.println("The Person is Minor");
}
} 
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your age: ");
  int number = sc.nextInt();
  checkAgeCategory(number);
  }
}