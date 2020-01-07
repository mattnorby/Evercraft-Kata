import com.sun.javaws.exceptions.InvalidArgumentException;

public class PlayerCharacter extends Combatant {

    public static enum Alignment {
        GOOD,
        EVIL,
        NEUTRAL
    }

    private String name;
    private Alignment alignment;
    private Ability strength;
    private Ability intelligence;
    private Ability wisdom;
    private Ability dexterity;
    private Ability constitution;
    private Ability charisma;

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

    public Ability getStrength() {
        return null;
    }
    public void setStrength(Ability a) throws InvalidArgumentException {

    }

    public Ability getIntelligence() {
        return null;
    }
    public void setIntelligence(Ability a) throws InvalidArgumentException {

    }

    public Ability getWisdom() {
        return null;
    }
    public void setWisdom(Ability a) throws InvalidArgumentException {

    }

    public Ability getDexterity() {
        return null;
    }
    public void setDexterity(Ability a) throws InvalidArgumentException {

    }

    public Ability getConstitution() {
        return null;
    }
    public void setConstitution(Ability a) throws InvalidArgumentException {

    }

    public Ability getCharisma() {
        return null;
    }
    public void setCharisma(Ability a) throws InvalidArgumentException {

    }
}
