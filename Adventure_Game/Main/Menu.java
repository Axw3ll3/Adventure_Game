package Adventure_Game.Main;
import Adventure_Game.Environments.City;
import Adventure_Game.Environments.Forest;
import Adventure_Game.Environments.Hospital;
import Adventure_Game.Environments.Mall;
import Adventure_Game.Player.Player;
import Adventure_Game.Tools.Check;
import Adventure_Game.Tools.PlayerInput;
import Adventure_Game.Tools.Slowprint;
import java.util.Scanner;
public class Menu {
private Player player;
PlayerInput playerinput = new PlayerInput();
Check check = new Check();

public Menu(Player player){
    this.player = player;

}
public void startSkills(){
    Slowprint.slowPrintln("Your current skills are: "); 
    Slowprint.slowPrintln("Health: " + player.getHealth());
    Slowprint.slowPrintln("Strength: " + player.getStrength());
    Slowprint.slowPrintln("Speed: " + player.getSpeed());
    Slowprint.slowPrintln("Intelligence: " + player.getIntelligence());
}

public boolean checkCityOrForest(){
    Scanner s = new Scanner(System.in);
    int choiceCityOrForest = check.checkInput(playerinput.getScanner(), 1, 2);
    switch(choiceCityOrForest){
        case 1:
        City ci = new City(player);
        System.out.println();
        return true;

        case 2:
        Forest f = new Forest(player);
        City cit = new City(player);
        System.out.println();
        return false;
        }
    return false;
}

public boolean checkMallOrHospital(){
    int choiceMallOrHospital = check.checkInput(playerinput.getScanner(), 1, 2);
    switch(choiceMallOrHospital){
        case 1:
        Mall m = new Mall(player);
        System.out.println();
        return true;

        case 2:
        Hospital h = new Hospital(player);
        System.out.println();
        return false;
        }
    return false;
}

public void gameOver(){
    Slowprint.slowPrintln("-------------Results: -------------");
    Slowprint.slowPrintln("Health: " +player.getHealth());
    Slowprint.slowPrintln("Strength: "+player.getStrength());
    Slowprint.slowPrintln("Speed: "+ player.getSpeed());
    Slowprint.slowPrintln("Intelligence: "+ player.getIntelligence());
    player.showBackpackItems();
    System.exit(0);
}
//-----------------------------------------------MAIN --------------------------------------------------    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Player player = new Player("Default name", 17 ,3, 3 , 0, 0, 0);
        Menu menu = new Menu(player);
        Story story = new Story(player);
        story.start();
        player.setName(s);
        player.setAge(s);
        menu.startSkills();
        Slowprint.slowPrintln("Press Enter to begin...");
        s.nextLine(); //Väntar tills user trycker på enter
        System.out.println("");
        story.prologue();
        menu.checkCityOrForest();
        story.prologueContinue();
        menu.checkMallOrHospital();
        Slowprint.slowPrintln("As you finally open the last door, you can barely believe your eyes. A helicopter! As you run\n" + 
      "for it and start the, thankfully still working, engine, you look down towards the city you are\n" + 
      "about to leave behind, and you feel a great relief inside. You made it!");
        System.out.println("");
        menu.gameOver();

s.close();
    }
}

