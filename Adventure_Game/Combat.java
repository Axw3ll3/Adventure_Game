package Adventure_Game;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Combat {
    private Random random = new Random();
    private Scanner sc = new Scanner(System.in);
    private int choice;
    Slowprint slowprint = new Slowprint();
    private Player player;
    private Menu menu;

    public Combat (Player player) {
        this.player = player;
        this.menu = menu;
    }

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
            successChance = 0;
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

    private int actionChoice(String choiceMessage) {
        System.out.println(choiceMessage);

        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter 1 or 2.");
            sc.nextLine();
        }
        return choice;
    }

    public void combat(int getStrength, int getHealth, Monster monster) {
        
        actionChoice("Would you like to fight, or try to run away?");

        switch (choice) {
            case 2:
                System.out.println("You run away!");
                player.reward("speed");
                break;
            case 1:
                while (player.getHealth() > 0) {
                    boolean success = checkSuccess(getStrength, monster.getMonsterStrength());
                    if (success) {
                        slowprint.slowPrintln(monster.getKilledByPlayer(), 3);
                        player.reward("strength");
                        break;
                    } else {
                        if (player.getHealth() < 2) {
                            slowprint.slowPrintln(monster.getKillPlayer(), 3);
                            menu.gameOver();
                        }
                        slowprint.slowPrintln(monster.getHitPlayer(), 3);
                        player.takeDamage(1);

                        System.out.println("Your current health: " + player.getHealth());

                        actionChoice("Would you like to try again, or run away?");
                        
                        switch (choice) {
                            case 2:
                                System.out.println("You run away!");
                                player.reward("speed");
                                break;
                            case 1:
                                System.out.println("You try again.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter 1 to try again or 2 to run away.");
                                break;
                        }
                    }
                }   break;
            default:
                System.out.println("Invalid choice. Please enter 1 to try again or 2 to run away.");
                break;
        }
    }
}