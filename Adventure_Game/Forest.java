package Adventure_Game;
import java.util.Scanner;

public class Forest {
    public Forest(Player player){
        System.out.println("----------------------------------------------------------------");
        FirePlace fireplace = new FirePlace(player);
            fireplace.arrivalAtFirePlace(); 
            fireplace.askToLit();
        Cave cave = new Cave(player);
            if(cave.enteringCave()){
            Menu menu = new Menu(player);
            menu.gameOver();
        }

        

    }






}