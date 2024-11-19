package Adventure_Game;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Riddle {
    Random random = new Random();
    private Slowprint slowprint;
    private Player player;
    private PlayerInput playerinput;
    private Check check;
    private Scanner sc;

    public Riddle() {
        this.player=player;
        this.playerinput=playerinput;
        this.check=check;
        this.sc=sc;
    }

    public void arrivalAtRiddle(){
        slowprint.slowPrintln("After an epic battle with the rabiesdog - fearsome, rabid creatures that terrorized the whole hospital - you find yourself in an empty and quiet hospital. "
        + "You navigate through the dimly lit hallways. In the horizon you spot a door with keypad whose got a display above it. "
        + "\nYou run towards it, on the display it says:");
        questionAndChoice();

    }

    public void ifRiddleSolved() {
        slowprint.slowPrintln("You've solved the numeric riddle the door opens up. You run towards freedom!");
        riddleSouvenir();
    }

    public void ifRiddleNotSolved(){
        if (player.getHealth() > 1) {
                player.takeDamage(1);;
                slowprint.slowPrintln("Wrong answer. You got " +player.getHealth()+ " health remaining.");
                questionAndChoice();
            }
        else {
            slowprint.slowPrintln("You have no health left and have unfortunally died.");
        }
    }

    


        public void questionAndChoice() {
            for (int i = 0; i < 1; i++) {
                //Generation av random nummer, operator och uträkning av korrekt svar
                int num1 = random.nextInt(15) + 1, num2 = random.nextInt(15) + 1;
                String[] operators = {"+", "-", "*"};
                String operator = operators[random.nextInt(3)];
                int correctAnswer = calculateAnswer(num1, num2, operator, random);
    
                //Utskrift av fråga och alternativ
                slowprint.slowPrintln("Let's unravel the mystery of " + num1 + " " + operator + " " + num2 + "?");
                ArrayList<Integer> options = generateOptions(correctAnswer, random);
                for (int j = 0; j < options.size(); j++) slowprint.slowPrintln((j + 1) + ". " + options.get(j));
    
                //Hämtar användarens val och kollar om det är korrekt
                slowprint.slowPrintln("Enter your choice of answer on the keypad: ");
                if (options.get(check.checkChoices(sc) - 1) == correctAnswer) {
                    ifRiddleSolved();
                } else {
                    ifRiddleNotSolved();    
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
        public void riddleSouvenir() {
            int choice;
            slowprint.slowPrintln("Do you want to take loosened up Enter key as a souvenir from the mall?");
            while (true) {
                slowprint.slowPrintln("[1] Yes");
                slowprint.slowPrintln("[2] No");
    
                // Kallar på metod för att se att input av användare är en integer
               choice = check.checkYesNo(playerinput.getScanner());
    
                    switch (choice) {
                        case 1:
                            System.out.println("You've decided to pick up the enter key as a souvenir");
                            player.addItemToBackpack("Enter key");
                            break;
                        case 2:
                           System.out.println("You've decided to not pick up a souvenir from the mall.");
                            break;
                    
                    }
                    break;
                } 
            }
}
