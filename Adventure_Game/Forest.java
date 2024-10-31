package Adventure_Game;
import java.util.Scanner;

public class Forest {
    public Forest(){
        
        FirePlace fireplace = new FirePlace();
        fireplace.arrivalAtFirePlace(); //Skriv ut berättelse
        fireplace.askToLit();
        Cave cave = new Cave();
    
        if(cave.enteringCave()){
        Menu menu = new Menu();
        menu.gameOver();
        }

        

    }






}