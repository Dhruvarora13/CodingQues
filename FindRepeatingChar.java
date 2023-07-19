import java.util.*;

public class FindRepeatingChar
{
    //Function to find repeated character
    static char findRepeat(char temp[])
    {
        // Stores unique character in ArrayList
        ArrayList<Character> list = new ArrayList<>();


        for (int i=0; i<=temp.length-1; i++)
        {
            char ch = temp[i];


            // Checks for repeated character
            if (list.contains(ch))
                return ch;
                //Adds unique character to the list
            else
                list.add(ch);
        }

        //Returns False in case of no repetition
        return 'F';
    }

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        //String input
        System.out.println("Enter the String: ");
        String str = input.nextLine();

        //string to char array for processing
        char[] charr = str.toCharArray();

        //Prints in case of no repetition
        if (findRepeat(charr)=='F')
            System.out.println("NO REPETITION");

            //Prints the repeated character
        else
            System.out.println("The First Repeated Character in the String is: "+findRepeat(charr));
    }
}