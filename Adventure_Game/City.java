package Adventure_Game;

public class City{
    public City(Player player){
        Zombie zombie = new Zombie();
        Combat combat = new Combat(player);
        System.out.println("----------------------------------------------------------------");
        player.levelUp();
        System.out.println("You've arrived to the city");
        Slowprint.slowPrintln(zombie.getDescription(), 2);
        combat.combat(player.getStrength(), player.getHealth(), zombie);
        System.out.println("");
        Policestation policestation = new Policestation(player);
            policestation.ifPolicestation(player);

    }    
}
