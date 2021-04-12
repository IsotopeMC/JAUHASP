package me.gamewithjerry.hideandseek.game;

import me.gamewithjerry.hideandseek.HideAndSeek;

public class GameState {

    //0 = Server startet
    //1 = Lobby
    //2 = Im Spiel
    //3 = Beendet
    public Integer currentGamestate = 0;
    public Boolean canJoin = false;
    public Boolean canHitPlayers = false;
    public Boolean joinAsSpectator = false;
    public Boolean announceJoinAndQuits = false;
    public String joinMessage = "";
    protected HideAndSeek instance;

    public GameState(HideAndSeek instance) {
        this.instance = instance;
    }

    public void setToLobbyState() {
        this.currentGamestate = 1;

        this.canJoin = true;
        this.canHitPlayers = false;

        this.joinAsSpectator = false;
        this.announceJoinAndQuits = true;

        StringBuilder joinMessage = new StringBuilder();
        joinMessage.append(instance.PREFIX)
                .append("Willkommen zu Hide and Seek!");

        this.joinMessage = joinMessage.toString();
    }
}
