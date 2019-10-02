import java.util.Scanner;

public class CountingLetters {
    public static void main(String[] args){
        //prompt the user for their fav sport
        System.out.printf("Enter your favourite sport: ");

        //store the user response in a variable
        Scanner keyboard = new Scanner(System.in);
        String favSport = keyboard.nextLine();

        //display the # of characters in the user response
        System.out.printf("Your fav sport is %s that is %d characters",
                                favSport, favSport.length());
    }
}
