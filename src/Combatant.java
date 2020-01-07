public abstract class Combatant {
    private int armorClass = 10;
    private int hitPoints = 5;

    public int getArmorClass() {
        return this.armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean attack(Combatant opponent, int dieRoll) {
        if (dieRoll > opponent.getArmorClass()) {
            if (dieRoll == 20) {
                opponent.hitPoints -= 2;
            } else {
                opponent.hitPoints--;
            }
            return true;
        } else return false;
    }

    public boolean isAlive() {
        return (hitPoints > 0);
    }
}
