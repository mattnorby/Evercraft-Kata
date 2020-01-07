public abstract class Character extends Combatant {
    public static enum Alignment {
        GOOD,
        EVIL,
        NEUTRAL
    }

    protected String name;
    protected Alignment alignment;
    private final Ability strength = new Ability(10);
    private final Ability intelligence = new Ability(10);
    private final Ability wisdom = new Ability(10);
    private final Ability dexterity = new Ability(10);
    private final Ability constitution = new Ability(10);
    private final Ability charisma = new Ability(10);

    public Ability getStrength() {
        return strength;
    }

    public Ability getIntelligence() {
        return intelligence;
    }

    public Ability getWisdom() {
        return wisdom;
    }

    public Ability getDexterity() {
        return dexterity;
    }

    public Ability getConstitution() {
        return constitution;
    }

    public Ability getCharisma() {
        return charisma;
    }
}
