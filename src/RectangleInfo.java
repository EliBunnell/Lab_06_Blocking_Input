import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length = 0.0; // Example length
        double width = 0.0;  // Example width
        double area = 0.0;
        double perimeter = 0.0;
        double hypotenuse = 0.0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Enter the length: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                if (length <= 0)
                {
                    System.out.println("must be a positive value.");
                }
                else
                {
                    done = true;
                }
            }
            else //not a number
            {
                trash = in.nextLine();
                System.out.println("illegal number: " + trash + ". Please try again.");
            }
        } while (!done);
        done = false;

        do
        {
            System.out.print("Enter the width: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if (width <= 0)
                {
                    System.out.println("width must be a positive value. Please try again.");
                }
                else
                {
                    done = true;
                }
            }
            else //not a number
            {
                trash = in.nextLine();
                System.out.println("illegal number: " + trash + ". Please try again.");
            }
        } while (!done);
        done = false;


        area = length * width;
        perimeter = 2 * (length + width);
        hypotenuse = Math.sqrt(length * length + width * width);

        System.out.printf("For a rectangle with length %.2f and width %.2f:%n", length, width);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal (hypotenuse): %.2f%n", hypotenuse);
    }
}
