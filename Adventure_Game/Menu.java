package Adventure_Game;
import java.util.Scanner;
public class Menu {
private Player player;

public Menu(Player player){
    this.player = player;

}
public void gameOver(){
    System.out.println("-------------Results: -------------");
    System.out.println("Health: " + player.getHealth());
    System.out.println("Strength: ");
    System.out.println("Speed: ");
    System.out.println("Intelligence: ");
    System.exit(0);
}
//-----------------------------------------------MAIN --------------------------------------------------    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("WELCOME TO THE ADVENTUREGAME BY VELVETVIBE");
        System.out.println("------------------------------------------");
        System.out.println("First we are going to start by creating your character");
        Player player = new Player("Default name");
        player.setName(s);
        player.setAge(s);
        System.out.println("Your current skills are: "); //+KARAKTÄR EGENSKAPER
        System.out.println("Health: " + player.getHealth());
        System.out.println("Strength: " + player.getStrength() );
        System.out.println("Speed: " + player.getSpeed());
        System.out.println("Intelligence: " + player.getIntelligence());
        System.out.println("Press Enter to begin...");
        s.nextLine(); //Väntar tills user trycker på enter
        System.out.println("");//Här beskrivande text om hur karaktären vaknar upp på platsen
        Slowprint.slowPrintln("At your left you spot the buildings of what seems to have once been a small city \n" +
    "full of life, with a police station, a hospital, and a mall, now completely abandoned.\n" +
    "Most of what's left of the windows are now just holes, with broken glass on the street,\n" +
    "as if someone has been in such a rush, they've just jumped right out of the window.\n" +
    "The cars are parked in the middle of the road, doors open, as if someone did not even\n" +
    "have the time to close it. As you stand a bit away from the cars, it's hard to tell,\n" +
    "but you can't help but see the spots on one of the car's back window. It really looks\n" +
    "like...blood.\n\n" +
    
    "At your right you get a glimpse of the tall dark trees, barely visible as the mist\n" +
    "slowly surrounds it. It is quiet, too quiet, except for the occasional sounds of\n" +
    "something... Scraping? Or is it footsteps amongst the leaves? It's cold outside and\n" +
    "you could really use some heat, but just the thought of going into one of the houses\n" +
    "gives you the creeps. You don't know what awaits you in either way, but maybe the forest\n" +
    "at least could offer you some sort of shelter, away from the eerie city.\n"
    + "\n Do you choose to [1] go to the city or [2] go into the forest? ", 1);
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
System.out.println("As you leave the policestation behind, you look around to the remaining houses. Besides the residentbuildings \n"
+ "there are two buildings rising above the others. One looks like a mall and the other a hospital. Both could host even more \n "
+ "gruesome creatures, but they could also contain a better chance to escape, or some sort of a lifeline.");
System.out.println();
System.out.println("Här är vi nu"); //ta bort sen






s.close();
    }
}

