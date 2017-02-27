import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 1/28/2016
 */
public class number_guesser {

    public static void main(String[] args){

        System.out.println("This program will generate a number, \nthen you can guess what it is");
        System.out.println("Press Enter to begin...");
        Scanner wait_scan = new Scanner(System.in);
        wait_scan.nextLine();
        String all_sting = game_runner();
        System.out.println(all_sting);
        // Send to gen number
        // Send to user input
        // Send to check
        // if check returns == :
        //   print 'correct! try again?'
        // else if check is > or < :
        //   print ' too high' or 'too low'

    }

    public static String game_runner() {

        int comp_num = number_gen();
        System.out.println("going\nEnter a number");
        String win = "0";
        while (win == "0") {
            Scanner user_in = new Scanner(System.in);
            int user_num = user_in.nextInt();
            String condition = "nil";
            if (user_num == comp_num) {
                condition = "win";
                break;
            } else if (user_num > comp_num) {
                condition = "high";
            } else if (user_num < comp_num) {
                condition = "low";
            } else {
                System.out.println("Error: game_runner win condition");
            }
            System.out.println(condition);

        }

        //
    return "done";
    }

 /**
        Scanner again = new Scanner(System.in);
        System.out.println("Again?\n1. Yes\n2. No");
        String again_val = again.nextLine();
        if(again_val == "1"){
            String ret = "yes";
        }
        else if(again_val == "2"){
            String ret = "no";
        }
        else{
            System.out.println("Input error");
        }

        return ret;
*/


    public static int number_gen() {

        Random rand = new Random();
        int n = rand.nextInt(50) + 1;
        return n;

    }

    //public static void get_input() {

        // guess a number between 0 and 100
        // scanner
        // user-proof scanned number
        // return it

    //}

}
