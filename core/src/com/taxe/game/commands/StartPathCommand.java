package com.taxe.game.commands;

import com.taxe.game.GameCore;
import com.taxe.game.nodes.IntermediatePoint;
import com.taxe.game.trains.Train;
import com.taxe.game.trains.TrainStates;

/**
 * Created by vlad on 11/01/15.
 */
public class StartPathCommand implements Commandable {

    public static void executeCommand(GameCore game, Object target) {
        if (!(target instanceof Train)) {
            throw new IllegalArgumentException("target must be an instance of Train");
        }
        ResetPathCommand.executeCommand(game, target);
        Train t = (Train) target;
        t.setState(TrainStates.SELECTED);
        if (! (t.getNode() instanceof IntermediatePoint)) {
            ContinuePathCommand.executeCommand(game, t.getNode());
            game.getGui().getHUD().showPathButtons();
        }
    }

}
