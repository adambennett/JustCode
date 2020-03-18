package main.models.animals.land;

import main.models.animals.*;

public class Moose extends AbstractLandAnimal {


    public Moose() {
        super(345);
    }

    @Override
    public Moose clone() {
        return new Moose();
    }
}
