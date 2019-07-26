
package javafinalassignment;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFinalAssignment {

    public static int choice;
    public static int choice2;
    public static int choice3;
    public static String stringMessage;
    public static String stringMessage2;
    public static String stringMessage3;
                     
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the world's greatest choose your own adventure in the history of history.\n"
                + "To choose option 1 type '1' and to choose option 2, you guessed it, type '2'.");
        
        System.out.println("Our story begins with a magical elf named Jeff. You ARE JEFF! Your first choice is coming up...\n"
                + "Option one: live out this story as the incredible Jeff.\n"
                + "Option two: kill yourself and pray that you are reborn as a new and hopefully improved character.");
        choice = keyboard.nextInt();
        
        switch (choice) {
            case 1:  
                stringMessage = "you ARE JEFF";
        System.out.println("you have chosen the option: " + stringMessage);
                    break;
                     
            case 2:  
                stringMessage = "attempted rebirth";
        System.out.println("you have chosen the option: " + stringMessage);
                    break;
}
            if(choice==1) {
                System.out.println("One day, you were walking along minding your own business when SUDDENLY, out of nowhere, an orc jumps in front of your path. GAaAaAaAaAaAaAaA!!!\n"
                        + "Option one: TRY to kill it.\n"
                        + "Option two: ask whats up.");
                choice2 = keyboard.nextInt();
                
                switch (choice2) {
            case 1:  
                stringMessage2 = "Orc murder attempt.";
        System.out.println("you have chosen the option: " + stringMessage);
                    break;
                     
            case 2:  
                stringMessage2 = "'sa duuuuuude.";
        System.out.println("you have chosen the option: " + stringMessage);
                    break;
}
                if(choice2==1) {
                    System.out.println("The orc lunges towards you and you reach for the sword that you thought you had.\n"
                            + "Realizing that you don't have a sword you begin to question your motives for deciding to engage in battle with the orc. You finally decide that he attacked you first and you opt to either...\n"
                            + "Option one: kill it with fire magic.\n"
                            + "Option two: kill it with water magic.");
                    choice3 = keyboard.nextInt();
                    
                    switch (choice3) {
                case 1:  
                    stringMessage3 = "FIREBALL!!!";
            System.out.println("you have chosen the option: " + stringMessage);
                        break;
                     
                case 2:  
                    stringMessage3 = "Just add water.";
            System.out.println("you have chosen the option: " + stringMessage);
                        break;
}
                    if(choice3==1) {
                        System.out.println("Congratulations, your not an idiot. You managed to kill the evil orc and save the day. You live out the rest of you days as a hero with stories written about your heroic deeds and more money than you could spend in 100 lifetimes."
                        + "THE END.\n"
                        + "If you wish to try for a different outcome, simply restart the program. Thank you for playing!");
}
                    if(choice3==2) {
                        System.out.println("You bury deep into the core of you power summoning as much magic as you possibly can. In a guttural scream you let out all of your energy and manage to splash the orc. It does next to nothing and in precisely 3.25832956325923592768 seconds you find yourself dead on the flood."
                        + "THE END.\n"
                        + "If you wish to try for a different  outcome, simply restart the program. Thank you for playing!");
}
}
                if(choice2==2) {
                    System.out.println("WHATSUUUUUP DUUUUUUDE!!! You yell at the orc, but, because you where buisy shouting at the orc, you failed to notice how close he had gotten to you and are too slow to react as he rips your head off. \n"                      
                    + "THE END.\n"
                    + "If you wish to try for a different outcome, simply restart the program. Thank you for playing!");
}
}
            if(choice==2) {
                System.out.println("You wake up to find yourself a potato, your primary thaught beeing WHAT THE FU- when SUDENLY, out of nowhere, an orc jumps out onto the path that you have been sitting on, squashing you in an instant.\n"
                        + "THE END.\n"
                        + "If you wish to try for a different outcome, simply restart the program. Thank you for playing!");
}
            
                try (FileWriter myWriter = new FileWriter("JavaFinalAssignment.txt")) {
                                myWriter.write(choice + ": The first choice you get to make \n" + choice2 + ": The second choice you get to make \n" + choice3 + ": The third choice you get to make \n" + stringMessage + ": The first message confirming your choice \n" + stringMessage2 + ": The second message confirming you choice /n" + stringMessage3 + ": The third message confirming you choice \n");
                }          catch (IOException e) {
                      System.out.println("An error occurred.");
                }
}
}
