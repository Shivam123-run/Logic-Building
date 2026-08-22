import java.util.*;
 class DefaultValues{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Data Type : ");
      String DataType = sc.nextLine();
     switch (DataType){
      case "int" :
       System.out.println("The default value for int is 0");
       break;
       case "long" :
       System.out.println("The default value for long is 0L");
       break;
       case "float" :
       System.out.println("The default value for float is 0.0f");
       break;
       case "byte" :
       System.out.println("The default value for byte is 0");
       break;
       case "short" :
       System.out.println("The default value for short is 0");
       break;
       case "double" :
       System.out.println("The default value for double is 0.0d");
       break;
       case "char" :
       System.out.println("The default value for char is '\u0000'");
       break;
       case "boolean" :
       System.out.println("The default value for boolean is false");
       break;
       default :
       System.out.println("Invalid DataType");
       break;
    }
  }
}