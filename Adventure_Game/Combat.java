package Adventure_Game;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Combat {
    private Random random = new Random();
    private Scanner sc = new Scanner(System.in);
    private int choice;
    Slowprint slowprint = new Slowprint();
    Player player = new Player(null);

    public boolean checkSuccess(int getStrength, int getMonsterStrength){
        int strengthDifference = getStrength - getMonsterStrength;
                
        double successChance;
        if (strengthDifference == 0) {
            successChance = 50.0;
        } else if (strengthDifference == 1) {
            successChance = 66.6;
        } else if (strengthDifference == 2) {
            successChance = 83.3;
        } else if (strengthDifference == -1) {
            successChance = 33.3;
        } else if (strengthDifference == -2) {
            successChance = 16.7;
        } else if (strengthDifference > 2) {
            successChance = 100.0;
        } else {
            successChance = 0.0;
        }
        
        double randomValue = random.nextDouble() * 100;
        return randomValue < successChance;
        
    }

    public void combat(int getStrength, int getHealth, Monster monster) {

        while (player.getHealth() > 0) {
            boolean success = checkSuccess(player.getStrength(), monster.getMonsterStrength());

            if (success) {
                slowprint.slowPrintln(monster.getKilledByPlayer());
                player.reward("strength");
                break;
            } 
            else {
                slowprint.slowPrintln(monster.getHitPlayer());
                player.takeDamage(1);
                System.out.println("Your current health: " + player.getHealth());

                if (player.getHealth() <= 0) {
                    slowprint.slowPrintln(monster.getKillPlayer());
                    break;
                }

                System.out.println("Would you like to try again or run away?");
                System.out.println("Press 1 to try again, or 2 to run away:");
                
                int choice = 0;

                try {
                    choice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter 1 or 2.");
                    sc.nextLine();
                    continue;
                }

                if (choice == 2) {
                    System.out.println("You run away!");
                    break;
                } 
                else if(choice == 1) {
                    System.out.println("You try again.");
                }
                else {
                    System.out.println("Invalid choice. Please enter 1 to try again or 2 to run away.");
                }
            }
        }
    }
}