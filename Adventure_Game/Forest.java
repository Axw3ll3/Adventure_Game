package Adventure_Game;
import java.util.Scanner;

public class Forest {
    public Forest(){
        
        FirePlace fireplace = new FirePlace();
        fireplace.arrivalAtFirePlace(); //Skriv ut berättelse
        fireplace.askToLit();

        

    }




    /*   public void fire() {
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
*/


}