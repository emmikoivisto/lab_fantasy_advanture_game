import org.junit.Before;
import org.junit.Test;
import playable_characters.fighters.Barbarian;
import playable_characters.fighters.Dwarf;
import playable_characters.fighters.weapons.Axe;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;
    Barbarian enemyBarbarian;

    @Before
    public void before(){
        axe = new Axe("Axe", 4);
        dwarf = new Dwarf("Malcolm", axe, 30, 5);
        dwarf.addWeapon(axe);
        enemyBarbarian = new Barbarian("Harrison", axe, 30);
    }

    @Test
    public void canGetWeapons(){
        assertEquals(1, dwarf.countWeapon());
    }

    @Test
    public void getActiveWeapon(){
        assertEquals(axe, dwarf.getActiveWeapon());
    }

    @Test
    public void canAttack(){
        dwarf.attack(enemyBarbarian);
        assertEquals(21, enemyBarbarian.getHealthPoints());
    }

    @Test
    public void barbarianAttack(){
        enemyBarbarian.attack(dwarf);
        assertEquals(26, dwarf.getHealthPoints());
    }
}
