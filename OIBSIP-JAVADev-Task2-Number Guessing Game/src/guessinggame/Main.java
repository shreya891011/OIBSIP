package guessinggame;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("      JAVA NUMBER GUESSING GAME");
        System.out.println("========================================");
        System.out.print("\nEnter Your Name : ");
        String playerName = sc.nextLine();

        Player player = new Player(playerName);

        int choice;

        do 
        {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Start New Game");
            System.out.println("2. View Scoreboard");
            System.out.println("3. View High Score");
            System.out.println("4. Reset High Score");
            System.out.println("5. Exit");        
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

          switch(choice)
         {

           case 1:
               Game game = new Game(player);
               game.startGame();
               break;

           case 2:
                ScoreBoard.showScore(player);
                break;

           case 3:
                FileManager.showHighScore();
                break;

           case 4:
                FileManager.resetHighScore();
                player = new Player(player.getName());
                break;

           case 5:
                System.out.println("Thank You For Playing!");
                break;

           default:
               System.out.println("Invalid Choice!");

}
        } 
        while(choice != 5);
    }

}