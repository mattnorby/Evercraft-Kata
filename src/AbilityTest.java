import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbilityTest {
    @Test(expected = IllegalArgumentException.class)
    public void itCannotBeTooLow() {
        new Ability(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void itCannotBeTooHigh() {
        new Ability(21);
    }

    @Test
    public void checkModifierFor4() {
        Ability a = new Ability(4);
        assertEquals(-3, a.getModifier());
    }

    @Test
    public void checkModifierFor7() {
        Ability a = new Ability(7);
        assertEquals(-2, a.getModifier());
    }

    @Test
    public void checkModifierFor10() {
        Ability a = new Ability(10);
        assertEquals(0, a.getModifier());
    }

    @Test
    public void checkModifierFor12() {
        Ability a = new Ability(12);
        assertEquals(1, a.getModifier());
    }

    @Test
    public void checkModifierFor17() {
        Ability a = new Ability(17);
        assertEquals(3, a.getModifier());
    }

    @Test
    public void checkModifierFor20() {
        Ability a = new Ability(20);
        assertEquals(5, a.getModifier());
    }
}
