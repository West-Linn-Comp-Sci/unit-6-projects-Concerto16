import java.util.Scanner;
public class Chart
{

    
    public static void main(String [] args)
    {
        int [] frequency= new int[10];
        Scanner scanner = new Scanner(System.in);
        int stop=1;
        int input;
        while (stop==1)
        {
            System.out.println("Enter a number between 1 and 100");
            input=scanner.nextInt();
            if (input>0&&input<101)
            {
                frequency[((input-1)-((input-1)%10))/10]++;
            }
            System.out.println("To stop, enter 0");
            System.out.println("Otherwise, enter 1");
            stop=scanner.nextInt();
        }
        for (int x=0; x<10; x++)
        {
            System.out.print(x+"1 - "+(x+1)+"0| ");
            for (int j=0; j<frequency[x];j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
