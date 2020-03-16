package clamFortress.Animals;

import clamFortress.models.animals.mountain.MountainAnimal;
import clamFortress.models.animals.mountain.MountainGoat;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void getAmountOfFoodOnHuntTest(){
        MountainAnimal mGoat = new MountainGoat();

        Integer actual = mGoat.getAmountOfFoodOnHunt();
        Integer expected = 75;

        Assert.assertEquals(expected,actual);
    }
}
