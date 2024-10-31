package Adventure_Game;
import java.util.Scanner;
public class Cave {
    public Cave(){
        System.out.println("Finally, after a long night, you come across an opening in a nearby mountainside.\n"
+ "It seems as if it's big enough to enter and it could really make as a good shelter\n"
+ "for the rest of the night. You don't hear anything inside, but as everything in\n"
+ "this situation, things are stranger than they seem, and you might not want to risk it.\n"
+ "The choice is yours, and as you stand there counting the alternatives you suddenly see\n"
+ "a flock of black birds flying out of the cave mouth, as if they got scared of something.\n"
+ "Do you still want to enter the cave [1] or not [2]?"); }

public boolean enteringCave(){
Scanner s = new Scanner(System.in);
int choiceCave = s.nextInt();
while (choiceCave != 1 && choiceCave != 2){ 
    System.out.println("You have to enter a valid choice! Try again: ");
    choiceCave = s.nextInt();
 }
    switch(choiceCave){
        case 1:
        System.out.println("As you slowly walk up to the mouth of the cave. It is pitch black inside. Slowly, slowly you enter the cave.\n"
        + "Suddenly, a low growl.. You don't have time to react as red eyes approach you in the dark, attacking you.\n"
        + "Unfortunately, you died." );
        System.out.println("------------Game over------------");
        return true;


        case 2:
        System.out.println("You made a wise choice. Now, there is only one way ahead: The city...");
        return false;


        }
    return false;
}
}
