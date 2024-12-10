package Adventure_Game.Tools;
import Adventure_Game.Player.Player;
import java.util.Scanner;


    public class Check {
        private Player player;
        PlayerInput playerinput = new PlayerInput();
    
        public int checkInput(Scanner sc, int min, int max) {
            int number = -1;
            boolean valid = false;
    
            try {
                boolean firstrun = true;
                do {
                    if (!firstrun) {
                        System.out.println("Write a numerical option (" + min + "-" + max + ")!");
                    }
                    while (!sc.hasNextInt()) {
                        System.out.println("Write a valid number!");
                        sc.next(); // Konsumera ogiltig inmatning
                    }
                    firstrun = false;
                    number = sc.nextInt();
                    if (number >= min && number <= max) {
                        valid = true;
                    } else {
                        System.out.println("The number must be between " + min + " and " + max + "!");
                    }
                } while (!valid);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
            return number;
        }
    } 
    