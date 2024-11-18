<<<<<<< HEAD:Adventure_Game/Player.java
package Adventure_Game;
import java.util.Scanner;

public class Player {
    private String name;
    private int age;
    private int health;
    private int level;
    private static final int MAX_LEVEL = 4;
    private int speed;
    private int strength;
    private int intelligence;
 


    public Player(String name) {
        this.name = name;
        this.age = 0;
        this.health = 3;
        this.level = 1;
        this.speed = 0;
        this.strength = 0;
        this.intelligence = 0;
=======
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Scanner;

public class Player {

    private CharacterInfo characterInfo;
    private Attributes attributes;
    private Backpack backpack;

    public Player(String name, int age, int backpackCapacity) {
        this.characterInfo = new CharacterInfo(name, age);
        this.attributes = new Attributes(3, 0, 0, 0);
        this.backpack =  new Backpack(backpackCapacity);
>>>>>>> karaktär:Player.java
    }

    public void setName(Scanner sc) {
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Enter your name: ");
            String inputName = sc.nextLine();

            //en kontroll om namnet endast innehåller bokstäver och är 1-20 tecken långt.
            if (inputName.matches("[a-zA-ZÅÄÖåäö]{1,20}")) {
<<<<<<< HEAD:Adventure_Game/Player.java
                this.name = inputName;
                isValid = true;
                System.out.println("Your chosen name is " + this.name);
=======
                 characterInfo.setName(inputName);
                isValid = true;
                System.out.println("Your chosen name is " + characterInfo.getName());
>>>>>>> karaktär:Player.java
            } else {
                System.out.println("Incorrect input. The name must contain only letters and must be between 1-20 characters.");
            }

        }
        
    }
<<<<<<< HEAD:Adventure_Game/Player.java
    
    public String getName() {
        return this.name;
    }
=======
>>>>>>> karaktär:Player.java

    public void setAge(Scanner sc) {
       
        while (true) {
            System.out.println("Enter your age: ");
            String inputAge = sc.nextLine();

            //Kontroll om inmatningen endast innehåller siffror
            if (!inputAge.matches("\\d+")) {
                System.out.println("Error: Age must be entered with numbers only.");
                continue;
            }

            //omvandlar inmatningen till heltal och sparar i age
<<<<<<< HEAD:Adventure_Game/Player.java
            this.age = Integer.parseInt(inputAge);

            //kontroll ifall spelaren är minst 15år och max 120år
            if (this.age < 15) {
                System.out.println("Error: You must be at least 15 years old to play this game.");
            } else if (age > 120) {
                System.out.println("Error: The age cannot be over 120 years.");
            } else {
                System.out.println("Your age has been registered.");
                break;
            }

        }
    
    }

 
     public int getHealth() {
        return this.health;
     }

     public void setHealth(int health) {
        this.health = health;
     } 

     public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
     }

     //metod för att öka i nivå
     public void levelUp() {
        if (this.level < MAX_LEVEL) {
            this.level++;
            System.out.println(this.name + " has reached level " + this.level + "!");
        }
     }

     //metod för belöningssystem där färdigheter kan ökas
    public void reward(String choice) {
        switch (choice) {
            case "speed":
               this.speed += 1;
               System.out.println(this.name + " has increased its speed to " + this.speed);
               break;
            case "strength":
               this.strength += 1;
               System.out.println(this.name + " has increased its strength to " + this.strength);
               break;
            case "intelligence":
               this.intelligence += 1;
               System.out.println(this.name + " has increased its intelligence to " + this.intelligence);
               break;
            default:
                System.out.println("Invalid selection, try again.");
                break;
        }
    

    public int getLevel() {
        return this.level;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getIntelligence() {
        return this.intelligence;
    }


    }


 



    
=======
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

    public void takeDamage(int damage) {
        characterInfo.levelUp();
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




    }

  
>>>>>>> karaktär:Player.java
