package com.taxe.game.commands;

import com.taxe.game.GameCore;
import com.taxe.game.Player;
import com.taxe.game.trains.Train;
import com.taxe.game.trains.TrainStates;

/**
 * Created by vlad on 12/01/15.
 */
public class ActivatePlayerCommand implements Commandable {

    public static void executeCommand(GameCore game, Object target) {
        if (!(target instanceof Player)) {
            throw new IllegalArgumentException("target must be an instance of Player");
        }
        for (Player p : game.getPlayers()) {
            for (Train t : p.getTrains()) {
                t.setState(TrainStates.INACTIVE);
            }
        }
        for (Train t : ((Player) target).getTrains()) {
            t.setState(TrainStates.ACTIVE);
        }
    }

}