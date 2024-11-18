package Adventure_Game;
import java.util.Scanner;

public class Check {
    private Player player;
    PlayerInput playerinput = new PlayerInput();

public int checkYesNo (Scanner sc){
    //Check av input så det är ett positivt nummer över 0 och mellan 1-2
        int number;
        boolean firstrun = true;
        do {

            if(!firstrun) {System.out.println("Write a numberical option (1 or 2)!");}
            while (!sc.hasNextInt()) {
                
                System.out.println("Write a number!");
                
                sc.next(); 
                
            }
            
            firstrun = false;
            number = sc.nextInt();
        
        } while (number < 1 || number > 2);
        return number;
        
    }

    public int checkChoices (Scanner sc){
        //Check av input så det är ett positivt nummer över 0 och mellan 1-4
            int number;
            boolean firstrun = true;
            do {
    
                if(!firstrun) {System.out.println("Write a numberical option (1-4)!");}
                while (!sc.hasNextInt()) {
                    
                    System.out.println("Write a number!");
                    
                    sc.next(); 
                    
                }
                
                firstrun = false;
                number = sc.nextInt();
            
            } while (number < 1 || number > 4);
            return number;
            
        }
    }