package Adventure_Game;
import java.util.Scanner;

public class Policestation {
    public Policestation(Player player) {
    }
    public boolean ifPolicestation(Player player){
        Scanner s = new Scanner(System.in);
        System.out.println("The nearest building is the policestation. You make a run for it. \n"
        + "Perhaps inside you can find something useful. The curtains inside are blocking the windows, \n "
        + " making the wole station seem... quiet.");
        System.out.println("Do you choose to stay at the policestation [1] or make a run for the next building [2]? ");
        int choicePorH = s.nextInt();
        while (choicePorH != 1 && choicePorH != 2){ 
            System.out.println("You have to enter a valid choice! Try again: ");
            choicePorH = s.nextInt();
            s.close();
         }
        switch(choicePorH){
        case 1:
        Puzzle puzzle = new Puzzle();
        puzzle.arrivalAtPuzzle();
        return true;
        
        case 2:
        return false;
        
    }
    return false;
    }  
}
