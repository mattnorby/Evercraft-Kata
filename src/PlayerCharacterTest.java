import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerCharacterTest {
    @Test
    public void itHasAName() {
        PlayerCharacter pc = new PlayerCharacter("Guy Royse");
        assertEquals(pc.getName(), "Guy Royse");
    }
}