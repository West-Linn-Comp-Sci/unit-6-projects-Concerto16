
/**
 * List of methods for arraylists, testing not shown.
 */
import java.util.ArrayList;
public class Methods
{
    
    public static void removeZeros(ArrayList<Integer> list) {
        int count = 0;
        while (count<list.size())
        {
            if (list.get(count)==0)
            {
                list.remove(count);
            }
            else
            {
                count++;
            }
        }
        
    }
    public int countLetters(ArrayList<String> list) {
        int letters=0;
        for (String word : list)
        {
            letters+=word.length();
        }
        return letters;
    }
    public int findPosition(int keyValue, ArrayList<Integer> list)
    {
        int position = -1;
        for (int count=0;count<list.size();count++)
        {
            if (list.get(count)==keyValue)
            {
                position=count;
                break;
            }
        }
        return position;
    }
    public ArrayList<String> parseIntoArrayList(String word)
    {
        ArrayList<String> list = new ArrayList<String>();
        word+=" ";
        for (int x=0;x<word.length()-1;x++)
        {
            list.add(word.substring(x, x+1));
        }
        return list;
    }
    public String findMin(ArrayList<Person> list)
    {
        int min=list.get(0).getAge();
        int index=0;
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i).getAge()<min)
            {
                min = list.get(i).getAge();
                index=i;
            }
        }
        return (list.get(index).getName());
    }
    public boolean equals(Coin aCoin)
    {
        return (this.getValue()==aCoin.getValue()&&this.getName().equals(aCoin.getName());
    }
    public double getTotal()
    {
        double total=0;
        for (Coin aCoin : this.coins)
        {
            total+=aCoin.getValue();
        }
        return total;
    }
    public int count(Coin aCoin)
    {
        int count=0;
        for (Coin bCoin : this.coins)
        {
            if (bCoin.equals(aCoin))
            {
                count++;
            }
        }
        return count;
    }
}
