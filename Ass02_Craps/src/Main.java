import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean firstRoll = true;
        boolean again = true;
        boolean game = true;

        int point = 0;
        int die1 = 0;
        int die2 = 0;
        int crapsRoll = 0;

        String playAgain = "";

        Random rnd = new Random();

        do {

            firstRoll = true;

            do {
                if (firstRoll)
                {
                    System.out.println("Rolling Dice . . .");

                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;

                    if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
                    {
                        game = false;
                        System.out.println("You rolled a " + die1 + " and " + die2 + " for a total of " + crapsRoll + ". You crapped out.");
                    }
                    else if (crapsRoll == 7 || crapsRoll == 11)
                    {
                        game = false;
                        System.out.println("You rolled a " + die1 + " and " + die2 + " for a total of " + crapsRoll + ". You win.");
                    }
                    else
                    {
                        point = crapsRoll;
                        System.out.println("You rolled a " + die1 + " and " + die2 + " for a total of " + crapsRoll + ". Your point is " + crapsRoll);
                        game = true;
                        firstRoll = false;
                    }
                }

                if (!firstRoll)
                {
                    System.out.println("Rolling Dice . . .");

                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;

                    if (point == crapsRoll)
                    {
                        System.out.println("You rolled a " + die1 + " and " + die2 + " for a total of " + crapsRoll + ". You rolled your point, " + point + " so you win.");
                        game = false;
                    }
                    else if (crapsRoll == 7)
                    {
                        System.out.println("You rolled a " + die1 + " and " + die2 + " for a total of " + crapsRoll + ". You rolled a 7 before your point: " + point + ". You lose");
                        game = false;
                    }
                    else
                    {
                        System.out.println("You rolled a " + die1 + " and " + die2 + " for a total of " + crapsRoll + ". You rolled a " + crapsRoll + ", not a 7 or point, continue rolling.");
                    }
                }

            }
            while (game);

            Scanner in = new Scanner(System.in);

                System.out.print("Do you want to play again [Y, N]: ");
                playAgain = in.nextLine();

                if (playAgain.equals("Y"))
                {
                    again = true;
                }
                else if (playAgain.equals("N"))
                {
                    again = false;
                }
                else {
                    again = false;
                }

        }
        while (again);



    }
}