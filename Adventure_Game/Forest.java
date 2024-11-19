package Adventure_Game;

public class Forest {
    public Forest(Player player, Backpack backpack){
        System.out.println("----------------------------------------------------------------");
        FirePlace fireplace = new FirePlace(player, backpack);
            fireplace.arrivalAtFirePlace(); 
            fireplace.askToLit();
        Cave cave = new Cave(player);
            if(cave.enteringCave()){
            Menu menu = new Menu(player, backpack);
            menu.gameOver();
        }

        

    }






}