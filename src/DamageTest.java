import org.junit.Test;

import static org.junit.Assert.*;

public class DamageTest {
    @Test
    public void isCombatantDamaged() {
        PlayerCharacter pc = new PlayerCharacter("Billy Bob");
        Combatant c = new Monster(10, 5);
        pc.attack(c, 15);
        assertEquals(4, c.getHitPoints());
    }

    @Test
    public void isCombatantDamagedDoubleByCriticalHit() {
        PlayerCharacter pc = new PlayerCharacter("Billy Bob");
        Combatant c = new Monster(10, 5);
        pc.attack(c, 20);
        assertEquals(3, c.getHitPoints());
    }

    @Test
    public void isCombatentAlive() {
        Combatant c = new Monster(10, 2);
        assertTrue(c.isAlive());
    }

    @Test
    public void isCombatantDead() {
        PlayerCharacter pc = new PlayerCharacter("Billy Bob");
        Combatant c = new Monster(10, 2);
        pc.attack(c, 20);
        assertFalse(c.isAlive());
    }
}
