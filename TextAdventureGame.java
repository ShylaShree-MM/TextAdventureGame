import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself standing in front of a mysterious castle.");
        System.out.println("Do you want to 'enter' the castle or 'explore' the surroundings?");

        String firstChoice = scanner.nextLine().toLowerCase();

        if (firstChoice.equals("enter")) {
            exploreCastle();
        } else if (firstChoice.equals("explore")) {
            exploreSurroundings();
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }

    public static void exploreCastle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You enter the castle and find two doors, one on the 'left' and one on the 'right'.");
        String secondChoice = scanner.nextLine().toLowerCase();

        if (secondChoice.equals("left")) {
            System.out.println("You enter a dark room with a chest in the middle.");
            System.out.println("Do you want to 'open' the chest or 'leave' it?");
            String thirdChoice = scanner.nextLine().toLowerCase();
            if (thirdChoice.equals("open")) {
                System.out.println("Congratulations! You found a key and unlocked the hidden door.");
                System.out.println("You step through the door and find a treasure room. You win!");
            } else if (thirdChoice.equals("leave")) {
                System.out.println("You leave the room and wander deeper into the castle. Eventually, you get lost. Game over!");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } else if (secondChoice.equals("right")) {
            System.out.println("You enter a room filled with mirrors. One mirror seems different.");
            System.out.println("Do you want to 'inspect' the different mirror or 'ignore' it?");
            String thirdChoice = scanner.nextLine().toLowerCase();
            if (thirdChoice.equals("inspect")) {
                System.out.println("You find a secret passage behind the mirror. You step through and find a treasure room. You win!");
            } else if (thirdChoice.equals("ignore")) {
                System.out.println("You continue exploring the castle but find nothing of interest. You eventually get lost. Game over!");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }

    public static void exploreSurroundings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You decide to explore the surroundings and find a forest and a river.");
        System.out.println("Do you want to 'enter' the forest or 'follow' the river?");
        String secondChoice = scanner.nextLine().toLowerCase();

        if (secondChoice.equals("enter")) {
            System.out.println("You enter the forest and encounter a bear.");
            System.out.println("Do you want to 'fight' the bear or 'run' away?");
            String thirdChoice = scanner.nextLine().toLowerCase();
            if (thirdChoice.equals("fight")) {
                System.out.println("You bravely fight the bear and manage to scare it away. You find a hidden treasure in the forest. You win!");
            } else if (thirdChoice.equals("run")) {
                System.out.println("You run away from the bear but get lost in the forest. Game over!");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } else if (secondChoice.equals("follow")) {
            System.out.println("You follow the river and find a boat.");
            System.out.println("Do you want to 'take' the boat or 'continue' following the river?");
            String thirdChoice = scanner.nextLine().toLowerCase();
            if (thirdChoice.equals("take")) {
                System.out.println("You take the boat and find a waterfall. You manage to navigate safely and find a hidden treasure. You win!");
            } else if (thirdChoice.equals("continue")) {
                System.out.println("You continue following the river but get caught in a strong current. Game over!");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } else {
            System.out.println("Invalid input. Please try again.");
        }
    }
}
