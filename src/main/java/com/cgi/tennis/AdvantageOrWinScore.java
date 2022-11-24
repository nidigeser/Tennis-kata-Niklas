package com.cgi.tennis;

public class AdvantageOrWinScore extends Score {

    public AdvantageOrWinScore(int pointsPlayer1, int pointsPlayer2, String player1, String player2) {
        super(pointsPlayer1, pointsPlayer2, player1, player2);
    }

    String printScore() {
        String playerScored = pointsPlayer1 > pointsPlayer2 ? player1 : player2;
        return ((pointsPlayer1 - pointsPlayer2) * (pointsPlayer1 - pointsPlayer2) == 1) ? "Advantage " + playerScored : "Win for " + playerScored;
    }
}
