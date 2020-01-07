import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerCharacterTest {
    @Test
    /**
     * As a character, I want to have a name so that I can be distinguished from other characters
     */
    public void itHasAName() {
        PlayerCharacter pc = new PlayerCharacter("Guy Royse");
        assertEquals(pc.getName(), "Guy Royse");
    }

    @Test
    /**
     * As a character I want to have an alignment so I have something to guide my actions
     */
    public void itHasAnAlignment() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        pc.setAlignment(PlayerCharacter.Alignment.EVIL);
        assertEquals(pc.getAlignment(), PlayerCharacter.Alignment.EVIL);
    }

    @Test
    /**
     * As a combatant, I want to have an armor class so I can resist attacks from my enemies
     */
    public void defaultArmorClass() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        assertEquals(10, pc.getArmorClass());
    }

    @Test
    /**
     * As a combatant, I want to have hit points so I can resist attacks from my enemies
     */
    public void defaultHitPoints() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        assertEquals(5, pc.getHitPoints());
    }

    @Test
    /**
     * As a character, I want to have several abilities so that I am not identical to every other character
     */
    public void defaultCharacterHasAbilities10() {
        PlayerCharacter pc = new PlayerCharacter("Default Guy");
        assertEquals(10, pc.getStrengthScore());
        assertEquals(10, pc.getIntelligenceScore());
        assertEquals(10, pc.getWisdomScore());
        assertEquals(10, pc.getDexterityScore());
        assertEquals(10, pc.getConstitutionScore());
        assertEquals(10, pc.getCharismaScore());
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
        pc.setConstitutionScore(18);
        assertEquals(14, pc.getMaxHitPoints());
    }

    @Test
    public void defaultConstitutionDoesNotAffectMaxHP() {
        PlayerCharacter pc = new PlayerCharacter("Joe Bob");
        pc.setMaxHitPoints(8);
        pc.setConstitutionScore(10);
        assertEquals(8, pc.getMaxHitPoints());
    }
}