package main.actions;

import main.game.*;
import main.game.logic.*;
import main.models.gridSpaces.*;

import java.util.logging.*;

public class Scouting extends AbstractGameAction {

    private AbstractGridSpace region;

    public Scouting() {
        this.actionType = ActionType.SCOUTING;
        this.region = Game.getGameBoard().getRandomRegion();
    }

    @Override
    public void update() {
        boolean discovered = Game.getGameBoard().discover(region);
        if (discovered) {
            OutputManager.addToBottom("Discovered a new " + region.toString() + " region!");
            isDone = true;
        } else {
            region = Game.getGameBoard().getRandomRegion();
        }
    }
}