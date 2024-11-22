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
public void start(){
    System.out.println("WELCOME TO THE ADVENTUREGAME BY VELVETVIBE");
    System.out.println("------------------------------------------");
    System.out.println("First we are going to start by creating your character");
}

public void startSkills(){
    Slowprint.slowPrintln("Your current skills are: ",2); 
    Slowprint.slowPrintln("Health: " + player.getHealth(),2);
    Slowprint.slowPrintln("Strength: " + player.getStrength(),2 );
    Slowprint.slowPrintln("Speed: " + player.getSpeed(),2);
    Slowprint.slowPrintln("Intelligence: " + player.getIntelligence(),2);
}

public void prologue(){
    Slowprint.slowPrintln(player.getName()+" wake up in the middle of a road. You have no memory of how you got here. You are all alone.\n" +
"At your left, you spot the buildings of what seems to have once been a small city full of life, with\n" +
"a police station, a hospital, and a mall, now completely abandoned. Most of what's left of the\n" +
"windows are now just holes, with broken glass on the street. It's as if someone has been in such a\n" +
"rush, they've just jumped right out of the window. The cars are parked in the middle of the road,\n" +
"doors open, as if someone did not even have the time to close them. As you stand a bit away from\n" +
"the cars, it's hard to tell, but you can't help but see the spots on one of the car's back window.\n" +
"It really looks like... blood.\n\n" +
"At your right, you get a glimpse of the tall dark trees, barely visible as the mist slowly surrounds it.\n" +
"It is quiet, too quiet, except for the occasional sounds of something... Scraping? Or is it footsteps\n" +
"amongst the leaves? It's cold outside, and you could really use some heat, but just the thought of\n" +
"going into one of the houses gives you the creeps. You don't know what awaits you either way, but\n" +
"maybe the forest at least could offer you some sort of shelter, away from the eerie city.\n" +
"Do you choose to [1] go to the city or [2] go into the forest? ", 1);
}

public void prologueContinue(){
    Slowprint.slowPrintln("As you leave the policestation behind, you look around to the remaining houses. Besides the\n" +
"residential buildings, there are two buildings rising above the others. One looks like a mall and\n" +
"the other a hospital. Both could host even more gruesome creatures, but they could also contain a\n" +
"better chance to escape, or some sort of a lifeline.\n\n" +
"Which one would be the better choice? The mall [1] or the hospital [2]?\n" +
"Enter your choice...", 2);
}
public boolean checkCorF(){
    Scanner s = new Scanner(System.in);
    int choiceCorF = check.checkYesNo(playerinput.getScanner());
    switch(choiceCorF){
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

public boolean choiceMorH(){
    int choiceMorH = check.checkYesNo(playerinput.getScanner());
    switch(choiceMorH){
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
    Slowprint.slowPrintln("-------------Results: -------------",2);
    Slowprint.slowPrintln("Health: " +player.getHealth(), 2);
    Slowprint.slowPrintln("Strength: "+player.getStrength(),2);
    Slowprint.slowPrintln("Speed: "+ player.getSpeed(),2);
    Slowprint.slowPrintln("Intelligence: "+ player.getIntelligence(),2);
    player.showBackpackItems();
    System.exit(0);
}
//-----------------------------------------------MAIN --------------------------------------------------    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Player player = new Player("Default name", 17 ,3, 3 , 0, 0, 0);
        Menu menu = new Menu(player);
        menu.start();
        player.setName(s);
        player.setAge(s);
        menu.startSkills();
        Slowprint.slowPrintln("Press Enter to begin...",2);
        s.nextLine(); //Väntar tills user trycker på enter
        System.out.println("");
        menu.prologue();
        menu.checkCorF();
        menu.prologueContinue();
        menu.choiceMorH();
        Slowprint.slowPrintln("As you finally open the last door, you can barely believe your eyes. A helicopter! As you run\n" + 
      "for it and start the, thankfully still working, engine, you look down towards the city you are\n" + 
      "about to leave behind, and you feel a great relief inside. You made it!", 2);
        System.out.println("");
        menu.gameOver();







s.close();
    }
}

