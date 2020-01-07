import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AttackTest {
    @Test
    public void itCanAttackAndHitOtherCombatants() {
        PlayerCharacter pc = new PlayerCharacter("Billy Bob");
        Combatant c = new Monster(10, 5);
        boolean hit = pc.attack(c, 15);
        assertTrue(hit);
    }

    @Test
    public void itCanAttackAndMissOtherCombatants() {
        PlayerCharacter pc = new PlayerCharacter("Unlucky Bob");
        Combatant c = new Monster(10, 5);
        boolean hit = pc.attack(c, 5);
        assertFalse(hit);
    }
}
