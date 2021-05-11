
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class tester
{
    public static void main (String [] args)
    {
        ArrayList<Integer> list3 = new ArrayList<Integer>(); 
for (int i = 1; i <= 10; i++)  
list3.add(i);   
for (int i = 0; i < list3.size(); i++)  
if (list3.get(i) == 3 || list3.get(i) == 4)   
list3.remove(i); 
System.out.println(list3);  		// output is: [1, 2, 4, 5, 6, 7, 8, 9, 10]// output is: [1, 3, 5, 7, 9]

    }

}
