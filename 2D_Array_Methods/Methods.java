
/**
 * Write a description of class methods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Methods
{
    public int minRow (int[][] arr, int i)
    {
        int min=arr[i][0];
        for (int j : arr[i])
        {
            if (min>j)
            {
                min=j;
            }
        }
        return min;
    }
    public int[] colMaxs (int[][] arr)
    {
        int[] largest = new int[arr[0].length];
        for (int x=0;x<arr[0].length;x++)
        {
            int max = arr[0][x];
            for (int i=0;i<arr.length;i++)
            {
                if (arr[i][x]>max)
                {
                    max=arr[i][x];
                }
            }
            largest[x]=max;
        }
        return largest;
    }
    public int biggestRow (int[][] arr)
    {
        int max = calcRowSum(arr, 0);
        int row = 0;
        for (int i=0;i<arr.length;i++)
        {
            if (calcRowSum(arr, i)>max)
            {
                max=calcRowSum(arr, i);
                row = i;
            }
        }
        return row;
    }
    public int calcRowSum(int[][] arr, int i)
    {
        int sum=0;
        for (int j : arr[i])
        {
            sum+=j;
        }
        return sum;
    }
    public int[] allRowSums (int[][] arr)
    {
        int[] sums = new int[arr.length];
        for (int x=0;x<arr.length;x++)
        {
            int sum=0;
            for (int j : arr[x])
            {
                sum+=j;
            }
            sums[x]=sum;
        }
        return sums;
    }
    public int smallEven (int[][] arr)
    {
        int min = -1;
        for (int x=0;x<arr.length;x++)
        {
            for (int j : arr[x])
            {
                if (j%2==0)
                {
                    if (min==-1||min>j)
                    {
                        min=j;
                    }
                }
            }
        }
        return min;
    }
    public double[] averageCol(int[][] arr)
    {
        double[] average = new double[arr[0].length];
        for (int x=0;x<arr[0].length;x++)
        {
            int sum=0;
            for (int[] row : arr)
            {
                sum+=row[x];
            }
            average[x]=(double)sum/(arr.length);
        }
        return average;
    }
}
