
/**
 * Write a description of class PlayBattleship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PlayBattleship
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Square [] grid = new Square[7];
        for (int i=0;i<7;i++)
        {
            grid[i]=new Square();
        }
        int guess;
        int totalGuesses=0;
        int shipsPresent = 1;
        int kills = 0;
        int [] battleships = new int[1];
        int randomNum = (int) (Math.random()*5)+1;
        int [] horizontals = {-1, 0, 1};
        for (int x : horizontals)
        {
            grid[randomNum+x].battleship = 1;
        }
        while (kills<shipsPresent)
        {
            System.out.println("What is your guess? (number 1 through 7)");
            guess = scanner.nextInt();
            if (guess>0&&guess<=7)
            {
                //System.out.println("In Range");
                if (grid[guess-1].hit)
                {
                    System.out.println("Already Hit");
                }
                else 
                {
                    if (grid[guess-1].battleship!=0)
                    {
                        System.out.println("Hit!");
                        grid[guess-1].hit=true;
                        battleships[grid[guess-1].battleship-1]++;
                        if (battleships[grid[guess-1].battleship-1]==3)
                        {
                            System.out.println("Kill!");
                            kills++;
                        }
                    }
                    else
                    {
                        System.out.println("Miss :(");
                    }
                }
                totalGuesses++;
            }
            else
            {
                System.out.println("Please enter a number within the range");
            }
        }
        System.out.println("Total Guesses: "+totalGuesses);
        System.out.println("Original Configuration:");
        for (int i=0;i<7;i++)
        {
            System.out.print(grid[i].battleship+" ");
        }
    }
}
