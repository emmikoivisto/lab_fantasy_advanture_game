import org.junit.Before;
import org.junit.Test;
import playable_characters.fighters.weapons.Axe;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    private Axe axe;

    @Before
    public void before() {
        axe = new Axe("bigAxe", 8);
    }

    @Test
    public void canGetName() {
        assertEquals("bigAxe", axe.getName());
    }

    @Test
    public void canGetDamageLevel() {
        assertEquals(8, axe.getDamageLevel());
    }

}
