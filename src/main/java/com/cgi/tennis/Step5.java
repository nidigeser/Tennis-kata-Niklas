/***********************************************************************
 *  5. Don´t abbreviate: AdantageOrWinScore --> AdvantageScore, WinScore
 **********************************************************************/

package com.cgi.tennis;

public class Step5 implements TennisGame{

    private Player player1;
    private Player player2;

    public Step5(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }

    public String getScore() {
        if (player1.getPoints() < 4 && player2.getPoints() < 4 && !(player1.getPoints() + player2.getPoints() == 6))
            return new OngoingScore(player1, player2).printScore();
        if (player1.getPoints() == player2.getPoints())
            return new DeuceScore().printScore();
        if (((player1.getPoints() - player2.getPoints()) * (player1.getPoints() - player2.getPoints()) != 1))
            return new WinScore(player1, player2).printScore();
        return new AdvantageScore(player1, player2).printScore();
    }

    public void wonPoint(String playerName) {
        if (playerName == player1.getName()) {
            player1.addPoint();
            return;
        }
        player2.addPoint();
    }
}
