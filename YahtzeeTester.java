import java.util.Scanner;


public class YahtzeeTester
{
    public static void main(String[] args)
    {
            int choice = 0;
            choice = displayMenu();
            playGame(choice);
    }

    public static int displayMenu()
    {
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);
        //Loop until the user picks a valid choice (1 - 3).    LOOP #1

        while (choice>3 || choice<=0){
                System.out.println("*******************************\nWelcome to the Yahtzee Simulator!\n*******************************\n" +
                                   "Please choose from the following options:\n1. Play a Single Game\n2. Play Multiple Games\n3. Exit");
                choice = keyboard.nextInt();
        }

        //End Loop
        return choice;
    }

    public static void playGame(int aChoice)
    {
        int twoPairs = 0;
        int threePairs = 0;
        Scanner keyboard = new Scanner(System.in);
        int numGames = 0;
        Dice die1 = new Dice();
        Dice die2 = new Dice();
        Dice die3 = new Dice();
        if(aChoice == 1)
        {
            //Roll Dice
            die1.rollDice();
            die2.rollDice();
            die3.rollDice();
            System.out.println("die1: "+die1.get()+"\n");
            System.out.println("die2: "+die2.get()+"\n");
            System.out.println("die3: "+die3.get()+"\n");

            //Create Switch or if Statement here and display results.
            if(die1.get()==die2.get() && die2.get()==die3.get()){
                //threePairs++;
                System.out.println("Three pairs");
            }

            else if(die1.get()==die2.get() || die3.get()==die2.get() || die1.get()==die3.get()){
                //twoPairs++;
                System.out.println("Two Pairs");
            }
        }

        else if(aChoice == 2)
        {
            int numPlayed = 0;
            //Loop Until The User Picks a Positive Number for numGames. LOOP #2
            while(numGames<=0){
                System.out.println("Please pick a positive number - This will determine how many times you play Yahtzee.");
                numGames = keyboard.nextInt();
            }

            //End Loop

            //Create a Loop that will run as many times as the user specified in numGames. LOOP #3

            while(numGames>numPlayed){
                //Create Counters
                numPlayed++;
                //Roll the Dice
                die1.rollDice();
                die2.rollDice();
                die3.rollDice();

                //Create a Switch or if Statement Here.
                if(die1.get()==die2.get() && die2.get()==die3.get()){
                    threePairs++;
                }

                else if(die1.get()==die2.get() || die3.get()==die2.get() || die1.get()==die3.get()){
                    twoPairs++;

                }
                //Display the Contents of die1, die2, and die3 after each iteration of the loop.
                System.out.println("die1: "+die1.get()+"\n");
                System.out.println("die2: "+die2.get()+"\n");
                System.out.println("die3: "+die3.get()+"\n");

            }

            //End Loop

            //Display how many times the user played, and the contents of your counters that are keeping track of pairs.
            System.out.println("Number of games played: "+numGames+"\n");
            System.out.println("Number of two pairs: "+twoPairs+"\n");
            System.out.println("Number of three pairs: "+threePairs+"\n");
        }

        else
        {
                System.out.println("Good-Bye!");
        }

    }
}