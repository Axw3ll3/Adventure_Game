package Adventure_Game;

public class GameEngine {
    public static void main(String[] args) {
        Slowprint slowprint = new Slowprint();
        
        Player player = new Player(null);
        FirePlace fire = new FirePlace(player);
        fire.ifLit();

        
    
        
        /*
        Food food = new Food();
        food.findingTheFood();
        */

        /*
        Puzzle puzzle = new Puzzle();
        puzzle.arrivalAtPuzzle();
        */
        
        //Riddle riddle = new Riddle();
        //riddle.arrivalAtRiddle();
        //riddle.questionAndChoice();


    
    }
    
}
