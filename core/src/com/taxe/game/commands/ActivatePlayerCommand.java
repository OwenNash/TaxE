package com.taxe.game.commands;

import com.taxe.game.GameCore;
import com.taxe.game.player.Player;
import com.taxe.game.trains.Train;
import com.taxe.game.trains.TrainStates;

/**
 * Activates trains of a given player and disables trains of all other players.
 */
public class ActivatePlayerCommand implements Commandable {

    /**
     *
     * @param game instance of game
     * @param target player that must be activated
     * @throws IllegalArgumentException if target is not an instance of Player
     */
    public void executeCommand(GameCore game, Object target) throws IllegalArgumentException {
        if (!(target instanceof Player)) {
            throw new IllegalArgumentException("target not instance of Player");
        }

        // Disable trains of all players
        for (Player p : game.getPlayers()) {
            for (Train t : p.getTrains()) {
                t.setState(TrainStates.INACTIVE);
            }
        }

        // Enable trains of given player
        for (Train t : ((Player) target).getTrains()) {
            t.setState(TrainStates.ACTIVE);
        }
    }

}
