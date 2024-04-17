package com.sadisticserpa.model.data;

import java.util.ArrayList;

public class GameMod {
    private int modID;
    private String modName;
    private String modURL;
    private ArrayList<GameMod> modDependencies;
    private boolean dependencyResolved;

    public GameMod(int modID, String modName, String modURL) {
        this.modID = modID;
        this.modName = modName;
        this.modURL = modURL;
        this.modDependencies = new ArrayList<GameMod>();
        this.dependencyResolved = false;
    }

    public int getModID() {
        return modID;
    }

    public String getModName() {
        return modName;
    }

    public String getModURL() {
        return modURL;
    }

    public ArrayList<GameMod> getModDependencies() {
        return modDependencies;
    }

    public boolean isDependencyResolved() {
        return dependencyResolved;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public void setModURL(String modURL) {
        this.modURL = modURL;
    }

    public void setModDependencies(ArrayList<GameMod> modDependencies) {
        this.modDependencies = modDependencies;
    }

    public void setDependencyResolved(boolean dependencyResolved) {
        this.dependencyResolved = dependencyResolved;
    }

    public void addDependency(GameMod gm){
        this.modDependencies.add(gm);
    }

    public void removeDependency(GameMod gm){
        this.modDependencies.remove(gm);
    }

    
}
