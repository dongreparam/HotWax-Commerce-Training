package ExceptionHandling;
import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
    YoungerAgeException(String msg)
    {
        super(msg);
    }
}
public class Voting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you Age:" );
        int age = scan.nextInt();
        try {
            if (age < 18)
            {
                throw new YoungerAgeException("You are not eligible to vote");
            }
            else
            {
                System.out.println("You can Vote");
            }
        }
        catch (YoungerAgeException e)
        {
            System.out.println(e);
        }
        System.out.println("Hello, The code Flows Better");
    }
}
