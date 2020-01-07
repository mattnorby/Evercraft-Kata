public class PlayerCharacter implements Combatant {
    public static enum Alignment {
        GOOD,
        EVIL,
        NEUTRAL
    }

    private String name;
    private Alignment alignment;
    private int hitPoints = 5;
    private int armorClass = 10;

    public PlayerCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    @Override
    public int getArmorClass() {
        return this.armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    @Override
    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
