package guessinggame;

public class ScoreBoard 
{
   public static void showScore(Player player)
   {
      System.out.println("\n===================================");
      System.out.println("        PLAYER SCOREBOARD"); 
      System.out.println("===================================");
      System.out.println("Player Name   : " + player.getName());
      System.out.println("Games Played  : " + player.getGamesPlayed());
      System.out.println("Games Won     : " + player.getGamesWon());
      System.out.println("Games Lost    : " + player.getGamesLost());

       if (player.getBestScore() == Integer.MAX_VALUE)
            System.out.println("Best Score    : No Record");

       else
          System.out.println("Best Score    : "+ player.getBestScore()+ " Attempts (Saved)");
 

      if (player.getGamesPlayed() != 0) 
      {
          double percent =(double) player.getGamesWon()/ player.getGamesPlayed()* 100;
          System.out.printf("Win Rate      : %.2f%%\n", percent);     
      }
      
      System.out.println("===================================");
    }

}