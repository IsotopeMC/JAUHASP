package io.github.unstableprogrammers.hideandseek.game;

public enum GameState {
    STARTING(false, false, false, false, false),
    LOBBY(true, false, false, true, true),
    IN_GAME(true, true, true, false, true),
    ENDING(false, false, false, false, false);

    private final Boolean canJoin;
    private final Boolean canHitPlayers;
    private final Boolean joinAsSpectator;
    private final Boolean announceJoins;
    private final Boolean announceQuits;
    private final String joinMessage;

    GameState(Boolean canJoin, Boolean canHitPlayers, Boolean joinAsSpectator, Boolean announceJoins, Boolean announceQuits) {
        this.canJoin = canJoin;
        this.canHitPlayers = canHitPlayers;
        this.joinAsSpectator = joinAsSpectator;
        this.announceJoins = announceJoins;
        this.announceQuits = announceQuits;
        this.joinMessage = "";
    }

    public Boolean canJoin() {
        return this.canJoin;
    }

    public Boolean canHitPlayers() {
        return this.canHitPlayers;
    }

    public Boolean joinAsSpectator() {
        return this.joinAsSpectator;
    }

    public Boolean announceJoins() {
        return this.announceJoins;
    }

    public Boolean announceQuits() {
        return this.announceQuits;
    }

    public String getJoinMessage() {
        return this.joinMessage;
    }
}