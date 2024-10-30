package AdventureGame;
import java.util.Scanner;

public class Forest extends Environment {
    public Forest(){
        this.description = "" ; //Axels beskrivning
    }

        public void fire() {
        System.out.println(" Do you choose to make a fire [1] or not make a fire[2]?");  
        Scanner s = new Scanner(System.in);
        int choiceFire = s.nextInt();
        while (choiceFire != 1 && choiceFire != 2){
            System.out.println("Enter a valid choice! ");
            choiceFire = s.nextInt();
        }
        switch (choiceFire){
            case 1:
            break;
            case 2:
            break;
        }

    

    
}
}