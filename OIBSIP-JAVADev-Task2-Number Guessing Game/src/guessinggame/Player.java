package guessinggame;

public class Player
{
    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int bestScore;

    public Player(String name)
    {
        this.name = name;
       bestScore = FileManager.loadHighScore();
    }

    public String getName() 
    {
        return name;
    }

    public int getGamesPlayed() 
    {
        return gamesPlayed;
    }

    public int getGamesWon() 
    {
        return gamesWon;
    }

    public int getGamesLost() 
    {
        return gamesLost;
    }

    public int getBestScore() 
    {
        return bestScore;
    }

   public void winGame(int attempts)
{
    gamesPlayed++;
    gamesWon++;

    if (attempts < bestScore)
    {
        bestScore = attempts;
        FileManager.saveHighScore(bestScore);
        System.out.println("\n********************************");
        System.out.println("🏆 CONGRATULATIONS!");
        System.out.println("🎉 NEW HIGH SCORE : " + bestScore + " Attempts");
        System.out.println("********************************");
    }
    else
    {
        System.out.println("\nGood Job!");

        if(bestScore == Integer.MAX_VALUE)
        {
            System.out.println("No High Score Available");
        }
        else
        {
            System.out.println("Current High Score : "
                    + bestScore + " Attempts");
        }
    }
}

    public void loseGame() 
    {
        gamesPlayed++;
        gamesLost++;
    }
}