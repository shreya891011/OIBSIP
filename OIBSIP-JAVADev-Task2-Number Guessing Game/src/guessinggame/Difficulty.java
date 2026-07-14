package guessinggame;

public class Difficulty 
{

    private int maxNumber;
    private int maxAttempts;

    public Difficulty(int maxNumber, int maxAttempts) 
    {

        this.maxNumber = maxNumber;
        this.maxAttempts = maxAttempts;

    }

    public int getMaxNumber() 
    {
        return maxNumber;
    }

    public int getMaxAttempts()
    {
        return maxAttempts;
    }

}