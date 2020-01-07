import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerCharacterTest {
    @Test
    public void itHasAName() {
        PlayerCharacter pc = new PlayerCharacter("Guy Royse");
        assertEquals(pc.getName(), "Guy Royse");
    }

    @Test
    public void itHasAnAlignment() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        pc.setAlignment(PlayerCharacter.Alignment.EVIL);
        assertEquals(pc.getAlignment(), PlayerCharacter.Alignment.EVIL);
    }

    @Test
    public void defaultArmorClass() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        assertEquals(10, pc.getArmorClass());
    }

    @Test
    public void defaultHitPoints() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        assertEquals(5, pc.getHitPoints());
    }

    @Test
    public void defaultCharacterHasAbilities10() {
        PlayerCharacter pc = new PlayerCharacter("Default Guy");
        assertEquals(10, pc.getStrength().getScore());
        assertEquals(10, pc.getIntelligence().getScore());
        assertEquals(10, pc.getWisdom().getScore());
        assertEquals(10, pc.getDexterity().getScore());
        assertEquals(10, pc.getConstitution().getScore());
        assertEquals(10, pc.getCharisma().getScore());
    }

    @Test
    public void lowerMaxHPLimitsHP() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        pc.setHitPoints(11);
        pc.setMaxHitPoints(9);
        assertEquals(9, pc.getHitPoints());
    }

    @Test
    public void higherMaxHPDoNotLimitHP() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        pc.setHitPoints(11);
        pc.setMaxHitPoints(12);
        assertEquals(11, pc.getHitPoints());
    }

    @Test
    public void highConstitutionAffectsMaxHP() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        pc.setMaxHitPoints(10);
        pc.getConstitution().setScore(18);
        assertEquals(14, pc.getMaxHitPoints());
    }

    @Test
    public void defaultConstitutionDoesNotAffectMaxHP() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        pc.setMaxHitPoints(8);
        pc.getConstitution().setScore(10);
        assertEquals(8, pc.getMaxHitPoints());
    }
}