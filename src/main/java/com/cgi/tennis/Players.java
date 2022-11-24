package com.cgi.tennis;

import java.util.HashMap;
import java.util.Map;

public class Players {

    private Map<String, Player> players = new HashMap<String, Player>();


    public void addPlayer(Player player) {
        players.put(player.getName(), player);
    }

    public Player getPlayerByName(String name) {
        return players.get(name);
    }
}
