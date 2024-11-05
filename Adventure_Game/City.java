package Adventure_Game;
import java.util.Scanner;

public class City{
    public City(Player player){
        Zombie zombie = new Zombie();
        Combat combat = new Combat(player);
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("You've arrived to the city");
        zombie.getDescription();
        combat.combat(player.getStrength(), player.getHealth(), zombie);
        Policestation policestation = new Policestation(player);
        policestation.ifPolicestation(player);

    }    
}
