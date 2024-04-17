package com.sadisticserpa.model.data;

import java.util.ArrayList;

public class UserGame {
    private int gameID;
    private String gameName;
    private String gamePath;
    private boolean isFav;
    private ArrayList<GameMod> gameMods;

    public UserGame(int gameID, String gameName, String gamePath, boolean isFav) {
        this.gameID = gameID;
        this.gameName = gameName;
        this.gamePath = gamePath;
        this.isFav = isFav;
        this.gameMods = new ArrayList<GameMod>();
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

    public boolean isFav() {
        return isFav;
    }

    public ArrayList<GameMod> getGameMods() {
        return gameMods;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGamePath(String gamePath) {
        this.gamePath = gamePath;
    }

    public void setFav(boolean isFav) {
        this.isFav = isFav;
    }

    public void setGameMods(ArrayList<GameMod> gameMods) {
        this.gameMods = gameMods;
    }

    public void addGameMod(GameMod gm){
        this.gameMods.add(gm);
        for (GameMod gameMod : gameMods) {
            int dependencyCounter = 0;
            for (GameMod dependency : gameMod.getModDependencies()) {
                for (GameMod gameMod2 : gameMods) {
                    if(dependency.equals(gameMod2)){
                        dependencyCounter++;
                    }
                }
            }
            if(gameMod.getModDependencies().size() == dependencyCounter){
                gameMod.setDependencyResolved(true);
            }
        }
    }

    public void removeGameMod(GameMod gm){
        this.gameMods.remove(gm);
    }
}
