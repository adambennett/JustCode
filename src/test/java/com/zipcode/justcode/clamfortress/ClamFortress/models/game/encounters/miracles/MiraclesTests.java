package com.zipcode.justcode.clamfortress.ClamFortress.models.game.encounters.miracles;

import com.zipcode.justcode.clamfortress.ClamFortress.models.game.models.nodes.*;
import com.zipcode.justcode.clamfortress.ClamFortress.models.game.models.other.*;
import com.zipcode.justcode.clamfortress.ClamFortress.models.game.utilities.persistence.*;
import org.junit.jupiter.api.*;

public class MiraclesTests {

    @Test
    public void runEncounter() {
        Game game = new Game();
        game = new Game();
        game.setId(1L);
        Database.setGameForTests(game);
        Village village = game.getVillage();
        ClericBlessing blessing = new ClericBlessing(10);
        DivineHealing divineHealing = new DivineHealing(10);
        blessing.runEncounter();
        divineHealing.runEncounter();
        Integer expectedSize = 2;
        Integer actualSize = village.getActiveMiracles().size();
        Assertions.assertTrue(village.getActiveMiracles().contains(blessing));
        Assertions.assertTrue(village.getActiveMiracles().contains(divineHealing));
        Assertions.assertEquals(expectedSize, actualSize);
    }
}