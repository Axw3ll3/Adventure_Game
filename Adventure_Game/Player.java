package Adventure_Game;
import java.util.Scanner;


public class Player {

    private CharacterInfo characterInfo;
    private Attributes attributes;
    private Backpack backpack;
               

    public Player(String name, int age, int backpackCapacity, int health, int speed, int strength, int intelligence) {
        this.characterInfo = new CharacterInfo(name, age);
        this.attributes = new Attributes(3, 0, 0, 0);
        this.backpack = new Backpack(3);
    }

    public void setName(Scanner sc) {
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Enter your name: ");
            String inputName = sc.nextLine();

            //en kontroll om namnet endast innehåller bokstäver och är 1-20 tecken långt.
            if (inputName.matches("[a-zA-ZÅÄÖåäö]{1,20}")) {
                 characterInfo.setName(inputName);
                isValid = true;
                System.out.println("Your chosen name is " + characterInfo.getName());
            } else {
                System.out.println("Incorrect input. The name must contain only letters and must be between 1-20 characters.");
            }

        }
        
    }

    public void setAge(Scanner sc) {

        boolean isValid = false;
       
        while (!isValid) {
            System.out.println("Enter your age: ");
            String inputAge = sc.nextLine();

            //Kontroll om inmatningen endast innehåller siffror
            if (!inputAge.matches("\\d+")) {
                System.out.println("Error: Age must be entered with numbers only.");
                continue;
            }

            //omvandlar inmatningen till heltal och sparar i age
            int age = Integer.parseInt(inputAge);

        
            if (age < 15 || age > 120) {
                System.out.println("Error: Age must be between 15 and 120.");
            } else {
                characterInfo.setAge(age);
                System.out.println("Your age has been registered.");
                isValid = true;

            }
         }
     }

    public void reward(String choice) {
        switch (choice.toLowerCase()) {
            case "speed": 
                attributes.increaseSpeed();
                System.out.println(characterInfo.getName() + " has increased speed to " + attributes.getSpeed());
                break;
            case "strength":
                attributes.increaseStrength();
                System.out.println(characterInfo.getName() + " has increased strength to " + attributes.getStrength());
                break;
            case "intelligence":
                attributes.increaseIntelligence();
                System.out.println(characterInfo.getName() + " has increased intelligence to " + attributes.getIntelligence());
                break;
            default:
                System.out.println("Invalid choice. Try again.");
                break;

        }
    }
   
    public Backpack getBackpack() {
        return this.backpack;  
    }
    
   public void takeDamage(int damage) {
        attributes.takeDamage(damage);
    }

    public void levelUp() {
        characterInfo.levelUp();
    }

    public int getHealth() {
        return attributes.getHealth();
    }

    public int getLevel() {
        return characterInfo.getLevel();
    }

    public void addItemToBackpack(String item) {
        backpack.addItem(item);

    }

    public void showBackpackItems() {
         backpack.displayItems();
    }

    public int getStrength() {
        return attributes.getStrength();
    }

    public int getSpeed() {
        return attributes.getSpeed();
    }

    public int getIntelligence() {
        return attributes.getIntelligence();
    }

    public String getName() {
        return characterInfo.getName();
    }

    public void setHealth(){
        attributes.setHealth(0);
    }


    }

  
