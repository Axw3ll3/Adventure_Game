package Adventure_Game;

public class CharacterInfo {

    private String name;
    private int age;
    private int level;
    private static final int MAX_LEVEL = 4;

    public CharacterInfo(String name, int age) {
        this.name = name;
        this.age = age;
        this.level = 0;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        if (level < MAX_LEVEL) {
            level++;
            System.out.println(name + " has reached level " + level + "!");
        }
    }


    
}
