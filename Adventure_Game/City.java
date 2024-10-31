package Adventure_Game;
import java.util.Scanner;

public class City{
    public City(Player player){
        Zombie zombie = new Zombie();
        Combat combat = new Combat();
        Scanner s = new Scanner(System.in);
        System.out.println("You've arrived to the city");
        //zombie attack
        Policestation policestation = new Policestation(player);
        policestation.ifPolicestation(player);

    }    
}
