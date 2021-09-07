package io.github.unstableprogrammers.hideandseek.game;


import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.RenderType;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.Objects;
import java.util.Set;

public abstract class GameScoreboard implements Scoreboard {

    private Scoreboard board;

    public GameScoreboard() {
        this.board = Objects.requireNonNull(Bukkit.getScoreboardManager()).getNewScoreboard();
    }

    @Override
    public Objective registerNewObjective(String name, String criteria) throws IllegalArgumentException {
        return board.registerNewObjective(name, criteria);
    }

    @Override
    public Objective registerNewObjective(String name, String criteria, String displayName) throws IllegalArgumentException {
        return board.registerNewObjective(name, criteria, displayName);
    }

    @Override
    public Objective registerNewObjective(String name, String criteria, String displayName, RenderType renderType) throws IllegalArgumentException {
        return board.registerNewObjective(name, criteria, displayName, renderType);
    }

    @Override
    public Objective getObjective(String name) throws IllegalArgumentException {
        return board.getObjective(name);
    }

    @Override
    public Set<Objective> getObjectivesByCriteria(String criteria) throws IllegalArgumentException {
        return board.getObjectivesByCriteria(criteria);
    }

    @Override
    public Set<Objective> getObjectives() {
        return board.getObjectives();
    }

    @Override
    public Objective getObjective(DisplaySlot slot) throws IllegalArgumentException {
        return board.getObjective(slot);
    }

    @Override
    public Set<Score> getScores(OfflinePlayer player) throws IllegalArgumentException {
        return board.getScores(player);
    }

    @Override
    public Set<Score> getScores(String entry) throws IllegalArgumentException {
        return board.getScores(entry);
    }

    @Override
    public void resetScores(OfflinePlayer player) throws IllegalArgumentException {
        board.resetScores(player);
    }

    @Override
    public void resetScores(String entry) throws IllegalArgumentException {
        board.resetScores(entry);
    }

    @Override
    public Team getPlayerTeam(OfflinePlayer player) throws IllegalArgumentException {
        return board.getPlayerTeam(player);
    }

    @Override
    public Team getEntryTeam(String entry) throws IllegalArgumentException {
        return board.getEntryTeam(entry);
    }

    @Override
    public Team getTeam(String teamName) throws IllegalArgumentException {
        return board.getTeam(teamName);
    }

    @Override
    public Set<Team> getTeams() {
        return board.getTeams();
    }

    @Override
    public Team registerNewTeam(String name) throws IllegalArgumentException {
        return board.registerNewTeam(name);
    }

    @Override
    public Set<OfflinePlayer> getPlayers() {
        return board.getPlayers();
    }

    @Override
    public Set<String> getEntries() {
        return board.getEntries();
    }

    @Override
    public void clearSlot(DisplaySlot slot) throws IllegalArgumentException {
        board.clearSlot(slot);
    }
}
