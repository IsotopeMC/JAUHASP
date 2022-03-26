package dev.isotopemc.hideandseek.helpers;

import dev.isotopemc.hideandseek.HideAndSeek;
import dev.isotopemc.hideandseek.game.GameTeam;
import dev.isotopemc.hideandseek.game.teams.HiderTeam;
import dev.isotopemc.hideandseek.game.teams.LobbyTeam;
import dev.isotopemc.hideandseek.game.teams.SeekerTeam;
import dev.isotopemc.hideandseek.game.teams.SpectatorTeam;
import net.minestom.server.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class TeamHelper {

    protected final HideAndSeek instance;
    protected final GameTeam LOBBY;
    protected final GameTeam HIDER;
    protected final GameTeam SEEKER;
    protected final GameTeam SPECS;
    protected Map<Player, GameTeam> players = new HashMap<>();

    public TeamHelper(HideAndSeek instance) {
        this.instance = instance;

        this.LOBBY = new LobbyTeam(instance);
        this.HIDER = new HiderTeam(instance);
        this.SEEKER = new SeekerTeam(instance);
        this.SPECS = new SpectatorTeam(instance);
    }


    public void teleportPlayer(Player player) {
    }

    public void removeFromTeam(Player player) {
        if (this.players.containsKey(player)) {
            this.players.get(player).removePlayer(player);
        }
    }

    public void setToSpectator(Player player) {
        this.removeFromTeam(player);
        this.players.put(player, SPECS);
        this.SPECS.addPlayer(player);
    }

    public void setToLobby(Player player) {
        this.removeFromTeam(player);
        this.players.put(player, this.LOBBY);
        this.LOBBY.addPlayer(player);
    }

    public boolean isSeeker(Player player) {
        return this.SEEKER.containsPlayer(player);
    }

    public boolean isHider(Player player) {
        return this.HIDER.containsPlayer(player);
    }

    public boolean isSpectator(Player player) {
        return this.SPECS.containsPlayer(player);
    }

    public GameTeam getTeamOfPlayer(Player player) {
        if (this.players.containsKey(player)) {
            return this.players.get(player);
        }

        return null;
    }

    public void setToHider(Player player) {
        this.removeFromTeam(player);
        this.players.put(player, this.HIDER);
        this.HIDER.addPlayer(player);
    }

    public void setToSeeker(Player player) {
        this.removeFromTeam(player);
        this.players.put(player, this.SEEKER);
        this.SEEKER.addPlayer(player);
    }
}
