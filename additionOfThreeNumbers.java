import java.util.Scanner;

public class additionOfThreeNumbers
{
    public static void main(String args[])
    {
        int  add, subtract, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Three Numbers : ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third =  scanner.nextInt();

        add = first + second + third;
        subtract = first - second - third;
        multiply = first * second * third;
        devide = (float) first / second / third;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);
    }
}