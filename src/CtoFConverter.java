import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0; // Example Celsius temperature
        double fahrenheit = 0.0; //(celsius * 9/5) + 32;
        String trash = "";
        boolean done = false;

        do
        {


            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.1f degrees Celsius is %.1f degrees Fahrenheit", celsius, fahrenheit);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("illegal number: " + trash + ". Please try again.");

            }
        }while(!done);


    }
}
