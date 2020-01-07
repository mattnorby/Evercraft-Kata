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

    public int getStrengthScore() {
        return strength.getScore();
    }
    public void setStrengthScore(int score) throws IllegalArgumentException {
        this.strength.setScore(score);
    }

    public int getIntelligenceScore() {
        return intelligence.getScore();
    }
    public void setIntelligenceScore(int score) throws IllegalArgumentException {
        this.intelligence.setScore(score);
    }

    public int getWisdomScore() {
        return wisdom.getScore();
    }
    public void setWisdomScore(int score) throws IllegalArgumentException {
        this.wisdom.setScore(score);
    }

    public int getDexterityScore() {
        return dexterity.getScore();
    }
    public void setDexterityScore(int score) throws IllegalArgumentException {
        this.dexterity.setScore(score);
    }

    public int getConstitutionScore() {
        return constitution.getScore();
    }
    public void setConstitutionScore(int score) throws IllegalArgumentException {
        int oldMaxHitPoints = this.getMaxHitPoints();
        int oldModifier = this.constitution.getModifier();
        this.constitution.setScore(score);
        int newModifier = this.constitution.getModifier();
        this.setMaxHitPoints(oldMaxHitPoints - oldModifier + newModifier);
    }

    public int getCharismaScore() { return charisma.getScore(); }
    public void setCharismaScore(int score) throws IllegalArgumentException {
        this.charisma.setScore(score);
    }
}
