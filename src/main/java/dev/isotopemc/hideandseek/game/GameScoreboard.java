package dev.isotopemc.hideandseek.game;


import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.RenderType;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Set;

public abstract class GameScoreboard implements Scoreboard {

    private final Scoreboard board;

    public GameScoreboard() {
        this.board = Objects.requireNonNull(Bukkit.getScoreboardManager()).getNewScoreboard();
    }

    @Override
    public @NotNull Objective registerNewObjective(@NotNull String name, @NotNull String criteria) throws IllegalArgumentException {
        return board.registerNewObjective(name, criteria);
    }

    @Override
    public @NotNull Objective registerNewObjective(@NotNull String name, @NotNull String criteria, @NotNull String displayName) throws IllegalArgumentException {
        return board.registerNewObjective(name, criteria, displayName);
    }

    @Override
    public @NotNull Objective registerNewObjective(@NotNull String name, @NotNull String criteria, @NotNull String displayName, @NotNull RenderType renderType) throws IllegalArgumentException {
        return board.registerNewObjective(name, criteria, displayName, renderType);
    }

    @Override
    public Objective getObjective(@NotNull String name) throws IllegalArgumentException {
        return board.getObjective(name);
    }

    @Override
    public @NotNull Set<Objective> getObjectivesByCriteria(@NotNull String criteria) throws IllegalArgumentException {
        return board.getObjectivesByCriteria(criteria);
    }

    @Override
    public @NotNull Set<Objective> getObjectives() {
        return board.getObjectives();
    }

    @Override
    public Objective getObjective(@NotNull DisplaySlot slot) throws IllegalArgumentException {
        return board.getObjective(slot);
    }

    @Override
    public @NotNull Set<Score> getScores(@NotNull OfflinePlayer player) throws IllegalArgumentException {
        return board.getScores(player);
    }

    @Override
    public @NotNull Set<Score> getScores(@NotNull String entry) throws IllegalArgumentException {
        return board.getScores(entry);
    }

    @Override
    public void resetScores(@NotNull OfflinePlayer player) throws IllegalArgumentException {
        board.resetScores(player);
    }

    @Override
    public void resetScores(@NotNull String entry) throws IllegalArgumentException {
        board.resetScores(entry);
    }

    @Override
    public Team getPlayerTeam(@NotNull OfflinePlayer player) throws IllegalArgumentException {
        return board.getPlayerTeam(player);
    }

    @Override
    public Team getEntryTeam(@NotNull String entry) throws IllegalArgumentException {
        return board.getEntryTeam(entry);
    }

    @Override
    public Team getTeam(@NotNull String teamName) throws IllegalArgumentException {
        return board.getTeam(teamName);
    }

    @Override
    public @NotNull Set<Team> getTeams() {
        return board.getTeams();
    }

    @Override
    public @NotNull Team registerNewTeam(@NotNull String name) throws IllegalArgumentException {
        return board.registerNewTeam(name);
    }

    @Override
    public @NotNull Set<OfflinePlayer> getPlayers() {
        return board.getPlayers();
    }

    @Override
    public @NotNull Set<String> getEntries() {
        return board.getEntries();
    }

    @Override
    public void clearSlot(@NotNull DisplaySlot slot) throws IllegalArgumentException {
        board.clearSlot(slot);
    }
}
