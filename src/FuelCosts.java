import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            double tankSize = 0.0;
            double mpg = 0.0;
            double pricePerGal = 0.0;
            double miles100Cost = 0.0;
            double fullTankDistance = 0.0;

            boolean done = false;
            String trash = "";

            do
            {
                System.out.print("Enter the tank size in gallons: ");
                if (in.hasNextDouble())
                {
                    tankSize = in.nextDouble();
                    in.nextLine();
                    if (tankSize <= 0)
                    {
                        System.out.println("Tank size must be greater than 0. Please try again.");
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
            System.out.print("Enter the miles per gallon: ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg <= 0)
                {
                    System.out.println("Miles per gallon must be greater than 0. Please try again.");
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
            System.out.print("Enter the price per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGal = in.nextDouble();
                in.nextLine();
                if (pricePerGal <= 0)
                {
                    System.out.println("Price per gallon must be greater than 0. Please try again.");
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

            miles100Cost = (100 / mpg) * pricePerGal;
            fullTankDistance = tankSize * mpg;

            System.out.printf("The cost per 100 miles is $%.2f\n", miles100Cost);
            System.out.printf("The distance possible on a full tank is %.1f miles\n", fullTankDistance);

    }
}
