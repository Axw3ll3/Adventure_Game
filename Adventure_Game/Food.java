package Adventure_Game;
import java.util.Random;
import java.util.Scanner;

public class Food {
    //Glöm inte ta bort Slowprint och scanner
    Random r = new Random();
    int random = r.nextInt(2);
    Slowprint slowprint = new Slowprint();
    Scanner scanner = new Scanner(System.in);
    Spider spider = new Spider();
    private Player player;


    public Food() {
        this.player=player;
    }

    public void findingTheFood() {
    slowprint.slowPrintln("\nIn the silent, dusty policestation, you finally solve the puzzle. With a soft click, a small hidden compartment opens up beneath your feet. \nInside were a few cans of beans. \nDo you want to eat the beans?");
    choiceOfEating();
}

    //Menymetod
    public void choiceOfEating(){
        int choice;
                //Visar meny och hämtar användarens val.
                while (true) {
                    System.out.println("[1] Yes");
                    System.out.println("[2] No");
        
                    // Kallar på metod för att se att input av användare är en integer
                   choice = checkChoice(scanner);
        
                        switch (choice) {
                            case 1:
                                eatingTheFood();
                                break;
        
                            case 2:
                                notEatingTheFood();
                                break;
                        
                        }
                       break; 
                    } 
                    
                }
    
    

    public void eatingTheFood() {
        int random = r.nextInt(2);
        if (random == 0) {
            player.takeDamage(1);
            slowprint.slowPrintln("The beans you found are old and made you get food poisoning, and this makes you lose -1 Healthpoint. You still got " +player.getHealth()+ " left.");
            //Metod check för om spelaren dör
        }
        else if (random == 1) {
            slowprint.slowPrintln("You've found yourself some fresh beans, which makes your strenght go up by 1 due to you getting much needed energy.");
            player.reward("strenght");
        }
    }

    public void notEatingTheFood() {
        player.reward("intelligence");
        slowprint.slowPrintln("Smart choice to not eat food in an abandoned policestation, this makes you gain +1 in intelligence.");
        
    }

    public int checkChoice (Scanner scanner){
        //Check av input så det är ett positivt nummer över 0
            int number;
            boolean firstrun = true;
            do {
    
                if(!firstrun) {System.out.println("Write a numberical option (1 or 2)!");}
                while (!scanner.hasNextInt()) {
                    
                    System.out.println("Write a number!");
                    
                    scanner.next(); 
                    
                }
                
                firstrun = false;
                number = scanner.nextInt();
            
            } while (number < 1 || number > 2);
            return number;
            
        }
}
