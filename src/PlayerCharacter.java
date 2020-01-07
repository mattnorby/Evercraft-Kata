public class PlayerCharacter {
    public static enum Alignment {
        GOOD,
        EVIL,
        NEUTRAL
    }

    private String name;
    private Alignment alignment;

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
}
