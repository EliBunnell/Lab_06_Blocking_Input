import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    public static void main(String[] args)

    {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int targetNum = 0;
        int guessNum = 0;

        targetNum = rand.nextInt(10) + 1;

        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Enter a guess between 1 and 10: ");
            if (in.hasNextInt())
            {
                guessNum = in.nextInt();
                in.nextLine();
                if (guessNum < 1 || guessNum > 10)
                {
                    System.out.println("Your guess must be between 1 and 10. Please try again.");
                    done = false;
                }
                else if (guessNum < targetNum)
                {
                    System.out.println("Too low. Target is " + targetNum);
                    done = true;
                }
                else if (guessNum > targetNum)
                {
                    System.out.println("Too high. Target is " + targetNum);
                    done = true;
                }
                else
                {
                    System.out.println("Congratulations! You guessed the number " + targetNum + " correctly!");
                    done = true;
                }

            }

        }while(!done);
    }
}
