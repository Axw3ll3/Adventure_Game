package Adventure_Game;
import java.util.Scanner;

import Adventure_Game.Forest;

import Adventure_Game.City;
public class Menu {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("WELCOME TO THE ADVENTUREGAME BY VELVETVIBE");
        System.out.println("------------------------------------------");
        System.out.println("First we are going to start by creating your character");
        System.out.println("Enter the name of the player: ");
        String PlayerName = s.nextLine();
        System.out.println("Welcome " + PlayerName + " !");
        System.out.println("Your current skills are " ); //+KARAKTÄR EGENSKAPER
        System.out.println("Press Enter to begin...");
        s.nextLine(); //Väntar tills user trycker på enter
        System.out.println("");//Här beskrivande text om hur karaktären vaknar upp på platsen
        System.out.println("At your left you spot the buildings of what seems to have once been a small city \n" +
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
    + "\n Do you choose to [1] go to the city or [2] go into the forest? ");
    int choiceCorF = s.nextInt();
    while (choiceCorF != 1 && choiceCorF != 2){ 
        System.out.println("You have to enter a valid choice! Try again: ");
        choiceCorF = s.nextInt();
     }
    switch(choiceCorF){
    case 1:
    City ci = new City();
    System.out.println();
    break;

    case 2:
    Forest f = new Forest();
    System.out.println(f);
    
    break;

    
    }








s.close();
    }
}

