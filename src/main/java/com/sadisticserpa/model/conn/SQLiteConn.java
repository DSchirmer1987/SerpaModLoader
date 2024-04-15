package com.sadisticserpa.model.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLiteConn implements Database{

    private Connection conn;

    public SQLiteConn(){
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.home") + "/Documents/sml.db";
            this.conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<String> getUserGameList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserGameList'");
    }

    @Override
    public ArrayList<String> getGameMods(String game) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGameMods'");
    }

    @Override
    public boolean setUserGameList(ArrayList<String> userGameList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUserGameList'");
    }

    @Override
    public boolean setGameMods(ArrayList<String> gameMods) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGameMods'");
    }

    @Override
    public boolean addGame(String game) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addGame'");
    }

    @Override
    public boolean addGameMod(String game, String mod) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addGameMod'");
    }

    @Override
    public boolean deleteGame(String game) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteGame'");
    }

    @Override
    public boolean deleteGameMod(String game, String mod) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteGameMod'");
    }

    @Override
    public boolean editGame(String game) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editGame'");
    }

}
