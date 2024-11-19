package Adventure_Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Puzzle {
    //Glöm inte ta bort slowprint.
    Random random = new Random();
    private Slowprint slowprint;
    private Food food;
    private Player player;
    private PlayerInput playerinput;
    private Scanner sc;
    private Check check;
    private Backpack backpack;



    public Puzzle() {
        this.food=food;
        this.player=player;
        this.check=check;
        this.sc=sc;
        this.playerinput=playerinput;
        this.backpack=backpack;
    }

    public void arrivalAtPuzzle() {
        slowprint.slowPrintln("You stand alone in the dusty police station, facing an old filing cabinet. "
        + "\nYou walk out of the office and out in the hallways. As you navigate through the dimly lit hallways, you find a room marked 'Survival'. " 
        + "\nInside, there is a large, rusted puzzle with a numeric combination. It reads:");
        questionAndChoice();
    }
    
    public void ifSolved(){
        puzzleSouvenir();
        food.findingTheFood();
        food.choiceOfEating();
    }


    public void ifNotSolved(){
        slowprint.slowPrintln("You couldn't come up with the answer to the puzzle (equation) and decide to leave the policestation due to you already exploring the whole place.");
    }



    public void questionAndChoice() {
        for (int i = 0; i < 1; i++) {
            //Generation av random nummer, operator och uträkning av korrekt svar
            int num1 = random.nextInt(15) + 1, num2 = random.nextInt(15) + 1;
            String[] operators = {"+", "-", "*"};
            String operator = operators[random.nextInt(3)];
            int correctAnswer = calculateAnswer(num1, num2, operator, random);

            //Utskrift av fråga och alternativ
            slowprint.slowPrintln("Let's unveil the enigma of " + num1 + " " + operator + " " + num2);
            ArrayList<Integer> options = generateOptions(correctAnswer, random);
            for (int j = 0; j < options.size(); j++) slowprint.slowPrintln((j + 1) + ". " + options.get(j));

            //Hämtar användarens val och kollar om det är korrekt
            slowprint.slowPrintln("Enter your choice of answer on the keypad: ");
            if (options.get(check.checkChoices(sc) - 1) == correctAnswer) {
                ifSolved();
            } else {
                ifNotSolved();    
            }
            System.out.println();
        }
        sc.close();
    }

    //Metod som räknar ut svar baserat på operator
    public static int calculateAnswer(int num1, int num2, String operator, Random random) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            default: return 0;
        }
    }

    // Metod för att generera svar och alternativ med rätt svar
    public static ArrayList<Integer> generateOptions(int correctAnswer, Random random) {
        ArrayList<Integer> options = new ArrayList<>();
        options.add(correctAnswer);
        while (options.size() < 4) {
            int wrongAnswer = correctAnswer + random.nextInt(10) - 5;
            if (!options.contains(wrongAnswer)) options.add(wrongAnswer);
        }
        Collections.shuffle(options);
        return options;
    }

    public void puzzleSouvenir() {
        int choice;
        slowprint.slowPrintln("Do you want to take a puzzle piece as a souvenir from the hospital?");
        while (true) {
            slowprint.slowPrintln("[1] Yes");
            slowprint.slowPrintln("[2] No");

            // Kallar på metod för att se att input av användare är en integer
           choice = check.checkYesNo(playerinput.getScanner());

                switch (choice) {
                    case 1:
                        System.out.println("You've decided to take a puzzle piece as a souvenir");
                        backpack.addItem("Puzzle piece");
                        break;
                    case 2:
                       System.out.println("You've decided to not pick up a souvenir from the hospital.");
                        break;
                
                }
                break;
            } 
        }

}    
