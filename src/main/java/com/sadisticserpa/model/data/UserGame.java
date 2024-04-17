package com.sadisticserpa.model.data;

public class UserGame {
    private int gameID;
    private String gameName;
    private String gamePath;
    private boolean isFav;

    public UserGame(int gameID, String gameName, String gamePath, boolean isFav) {
        this.gameID = gameID;
        this.gameName = gameName;
        this.gamePath = gamePath;
        this.isFav = isFav;
    }

    public int getGameID() {
        return gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public String getGamePath() {
        return gamePath;
    }

    public void setGamePath(String gamePath) {
        this.gamePath = gamePath;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setFav(boolean isFav) {
        this.isFav = isFav;
    }

    

    
}
