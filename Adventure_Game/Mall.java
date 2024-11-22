package Adventure_Game;

public class Mall {
    private Player player;
    public Mall(Player player){
        System.out.println("----------------------------------------------------------------");
        player.levelUp();
        Slowprint.slowPrintln("You enter through the big doors, facing the street. The dim lights inside tells you that there might atleast be electricity, however weak. Some of the small shops inside has been ransacked, while others just looks like a complete mess, clothes and articles laying all over the floors. Somewhere in the distant you hear what looks like a talking voice, almost like a radio. You decide to carefully walk towards the sound. Suddenly, a scream. No... multiple screams, from som sort of animal. In the dark you suddenly feel something crawling over your feet. You slowly look down. ",2);
        System.out.println("");
        Ratpack rats = new Ratpack();
        Combat combat = new Combat(player);
        Slowprint.slowPrintln(rats.getDescription(), 2); 
            combat.combat(player.getStrength(), player.getHealth(), rats);
        if(player.getIntelligence() < 3){
            Slowprint.slowPrintln("As you have finally escaped the pack of rats, you run for the door that leads to a stairway. When you're finally there you see there is a lock requiring some sort of pass to enter it. Requiered level of intelligence: 3. As your level of intelligence now is " + player.getIntelligence() + " you do not have enough, and cannot open the door. You hopelessly turn around, only to face something even bigger...");
            System.out.println("");
            BigRat bigrat = new BigRat();
            Slowprint.slowPrintln(bigrat.getDescription(), 2); 
                combat.combat(player.getStrength(), player.getHealth(), bigrat);
        }
        else {
            Slowprint.slowPrintln("As you escaped from the pack of rats, you run to the door for the stairways upward. There is a lock on the door that require a level of intelligence : 3. As your level of intelligence is " + player.getIntelligence() + " you can enter it. You quickly run up the stairs.");
            System.out.println("");
        }
    }
    
}
