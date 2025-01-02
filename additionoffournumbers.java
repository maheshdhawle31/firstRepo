
import java.util.Scanner;
public class additionoffournumbers {
    public static void main(String[] args) {

    Scanner Sc = new Scanner(System.in);

        System.out.print(" Enter a first number : ");
        double first = Sc.nextDouble();

        System.out.print(" enter a second number : ");
        double second = Sc.nextDouble();

        System.out.print(" enter a third number : ");
        double third = Sc.nextDouble();

        System.out.print(" enter a fourth number : ");
        double fourth = Sc.nextDouble();

        double add = first + second + third + fourth;
        double substract = first - second - third - fourth;
        double multiply = first * second * third * fourth;
        double divide = first / second / third / fourth;

        System.out.println("the sum of = "+add);
        System.out.println(" the difference between = "+substract);
        System.out.println(" the multiplication = "+multiply);
        System.out.println(" the division = "+divide);


    }
}
