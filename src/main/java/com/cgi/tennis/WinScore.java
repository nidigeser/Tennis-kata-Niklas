package com.cgi.tennis;

public class WinScore extends Score {
    public WinScore(Player player1, Player player2) {
        super(player1, player2);
    }

    String printScore() {
        return player1.getPoints() > player2.getPoints() ? "Win for " + player1.getName() : "Win for " + player2.getName();
    }
}
