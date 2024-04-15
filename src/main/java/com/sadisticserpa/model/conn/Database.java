package com.sadisticserpa.model.conn;

import java.util.ArrayList;

public interface Database {
    public ArrayList<String> getUserGameList();
    public ArrayList<String> getGameMods(String game);
    public boolean setUserGameList(ArrayList<String> userGameList);
    public boolean setGameMods(ArrayList<String> gameMods);
    public boolean addGame(String game);
    public boolean addGameMod(String game, String mod);
    public boolean deleteGame(String game);
    public boolean deleteGameMod(String game, String mod);
    public boolean editGame(String game);
}
