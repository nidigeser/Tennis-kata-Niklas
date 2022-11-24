package com.cgi.tennis;

public class AdvantageOrWinScore extends Score {

    public AdvantageOrWinScore(Player player1, Player player2) {
        super(player1, player2);
    }

    String printScore() {
        String playerScored = player1.getPoints() > player2.getPoints() ? player1.getName() : player2.getName();
        return ((player1.getPoints() - player2.getPoints()) * (player1.getPoints() - player2.getPoints()) == 1) ? "Advantage " + playerScored : "Win for " + playerScored;
    }
}
