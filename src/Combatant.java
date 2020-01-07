public abstract class Combatant {
    private int armorClass = 10;
    private int hitPoints = 5;
    private int maxHitPoints = 5;

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
        if (this.hitPoints > this.maxHitPoints) {
            this.hitPoints = this.maxHitPoints;
        } else {
            this.hitPoints = hitPoints;
        }
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
        if (hitPoints > maxHitPoints) hitPoints = maxHitPoints;
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
