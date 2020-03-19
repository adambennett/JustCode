package main.actions;

import main.actions.priority.food.human.Fishing;
import main.models.Game;
import main.models.animals.sea.Penguin;
import main.models.items.artifacts.PodsRod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FishingTest {

    private static Fishing fishing;

    @Before
    public void setup() {
        fishing = new Fishing(1);

    }

    @Test
    public void fishingTestWithoutRod(){
        Game.startGame();
        Game.getVillage().setFoodLimit(999);
        Game.getGameBoard().addAnimals( new Penguin(),11);

        Game.getVillage().setFood(0);
        Game.getVillage().setFoodLimit(999);


        fishing.update();

        Integer actual = Game.getVillage().getFood();
        Integer expected = 24;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void fishingTestWithRod(){

        PodsRod rod = new PodsRod();
        Game.startGame();
        Game.getVillage().setFoodLimit(999);
        Game.getVillage().getInventory().addItem(rod);
        Game.getGameBoard().addAnimals( new Penguin(),11);

        Game.getVillage().setFood(0);



        fishing.update();

        Integer actual = Game.getVillage().getFood();
        Integer expected = 48;

        Assert.assertEquals(expected,actual);
    }
}
