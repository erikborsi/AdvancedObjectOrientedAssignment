package assignmentForAOOP_MISC;

import java.util.Scanner;

/**
 *
 * @author Erik Borsi
 */
public class GameMenu {

    boolean exit = false;

    public static void main(String[] args) {
        GameMenu menu = new GameMenu();
        menu.startMenu();

    }

    private void printHeader() {
        System.out.println("---------------------------");
        System.out.println("         Game Menu         ");
        System.out.println("---------------------------");
    }

    private void printMenu() {
        System.out.println("\nSelect from options:");
        System.out.println("1. Start the game");
        System.out.println("2. How to play");
        System.out.println("3. Exit");
    }

    public void startMenu() {
        printHeader();
        while (!exit) {
            printMenu();
            int option = getMenuOption();
            menuOptions(option);
        }
    }

    private int getMenuOption() {
        Scanner menuChoice = new Scanner(System.in);
        int option = 0;
        while (option < 1 || option > 3) {
            try {
                System.out.println("Enter Your choice: ");
                option = Integer.parseInt(menuChoice.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid option choice. Try again!");
            }
        }
        return option;
    }

    private void menuOptions(int option) {
        switch (option) {
            case 1:
                runGame();
                break;
            case 2:
                runReadMe();
                break;
            case 3:
                exit = true;
                System.out.println("Exited the game.");
                break;
            default:
                System.out.println("ERROR");

        }
    }

    private void runGame() {
        System.out.println("The game runs");
//        Scanner 
    }

    private void runReadMe() {
        System.out.println("The How To Play runs");
    }
}
