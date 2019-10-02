import java.util.Scanner;

public class MrOrMs {
    public static void main(String[] args)
    {
        //ask the user for the last name and store the result
        System.out.printf("Enter your last name: ");
        Scanner keyboard = new Scanner(System.in);
        String lastName = keyboard.nextLine();

        //ask the user if they are male or female and store the result
        System.out.printf("Enter if your are male or female: ");
        String gender = keyboard.nextLine();

        //display the title (Mr or Ms) to the screen with the last name
        System.out.printf("Hi %s %s", getTitle(gender), lastName);
    }

    /**
     * Create a method that returns "Mr." or "Ms." depending if the person
     * is male or female
     */
    public static String getTitle(String maleOrFemale)
    {
        //return "Mr." if the variable maleOrFemale is equal to "male"
        if (maleOrFemale.equalsIgnoreCase("male"))
            return "Mr.";

        //return "Ms." if the variable maleOrFemale is equal to "female"
        else if (maleOrFemale.equalsIgnoreCase("female"))
            return "Ms.";

        //return "" if it is neither male or female
        else
            return "";
    }
}
