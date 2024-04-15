package com.sadisticserpa;

import com.sadisticserpa.model.conn.SQLiteConn;
import com.sadisticserpa.view.MainWindow;

public class App {
    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        SQLiteConn cl = new SQLiteConn();
    }
}
