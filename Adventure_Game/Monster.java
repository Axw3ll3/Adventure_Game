package Adventure_Game;

public abstract class Monster {
    private int monsterStrength;
    private String description;
    private String hitPlayer;
    private String killPlayer;
    private String killedByPlayer;
    private boolean isEscapable;

    public Monster(int monsterStrength, String description, String hitPlayer, String killPlayer, String killedByPlayer, boolean isEscapable){
        this.monsterStrength = monsterStrength;
        this.description = description;
        this.killPlayer = killPlayer;
        this.hitPlayer = hitPlayer;
        this.killedByPlayer = killedByPlayer;
        this.isEscapable = isEscapable;
    }

    public int getMonsterStrength() {
        return monsterStrength;
    }

    public void setMonsterStrenght(int monsterStrength) {
        this.monsterStrength = monsterStrength;
    }

    public String getDescription() {
        System.out.println("");
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHitPlayer() {
        return hitPlayer;
    }

    public void setHitPlayer(String hitPlayer) {
        this.hitPlayer = hitPlayer;
    }

    public String getKillPlayer() {
        return killPlayer;
    }

    public void setKillPlayer(String killPlayer) {
        this.killPlayer = killPlayer;
    }

    public String getKilledByPlayer() {
        return killedByPlayer;
    }

    public void setKilledByPlayer(String killedByPlayer) {
        this.killedByPlayer = killedByPlayer;
    }

    public Monster(boolean isEscapable) {
        this.isEscapable = isEscapable;
    }

    public boolean isEscapable() {
        return isEscapable;
    }
}
  