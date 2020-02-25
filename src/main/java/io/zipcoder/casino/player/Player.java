package io.zipcoder.casino.player;

public class Player {

    int id;
    String name;
    int playerFunds;
    boolean isDrunk;

    public Player(int id, String name, int playerFunds, boolean isDrunk) {
        this.id = id;
        this.name = name;
        this.playerFunds = playerFunds;
        this.isDrunk = isDrunk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerFunds() {
        return playerFunds;
    }

    public void setPlayerFunds(int playerFunds) {
        this.playerFunds = playerFunds;
    }

    public boolean isDrunk() {
        return isDrunk;
    }

    public void setDrunk(boolean drunk) {
        isDrunk = drunk;
    }
}
