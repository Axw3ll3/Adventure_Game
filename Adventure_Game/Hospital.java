package Adventure_Game;

public class Hospital {
    private Player player;
    public Hospital(Player player){
        System.out.println("----------------------------------------------------------------");
        player.levelUp();
        Slowprint.slowPrintln("The hospital lies in darkness, except for the occasional beeping of some machine in the distance. You walk slowly over the dirty floors, carefully stepping over the bags of fluids from the hospital beds, which has been thrown on the floors, some broken and leaking. You hold your breath, the smell is hideous. You try to increase your pace, just eager to get out of the messy hallway. Further down to hall you see a stairway leading up to a door with an Exit sign. Maybe some sort of help could be available if you just would make it there. As you have been walking a few feet, a shadow passes by behind you. As your heart starts thundering, you turn around.",2);
        System.out.println("");
        Dog dog = new Dog();
        Combat combat = new Combat(player);
        Slowprint.slowPrintln(dog.getDescription(), 2); 
            combat.combat(player.getStrength(), player.getHealth(), dog);
        Riddle riddle = new Riddle(player);
            riddle.arrivalAtRiddle();
    }
    
}
