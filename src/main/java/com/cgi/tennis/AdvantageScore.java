package com.cgi.tennis;

public class AdvantageScore extends Score {
    public AdvantageScore(Player player1, Player player2) {
        super(player1, player2);
    }

    String printScore() {
        return player1.getPoints() > player2.getPoints() ? "Advantage " + player1.getName() : "Advantage " + player2.getName();
    }
}
