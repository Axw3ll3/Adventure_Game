package Adventure_Game;
import java.util.Scanner;

public class City{
    public City(Player player){
        Scanner s = new Scanner(System.in);
        Zombie zombie = new Zombie();
        Combat combat = new Combat(player);
        System.out.println("----------------------------------------------------------------");
        System.out.println("You've arrived to the city");
        Slowprint.slowPrintln(zombie.getDescription());
            combat.combat(player.getStrength(), player.getHealth(), zombie);
        Policestation policestation = new Policestation(player);
            policestation.ifPolicestation(player);

    }    
}
