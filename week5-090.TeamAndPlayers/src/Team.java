/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielsepejr.
 */
import java.util.ArrayList;

public class Team {
    private String teamName;    
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private int teamSize = 16;
    
    public Team(String name) {
        this.teamName = name;
    }
    
    public String getName() {
        return this.teamName;
    }
    
    public void addPlayer(Player player) {
        if (playerList.size() < this.teamSize) {
            this.playerList.add(player);
        }
    }
    
    public void printPlayers() {
        System.out.println("Team: " + this.teamName);
        System.out.println("");
        for (Player player : this.playerList) {
            System.out.println( player );
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.teamSize = maxSize;
    }
    
    public int size() {
        return this.playerList.size();
    }
    
    // Checks to see if players are actually added to playList
//    public void printList() {
//        System.out.println(this.playerList);
//    }
    
    public int goals() {
        int totalGoals = 0;
        for ( Player player : playerList ) {
            player.goals();
            totalGoals += player.goals();
        }
        return totalGoals;
    }
    
}
