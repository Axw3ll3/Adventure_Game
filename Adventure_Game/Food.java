package Adventure_Game;
import java.util.Random;

public class Food {
    //Glöm inte ta bort Slowprint
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
    slowprint.slowPrintln("\nIn the silent, dusty policestation, you finally solve the puzzle. With a soft click, a small hidden compartment opens up beneath your feet. \nInside were a few cans of beans. \nDo you want to eat the beans?", 2);
}

    //Menymetod
    public void choiceOfEating(Player player){
        int choice;
                //Visar meny och hämtar användarens val.
                while (true) {
                    System.out.println("[1] Yes");
                    System.out.println("[2] No");
        
                    // Kallar på metod för att se att input av användare är en integer
                   choice = check.checkYesNo(playerinput.getScanner());
        
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
            slowprint.slowPrintln("The beans you found are old and made you get food poisoning, and this makes you lose -1 Healthpoint. You got " +player.getHealth()+ " left.",2 );
            if (player.getHealth() == 0) {
                menu.gameOver();
            }
            else {
                foodSouvenir(player);
            }
        }
        else if (random == 1) {
            slowprint.slowPrintln("You've found yourself some fresh beans, which makes your strength go up by 1 due to you getting much needed energy.", 2);
            player.reward("strength");
            foodSouvenir(player);
        }
    }

    public void notEatingTheFood(Player player) {
        player.reward("intelligence");
        slowprint.slowPrintln("Smart choice to not eat food in an abandoned policestation, this makes you gain +1 in intelligence.");
        
    }

    public void foodSouvenir(Player player) {
        int choice;
        slowprint.slowPrintln("Do you want to keep the can as a souvenir from the policestation?");
        while (true) {
            slowprint.slowPrintln("[1] Yes");
            slowprint.slowPrintln("[2] No");

            // Kallar på metod för att se att input av användare är en integer
           choice = check.checkYesNo(playerinput.getScanner());

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
