/******************
 *  6. No getter
 ******************/

package com.cgi.tennis;

public class Step6 implements TennisGame{
    private Player player1;
    private Player player2;

    public Step6(String player1, String player2) {
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
    }

    public String getScore() {
        if (Score.isOngoing(player1, player2))
            return new OngoingScore(player1, player2).printScore();
        if (Score.isTied(player1, player2))
            return new DeuceScore().printScore();
        if (Score.isAdvantage(player1, player2))
            return new AdvantageScore(player1, player2).printScore();
        return new WinScore(player1, player2).printScore();
    }

    public void wonPoint(String playerName) {
        if (playerName == player1.getName()) {
            player1.addPoint();
            return;
        }
        player2.addPoint();
    }
}
