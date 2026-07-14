package guessinggame;

import java.io.*;

public class FileManager
{
    private static final String FILE_NAME = "highscore.txt";
    public static void saveHighScore(int score) 
    {
        try
        {
            FileWriter fw = new FileWriter(FILE_NAME);
            fw.write(String.valueOf(score));
            fw.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Error Saving High Score!");
        }
    }
    
    public static int loadHighScore() 
    {
        try 
        {
            File file = new File(FILE_NAME);
            if (!file.exists())
                return Integer.MAX_VALUE;
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            int score = Integer.parseInt(br.readLine());
            br.close();
            return score;
        } 
        catch (Exception e)
        {
           return Integer.MAX_VALUE;
        }
    }
    public static void showHighScore()
 {
    int score = loadHighScore();
    System.out.println("\n========== HIGH SCORE ==========");
    if(score == Integer.MAX_VALUE)
    {
        System.out.println("No High Score Available.");
    }
    else
    {
        System.out.println("Best Score : " + score + " Attempts");
    }
    System.out.println("===============================");
 }
    public static void resetHighScore()
 {
    try
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Are you sure you want to reset High Score? (Y/N): ");
        String choice = br.readLine();
        
        if(choice.equalsIgnoreCase("Y"))
        {
            File file = new File(FILE_NAME);
            if(file.exists())
            {
                file.delete();
            }
            System.out.println("\nHigh Score Reset Successfully!");
        }
        else
        {
            System.out.println("\nReset Cancelled.");
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

 }
}