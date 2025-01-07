package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class CustomExcep {
    void display() throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }
}

class Test {
    public static void main(String[] args) {
        CustomExcep rw = new CustomExcep();
        try {
            rw.display();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }

    }
}