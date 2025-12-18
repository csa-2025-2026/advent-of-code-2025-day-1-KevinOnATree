import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("grades.txt");  // this is your problem input as a File object
        Scanner sc = new Scanner(file);   // the Scanner object is now reading from the file object
        // Write code that reads from the grades.txt file and calculates the average grade
        int sum = 0;
        int amount = 0;
        while (sc.hasNext())  // as long as the Scanner has more lines to read from the file..
        {
            int grade = sc.nextInt();
            sum += grade;
            amount++;
        }
            sum /= amount;
        System.out.println(sum);

        sc.close();
    }
}
