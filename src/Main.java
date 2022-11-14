import java.util.Scanner;

/**
 * class satoaki's main
 */
public class Main {
    public static void main(String[] args){
        System.out.print("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if (userInput % 2 != 0){
            System.out.println("The number is odd.");
        } else if (userInput % 2 == 0){
            System.out.println("The number is even.");
        }
    }
}
