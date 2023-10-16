import java.util.Scanner;
public class LinearEquationLogic {
    private void getCoordinates() {
        System.out.println("Welcome to the linear equation calculator!");
        System.out.println("Enter coordinate 1: ");
        //String cord1 = Scanner.nextLine;
        System.out.println("Enter coordinate 2: ");
        //String cord2 = Scanner.nextLine();
        //System.out.println("The two points are "+cord1+" and "+cord2);

        System.out.println("The equation of the line between these points is ");

        System.out.println("The slope of this line is ");

        System.out.println("The y-intercept of the line is ");

        System.out.println("The distance between the two points is ");

        System.out.println("Enter a value for x ");
        //int xValue = Scanner.nextInt();

        System.out.println("The point on the line is ");

        System.out.println("Would you like to enter another pair of coordinates? y/n: ";
        String yesNo = Scanner.nextLine();
        String yes = ("y");
        String no = ("no");

            if (yesNo == yes) {
                getCoordinates();
            } else {

            }


    }

}
