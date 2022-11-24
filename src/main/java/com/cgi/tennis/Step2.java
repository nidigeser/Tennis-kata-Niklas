/********************************************************
 *  2. Early Return
 ********************************************************/

package com.cgi.tennis;

public class Step2 implements TennisGame {
    private int pointsPlayer1;
    private int pointsPlayer2;
    private String player1;
    private String player2;

    public Step2(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        if (pointsPlayer1 < 4 && pointsPlayer2 < 4 && !(pointsPlayer1 + pointsPlayer2 == 6))
            return determineOngoingScore();
        if (pointsPlayer1 == pointsPlayer2)
            return determineDeuceScore();
        return determineAdvantageOrWin();
    }

    private String determineOngoingScore() {
        String[] points = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        return (pointsPlayer1 == pointsPlayer2) ? points[pointsPlayer1] + "-All" : points[pointsPlayer1] + "-" + points[pointsPlayer2];
    }

    private String determineDeuceScore() {
        return "Deuce";
    }

    private String determineAdvantageOrWin() {
        String playerScored = pointsPlayer1 > pointsPlayer2 ? player1 : player2;
        return ((pointsPlayer1 - pointsPlayer2) * (pointsPlayer1 - pointsPlayer2) == 1) ? "Advantage " + playerScored : "Win for " + playerScored;
    }

    public void wonPoint(String playerName) {
        if (playerName == this.player1) {
            this.pointsPlayer1 += 1;
            return;
        }
        this.pointsPlayer2 += 1;
    }
}