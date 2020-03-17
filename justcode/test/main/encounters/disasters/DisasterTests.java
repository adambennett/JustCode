package main.encounters.disasters;

import main.models.*;
import main.models.nodes.*;
import org.junit.*;

public class DisasterTests {

    private static Village village;

    @Before
    public void setUp() {
        Game.startGame();
        village = Game.getVillage();
    }

    @Test
    public void runEncounter() {
        Earthquake eq = new Earthquake();
        Fire fire = new Fire();
        Flood flood = new Flood();
        Hurricane hurricane = new Hurricane();
        Tornado tornado = new Tornado();
        Tsunami tsunami = new Tsunami();
        Typhoon typhoon = new Typhoon();
        Volcano volcano = new Volcano();
        Typhoon typhoonB = new Typhoon();
        Volcano volcanoB = new Volcano();
        eq.runEncounter();
        fire.runEncounter();
        flood.runEncounter();
        hurricane.runEncounter();
        tornado.runEncounter();
        tsunami.runEncounter();
        typhoon.runEncounter();
        volcano.runEncounter();
        typhoonB.runEncounter();
        volcanoB.runEncounter();
        Integer expectedSize = 8;
        Integer actualSize = village.getOngoingDisasters().size();
        Assert.assertTrue(village.getOngoingDisasters().contains(eq));
        Assert.assertTrue(village.getOngoingDisasters().contains(fire));
        Assert.assertTrue(village.getOngoingDisasters().contains(flood));
        Assert.assertTrue(village.getOngoingDisasters().contains(hurricane));
        Assert.assertTrue(village.getOngoingDisasters().contains(tornado));
        Assert.assertTrue(village.getOngoingDisasters().contains(tsunami));
        Assert.assertTrue(village.getOngoingDisasters().contains(typhoon));
        Assert.assertTrue(village.getOngoingDisasters().contains(volcano));
        Assert.assertEquals(expectedSize, actualSize);
    }
}