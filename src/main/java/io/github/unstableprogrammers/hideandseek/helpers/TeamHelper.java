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

    protected Map<Player, GameTeam> players = new HashMap<>();

    protected final GameTeam LOBBY = new LobbyTeam();
    protected final GameTeam HIDER = new HiderTeam();
    protected final GameTeam SEEKER = new SeekerTeam();
    protected final GameTeam SPECS = new SpectatorTeam();

    public TeamHelper(HideAndSeek instance) {
        this.instance = instance;
    }


    public void teleportPlayer(Player player) {
    }

    public void removeFromTeam(Player player) {
        if(players.containsKey(player)) {
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

    public boolean isSeeker(Player damager) {
        return SEEKER.containsPlayer(damager);
    }

    public GameTeam getTeamOfPlayer(Player player) {
        return players.get(player);
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
