package Adventure_Game.Obstacles;

import Adventure_Game.Monster.Combat;
import Adventure_Game.Monster.Spider;
import Adventure_Game.Player.Player;
import Adventure_Game.Tools.Check;
import Adventure_Game.Tools.PlayerInput;
import Adventure_Game.Tools.Slowprint;

public class FirePlace {
    private boolean isLit;
    private Slowprint slowprint;
    private Player player;
    PlayerInput playerinput = new PlayerInput();
    Check check = new Check(); 
    
    public FirePlace(Player player) {
        this.isLit = false;
        this.player = player;
        this.check=check;
        this.playerinput=playerinput;
    }

    public void arrivalAtFirePlace(){
        slowprint.slowPrintln("The traveler emerged from the dense forest as dusk crept in, weary and cold. Through the trees, you spot a stone-ringed "
         + "fireplace in a small clearing, untouched and waiting in the twilight.\nYou approach, noting the silence around it. "
         + "No firewood was stacked, no sign of another soul - only the cold stones and the faint scent of old ashes.\nKneeling down "
         + "you brushed your right hand over the stones, feeling a chill that ran deeper than the night air.\nYou hesitate, then decide to gather some kindling nearby, "
         + "preparing to bring warmth back to this quiet, abandoned place.\nYou think twice, do I want to start a fire or not? "
         + "\nWhat if I attract unwanted creatures towards me? Do you still want to lit the fireplace?", 2);
    }

    public void askToLit() {
        //Metod för att hämta valmeny
        int choice;
                //Visar meny och hämtar användarens val.
                while (true) {
                    slowprint.slowPrintln("[1] Yes");
                    slowprint.slowPrintln("[2] No");
        
                    // Kallar på metod för att se att input av användare är en integer
                   choice = check.checkYesNo(playerinput.getScanner());
        
                        switch (choice) {
                            case 1:
                                ifLit();
                                break;
        
                            case 2:
                                ifNotLit();
                                break;
                        
                        }
                        break;
                    } 
                }

    

    public void ifLit() {
        isLit = true;
        slowprint.slowPrintln("You've decided to lit the fire.", 2);
        player.reward("intelligence");
        System.out.println("");
        Spider spider = new Spider();
        Combat combat = new Combat(player);

        slowprint.slowPrintln(spider.getDescription(), 2);
        combat.combat(player.getStrength(), player.getHealth(), spider);
        firePlaceSouvenir();
    }
    public void ifNotLit() {
        isLit = false;
        slowprint.slowPrintln("You've decided to not lit the fire.", 2);
        player.takeDamage(1);
        slowprint.slowPrintln("Due to you not putting up the fire, you've gotten cold and lost a healthpoint. " + "-1 Healthpoint, you still got "+player.getHealth()+ " left" ,2);
        slowprint.slowPrintln("You've moved on without a scratch though, which let's you move on to the next part of the story", 2);

    }
    public void firePlaceSouvenir() {
        int choice;
        slowprint.slowPrintln("Do you want to take a burnt wood as a souvenir from the fireplace?", 2);
        while (true) {
            slowprint.slowPrintln("[1] Yes");
            slowprint.slowPrintln("[2] No");

            // Kallar på metod för att se att input av användare är en integer
           choice = check.checkYesNo(playerinput.getScanner());

                switch (choice) {
                    case 1:
                        System.out.println("You've decided to pick up burnt wood as a souvenir");
                        player.addItemToBackpack("Burnt wood");
                        player.showBackpackItems();
                        break;
                    case 2:
                       System.out.println("You've decided to not pick up a souvenir from the fireplace.");
                        break;
                
                }
                break;
            } 
        }

    }
    

    