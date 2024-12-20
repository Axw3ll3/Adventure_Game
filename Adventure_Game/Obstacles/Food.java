package Adventure_Game.Obstacles;
import Adventure_Game.Main.Menu;
import Adventure_Game.Player.Player;
import Adventure_Game.Tools.Check;
import Adventure_Game.Tools.PlayerInput;
import Adventure_Game.Tools.Slowprint;
import java.util.Random;

public class Food {
    Random r = new Random();
    int random = r.nextInt(2);
    private Player player;
    private Slowprint slowprint;
    Menu menu = new Menu (player);
    PlayerInput playerinput = new PlayerInput();
    Check check = new Check();


    public Food(Player player) {
        this.player=player;
        this.playerinput=playerinput;
        this.check=check;
        this.menu=menu;
    }

    public void findingTheFood(Player player) {
    slowprint.slowPrintln("\n" + 
                "In the silent, dusty police station, you finally solve the puzzle. With a soft\n" + 
                "click, a small hidden compartment opens up beneath your feet. Inside were a\n" + 
                "few cans of beans. Do you want to eat the beans?");
}

    //Menymetod
    public void choiceOfEating(Player player){
        int choice;
                //Visar meny och hämtar användarens val.
                while (true) {
                    System.out.println("[1] Yes");
                    System.out.println("[2] No");
        
                    // Kallar på metod för att se att input av användare är en integer
                   choice = check.checkInput(playerinput.getScanner(), 1, 2);
        
                        switch (choice) {
                            case 1:
                                eatingTheFood(player);
                                break;
        
                            case 2:
                                notEatingTheFood(player);
                                break;
                        
                        }
                       break; 
                    } 
                    
                }
    
    

    public void eatingTheFood(Player player) {
        int random = r.nextInt(2);
        if (random == 0) {
            player.takeDamage(1);
            slowprint.slowPrintln("The beans you found are old and made you get food poisoning, and \n " +
            "this makes you lose -1 Healthpoint. You got " +player.getHealth()+ " left.");
            if (player.getHealth() == 0) {
                menu.gameOver();
            }
            else {
                foodSouvenir(player);
            }
        }
        else if (random == 1) {
            slowprint.slowPrintln("You've found yourself some fresh beans, which makes your strength go \n" +
            "up by 1 due to you getting much needed energy.");
            player.reward("strength");
            foodSouvenir(player);
        }
    }

    public void notEatingTheFood(Player player) {
        player.reward("intelligence");
        slowprint.slowPrintln("Smart choice to not eat food in an abandoned policestation, this makes you \n" +
        "gain +1 in intelligence.");
        
    }

    public void foodSouvenir(Player player) {
        int choice;
        slowprint.slowPrintln("Do you want to keep the can as a souvenir from the policestation?");
        while (true) {
            slowprint.slowPrintln("[1] Yes");
            slowprint.slowPrintln("[2] No");

            // Kallar på metod för att se att input av användare är en integer
           choice = check.checkInput(playerinput.getScanner(), 1, 2);
                switch (choice) {
                    case 1:
                        System.out.println("You've decided to keep the empty can as a souvenir");
                        player.addItemToBackpack("Empty can");
                        player.showBackpackItems();
                        break;
                    case 2:
                       System.out.println("You've decided to not pick up a souvenir from the policestation.");
                        break;
                
                }
                break;
            } 
        }

}
