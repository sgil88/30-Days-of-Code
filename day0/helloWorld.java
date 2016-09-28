
import java.util.Scanner;

public class helloWorld {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();

        System.out.println("Hello World.");

        if (inputString != null) {
            System.out.println(inputString);

        }
    }

}
