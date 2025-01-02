
import java.util.Scanner;
public class additionoftwonumbers {
    public static void main(String[] args) {

    Scanner Sc = new Scanner(System.in);

        System.out.print(" Enter a first number : ");
        double first = Sc.nextDouble();

        System.out.print(" enter a second number : ");
        double second = Sc.nextDouble();

        double add = first + second ;
        double substract = first - second ;
        double multiply = first * second ;
        double divide = first / second ;

        System.out.println("the sum of = "+add);
        System.out.println(" the difference between = "+substract);
        System.out.println(" the multiplication = "+multiply);
        System.out.println(" the division = "+divide);

    }
}
