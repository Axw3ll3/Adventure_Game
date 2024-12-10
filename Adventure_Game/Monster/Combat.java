package Adventure_Game.Monster;
import Adventure_Game.Main.Menu;
import Adventure_Game.Player.Player;
import Adventure_Game.Tools.Check;
import Adventure_Game.Tools.PlayerInput;
import Adventure_Game.Tools.Slowprint;
import java.util.Random;


public class Combat {
    private Random random = new Random();
    private int choice;
    Slowprint slowprint = new Slowprint();
    private Player player;
    Check check = new Check();
    PlayerInput playerinput = new PlayerInput();
    private Menu menu;
    

    public Combat (Player player) {
        this.player = player;
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
            successChance = 40;
        } else if (strengthDifference == -2) {
            successChance = 25;
        } else if (strengthDifference > 2) {
            successChance = 100.0;
        } else {
            successChance = 0.0;
        }
        
        double randomValue = random.nextDouble() * 100;
        return randomValue < successChance;
        
    }


    public void combat(int getStrength, int getHealth, Monster monster) {
        Menu menu = new Menu(player);
        System.out.println("Would you like to fight or run away?");
        System.out.println("Press 1 to fight, or press 2 to try and run away");

        boolean canEscape = monster.isEscapable();

        while (player.getHealth() > 0) {
    
            choice = check.checkInput(playerinput.getScanner(), 1, 2);
    
            if (choice == 2 && canEscape) {
                System.out.println("You run away!");
                player.reward("speed");
                break;
            } else if (choice == 2 && !canEscape) {
                System.out.println("You can't run away! You must fight.");
                choice = check.checkInput(playerinput.getScanner(), 1, 2); 
            }
    
            switch (choice) {
                case 1:
                    boolean success = checkSuccess(getStrength, monster.getMonsterStrength());
                    if (success) {
                        slowprint.slowPrintln(monster.getKilledByPlayer());
                        player.reward("strength");
                        System.out.println("");
                        return;
                    } else {
                        if (player.getHealth() < 2) {
                            slowprint.slowPrintln(monster.getKillPlayer());
                            System.out.println("");
                            player.setHealth();
                            menu.gameOver();
                            return;
                        }
                        slowprint.slowPrintln(monster.getHitPlayer());
                        player.takeDamage(1);
                        System.out.println("Your current health: " + player.getHealth());
                        System.out.println("");
                        System.out.println("Would you like to try again or try to run away?");
                        System.out.println("Press 1 to fight, or press 2 to try and run away");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 to fight.");
                    break;
            }
        }
    }
}