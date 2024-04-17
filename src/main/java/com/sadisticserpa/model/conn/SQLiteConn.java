package com.sadisticserpa.model.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.sadisticserpa.model.data.UserGame;

public class SQLiteConn implements Database {

    private Connection conn;

    public SQLiteConn() {
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.home") + "/Documents/sml.db";
            this.conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.createUserGameTable();
        this.createGameModsTable();
    }

    private void executeSQL(String sql) {
        try {
            Statement stmt = this.conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ResultSet executeSQLQuery(String sql) {
        try (Statement stmt = this.conn.createStatement()) {
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void createUserGameTable() {
        String sql = """
                    CREATE TABLE IF NOT EXISTS UserGames (
                        GameID INTEGER PRIMARY KEY,
                        GameName TEXT NOT NULL,
                        GamePath TEXT,
                        IsFav INTEGER
                    )WITHOUT ROWID;
                """;
        this.executeSQL(sql);
    }

    private void createGameModsTable() {
        String sql = """
                CREATE TABLE IF NOT EXISTS GameMods(
                    GameID INTEGER NOT NULL,
                    ModID INTEGER NOT NULL,
                    ModName TEXT NOT NULL,
                    ModURL TEXT
                );
                """;
        this.executeSQL(sql);
    }

    @Override
    public ArrayList<UserGame> getUserGameList() {
        String sql = """
                SELECT GameID, GameName, GamePath, IsFav FROM usergames
                """;
        ArrayList<UserGame> userGameList = new ArrayList<UserGame>();
        ResultSet rs = this.executeSQLQuery(sql);
        try {
            while (rs.next()) {
                userGameList.add(
                        new UserGame(
                                rs.getInt("GameID"),
                                rs.getString("GameName"),
                                rs.getString("GamePath"),
                                (rs.getInt("IsFav") == 1 ? true : false)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userGameList;
    }

    @Override
    public HashMap<Integer, String> getGameMods(String game) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGameMods'");
    }

    @Override
    public boolean setUserGameList(ArrayList<UserGame> userGameList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUserGameList'");
    }

    @Override
    public boolean setGameMods(HashMap<Integer, String> gameMods) {
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
