package io.github.unstableprogrammers.hideandseek.helpers;

import io.github.unstableprogrammers.hideandseek.HideAndSeek;
import io.github.unstableprogrammers.hideandseek.game.GameTeam;
import io.github.unstableprogrammers.hideandseek.game.teams.HiderTeam;
import io.github.unstableprogrammers.hideandseek.game.teams.LobbyTeam;
import io.github.unstableprogrammers.hideandseek.game.teams.SeekerTeam;
import io.github.unstableprogrammers.hideandseek.game.teams.SpectatorTeam;
import org.bukkit.entity.Player;

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
        if (players.containsKey(player)) {
            players.get(player).removePlayer(player);
        }
    }

    public void setToSpectator(Player player) {
        this.removeFromTeam(player);
        this.players.put(player, SPECS);
        SPECS.addPlayer(player);
    }

    public void setToLobby(Player player) {
        this.removeFromTeam(player);
        this.players.put(player, LOBBY);
        LOBBY.addPlayer(player);
    }

    public boolean isSeeker(Player player) {
        return SEEKER.containsPlayer(player);
    }

    public boolean isHider(Player player) {
        return HIDER.containsPlayer(player);
    }

    public boolean isSpectator(Player player) {
        return SPECS.containsPlayer(player);
    }

    public GameTeam getTeamOfPlayer(Player player) {
        if (players.containsKey(player)) {
            return players.get(player);
        }

        return null;
    }

    public void setToHider(Player player) {
        this.removeFromTeam(player);
        this.players.put(player, HIDER);
        HIDER.addPlayer(player);
    }

    public void setToSeeker(Player player) {
        this.removeFromTeam(player);
        this.players.put(player, SEEKER);
        SEEKER.addPlayer(player);
    }
}
