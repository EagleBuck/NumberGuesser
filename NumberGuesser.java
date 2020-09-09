import java.util.Random;
import java.util.Scanner;

//2020-9-8

public class NumberGuesser
{
    public static void main(String[] args) {
        System.out.println("This program will generate a number between 0 and 10, \nthen you can guess what it is");
        System.out.println("Press Enter to begin...");
        //min = 0;
        //max = 10;
        double d = 10;
        double number = Math.random()*(d);   
        int realNumber = (int)number;
        System.out.println(realNumber);
        int userGuess;
        while(true){
            Scanner userInput = new Scanner(System.in);
            userGuess = userInput.nextInt();
            if(realNumber == userGuess){
                System.out.println("YOU ARE A GENIUS AND HAVE WON!");
                break;
            }
            else if (userGuess > realNumber){
                System.out.println("Too high!");
            }
            else if (userGuess < realNumber){
                System.out.println("Too low.");
            }
        }
    }
}
