/**
 * Created by khalid on 2/27/18.
 * This program convert numbers from arabic numbers into english numbers
 */
import java.util.Scanner;


public class testing {
    public static void main(String[] args) {

        //String str = "٢٣٢٣٤٤";


        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("This Program will convert numbers from arabic numbers into english numbers.\n");
	System.out.println("Enter some Arabic number/s to convert: ");
        String n = reader.next(); // Scans the next token of the input as an int.

        //once finished
        reader.close();

        char[] englishNumberChars = {'1','2','3','4','5','6','7','8','9'};
        StringBuilder builder = new StringBuilder();
        for(int i =0;i<n.length();i++)
        {
            if(Character.isDigit(n.charAt(i)))
            {
                builder.append(englishNumberChars[(int)(n.charAt(i))-1633]);
            }
            else
            {
                builder.append(n.charAt(i));
            }
        }
        System.out.println("\nNumber/s enterd in English: "+n);
        System.out.println("Number/s in Arabic : "+builder.toString() );
    }
}
