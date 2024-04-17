package com.sadisticserpa.model.conn;

import java.util.ArrayList;
import java.util.HashMap;

import com.sadisticserpa.model.data.UserGame;

public interface Database {
    public ArrayList<UserGame> getUserGameList();
    public HashMap<Integer, String> getGameMods(String game);
    public boolean setUserGameList(ArrayList<UserGame>  userGameList);
    public boolean setGameMods(HashMap<Integer, String> gameMods);
    public boolean addGame(String game);
    public boolean addGameMod(String game, String mod);
    public boolean deleteGame(String game);
    public boolean deleteGameMod(String game, String mod);
    public boolean editGame(String game);
}
