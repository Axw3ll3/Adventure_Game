package Adventure_Game;
import java.util.Scanner;
public class Menu {
private Player player;


public Menu(Player player){
    this.player = player;

}
public void gameOver(){
    Slowprint.slowPrintln("-------------Results: -------------",2);
    Slowprint.slowPrintln("Health: " + player.getHealth(),2);
    Slowprint.slowPrintln("Strength: "+player.getStrength(),2);
    Slowprint.slowPrintln("Speed: "+ player.getSpeed(),2);
    Slowprint.slowPrintln("Intelligence: "+ player.getIntelligence(),2);
    System.exit(0);
}
//-----------------------------------------------MAIN --------------------------------------------------    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("WELCOME TO THE ADVENTUREGAME BY VELVETVIBE");
        System.out.println("------------------------------------------");
        System.out.println("First we are going to start by creating your character");
        Player player = new Player("Default name");
        Menu menu = new Menu(player);
        player.setName(s);
        player.setAge(s);
        Slowprint.slowPrintln("Your current skills are: ",2); //+KARAKTÄR EGENSKAPER
        Slowprint.slowPrintln("Health: " + player.getHealth(),2);
        Slowprint.slowPrintln("Strength: " + player.getStrength(),2 );
        Slowprint.slowPrintln("Speed: " + player.getSpeed(),2);
        Slowprint.slowPrintln("Intelligence: " + player.getIntelligence(),2);
        Slowprint.slowPrintln("Press Enter to begin...",2);
        s.nextLine(); //Väntar tills user trycker på enter
        System.out.println("");//Beskrivning start
        Slowprint.slowPrintln(player.getName()+" wake up in the middle of a road. You have no memory of how you got here. You are all alone",2);
        Slowprint.slowPrintln("At your left you spot the buildings of what seems to have once been a small city full of life, with a police station, a hospital, and a mall, now completely abandoned.Most of what's left of the windows are now just holes, with broken glass on the street, as if someone has been in such a rush, they've just jumped right out of the window. The cars are parked in the middle of the road, doors open, as if someone did not even have the time to close it. As you stand a bit away from the cars, it's hard to tell, but you can't help but see the spots on one of the car's back window. It really looks like...blood.\n\n" +
       "At your right you get a glimpse of the tall dark trees, barely visible as the mist slowly surrounds it. It is quiet, too quiet, except for the occasional sounds of something... Scraping? Or is it footsteps amongst the leaves? It's cold outside and you could really use some heat, but just the thought of going into one of the houses gives you the creeps. You don't know what awaits you in either way, but maybe the forest at least could offer you some sort of shelter, away from the eerie city.\n"
       + "\nDo you choose to [1] go to the city or [2] go into the forest? ", 1);
    int choiceCorF = s.nextInt();
    while (choiceCorF != 1 && choiceCorF != 2){ 
        System.out.println("You have to enter a valid choice! Try again: ");
        choiceCorF = s.nextInt();
     }
    switch(choiceCorF){
    case 1:
    City ci = new City(player);
    System.out.println();
    break;

    case 2:
    Forest f = new Forest(player);
    City cit = new City(player);
    System.out.println();
    
    break;
    }
    
        Slowprint.slowPrintln("As you leave the policestation behind, you look around to the remaining houses. Besides the residentbuildings \n"
    + "there are two buildings rising above the others. One looks like a mall and the other a hospital. Both could host even more \n "
    + "gruesome creatures, but they could also contain a better chance to escape, or some sort of a lifeline.\n"
    + "Which one would be the better choice? The mall [1] or the hospital [2]? \n"
    + "Enter your choice...", 2);
    int choiceMorH = s.nextInt();
    while (choiceMorH != 1 && choiceMorH != 2){ 
        System.out.println("You have to enter a valid choice! Try again: ");
        choiceMorH = s.nextInt();
    }
    switch(choiceMorH){
    case 1:
    Mall m = new Mall(player);
    System.out.println();
    break;

    case 2:
    Hospital h = new Hospital(player);
    System.out.println();
    break;
    }

    Slowprint.slowPrintln("As you finally open the last door you can barely believe your eyes. A helicopter! As you run for it an start the, thankfully still working, engine, you watch down towards the city you are about to leave behind, and you feel a great relief inside. You made it!", 2);
    System.out.println("");
    menu.gameOver();







s.close();
    }
}

