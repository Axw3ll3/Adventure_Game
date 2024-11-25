package Adventure_Game.Environments;

import Adventure_Game.Main.Menu;
import Adventure_Game.Obstacles.FirePlace;
import Adventure_Game.Player.Player;

public class Forest {
    public Forest(Player player){
        System.out.println("----------------------------------------------------------------");
        player.levelUp();
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