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
}