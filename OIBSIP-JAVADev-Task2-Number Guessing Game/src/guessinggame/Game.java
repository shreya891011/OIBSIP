package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class Game 
{
    private Player player;
    private Scanner sc;
    private Random random;

    public Game(Player player) 
    {
        this.player = player;
        sc = new Scanner(System.in);
        random = new Random();
    }

    public void startGame()
    {
        System.out.println("\n========== NEW GAME ==========");
        System.out.println("Choose Difficulty");
        System.out.println("1. Easy (1-50, 10 Attempts)");
        System.out.println("2. Medium (1-100, 7 Attempts)");
        System.out.println("3. Hard (1-200, 5 Attempts)");
        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();
        Difficulty difficulty;

        switch (choice) 
        {
            case 1:
                difficulty = new Difficulty(50, 10);
                break;

            case 2:
                difficulty = new Difficulty(100, 7);
                break;

            case 3:
                difficulty = new Difficulty(200, 5);
                break;

            default:
                System.out.println("Invalid Choice!");
                return;
        }
        play(difficulty);
    }

   private void play(Difficulty difficulty) 
   {
    int secretNumber = random.nextInt(difficulty.getMaxNumber()) + 1;
    int attempts = 0;
    boolean guessed = false;
    long startTime = System.currentTimeMillis();

    System.out.println("\n==================================");
    System.out.println(" Guess the number between 1 and " + difficulty.getMaxNumber());
    System.out.println("==================================");

    while (attempts < difficulty.getMaxAttempts()) 
    {
        int guess = 0;
        while (true) 
        {
            System.out.print("\nAttempt "+ (attempts + 1)+ "/"+ difficulty.getMaxAttempts()+ " : ");

            if (sc.hasNextInt()) 
            {
                guess = sc.nextInt();
                if (guess >= 1 &&guess <= difficulty.getMaxNumber())
                     break;
                else 
                    System.out.println("Please enter a number between 1 and "+ difficulty.getMaxNumber());
            }
            else 
            {
                System.out.println("Invalid Input! Numbers only.");
                sc.next();
            }
        }
        attempts++;
        if (guess == secretNumber) 
        {
            guessed = true;
            break;
        } 
        else if (guess < secretNumber) 
        {
            System.out.println("Too Low!");

        } 
        else
        {
            System.out.println("Too High!");
        }
    }
    long endTime = System.currentTimeMillis();
    long seconds = (endTime - startTime) / 1000;

    if (guessed) 
    {
        System.out.println("\n*****************************");
        System.out.println(" Congratulations!");
        System.out.println("*****************************");
        System.out.println("Correct Number : " + secretNumber);
        System.out.println("Attempts : " + attempts);
        System.out.println("Time Taken : " + seconds + " seconds");
        player.winGame(attempts);
    } 
    else
    {
        System.out.println("\n*****************************");
        System.out.println(" You Lost!");
        System.out.println("*****************************");
        System.out.println("Correct Number : " + secretNumber);
        player.loseGame();
    }
    playAgain();
}

   private void playAgain() 
   {
      System.out.print("\nDo you want to play again? (Y/N): ");
      String choice = sc.next();
    if (choice.equalsIgnoreCase("Y"))
    {
        startGame();
    }
    else 
    {
        System.out.println("\nReturning to Main Menu...");
    }
}
   
}