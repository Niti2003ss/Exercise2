import java.util.Scanner;
public class Exercise2_1 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Input frist number : ");
          int num1 = input.nextInt();
          System.out.print("Input second number : ");
          int num2 = input.nextInt();
          System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
          System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
          System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
          System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
          System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
     }  

}
