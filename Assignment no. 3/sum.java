import java.util.Scanner;

class  sum{

    
    static int sumOfTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstInput = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondInput = scanner.nextInt();

                int result = sumOfTwoNumbers(firstInput, secondInput);
        System.out.println("The sum of " + firstInput + " and " + secondInput + " is " + result + ".");

        
    }
}
