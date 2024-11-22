package Adventure_Game.Environments;

import Adventure_Game.Obstacles.Puzzle;
import Adventure_Game.Player.Player;
import Adventure_Game.Tools.Check;
import Adventure_Game.Tools.PlayerInput;
import Adventure_Game.Tools.Slowprint;

public class Policestation {
    PlayerInput playerinput = new PlayerInput();
    Check check = new Check();
    private int choicePorH; 
    public Policestation(Player player) {
        this.playerinput=playerinput;
        this.check=check;
    }
    public boolean ifPolicestation(Player player){
        System.out.println("----------------------------------------------------------------");
        Slowprint.slowPrintln("The nearest building is the policestation. You make a run for it. \n"
        + "Perhaps inside you can find something useful. The curtains inside are blocking the windows, \n "
        + " making the wole station seem... quiet.",2);
        System.out.println("Do you choose to stay at the policestation [1] or make a run for the next building [2]? ");
        choicePorH = check.checkYesNo(playerinput.getScanner());
        
        switch(choicePorH){
        case 1:
        player.levelUp();
        Puzzle puzzle = new Puzzle(player);
        puzzle.arrivalAtPuzzle();
        return true;
        
        case 2:
        return false;
        
    }
    return false;
    }  
}
