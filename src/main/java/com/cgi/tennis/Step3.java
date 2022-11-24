/********************************************************
 *  3. Polymorphism
 ********************************************************/

package com.cgi.tennis;

public class Step3 implements TennisGame {
    private int pointsPlayer1;
    private int pointsPlayer2;
    private String player1;
    private String player2;

    public Step3(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        if (pointsPlayer1 < 4 && pointsPlayer2 < 4 && !(pointsPlayer1 + pointsPlayer2 == 6))
            return new OngoingScore(pointsPlayer1, pointsPlayer2).printScore();
        if (pointsPlayer1 == pointsPlayer2)
            return new DeuceScore().printScore();
        return new AdvantageOrWinScore(pointsPlayer1, pointsPlayer2, player1, player2).printScore();
    }

    public void wonPoint(String playerName) {
        if (playerName == this.player1) {
            this.pointsPlayer1 += 1;
            return;
        }
        this.pointsPlayer2 += 1;
    }
}
