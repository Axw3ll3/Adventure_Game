package Adventure_Game;

import java.util.ArrayList;

public class Backpack {
    private ArrayList<String> items;  //En lista för att lagra föremål
    private int maxCapacity;

    //

    public Backpack(int maxCapacity) {
        this.items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    //metod för att addera föremål till ryggsäcken
    public boolean addItem(String item) {
        if (items.size() < maxCapacity) {
            items.add(item);
            System.out.println(item + " has been added to the backpack.");
            return true;
        } else {
            System.out.println("Backpack is full! You cannot pick up " + item + ".");
            return false;
        }
    }

    public void displayItems() {
        System.out.println("Backpack items: " + items); 
    }

    public boolean isBackpackFull() {
        return items.size() >= maxCapacity;

    }

    
}
