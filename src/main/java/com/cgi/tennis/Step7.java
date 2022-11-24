package com.cgi.tennis;

public class Step7 implements TennisGame{
    private String player1;
    private String player2;

    private Players players = new Players();

    public Step7(String player1, String player2) {
        players.addPlayer(new Player(player1));
        this.player1 = player1;

        players.addPlayer(new Player(player2));
        this.player2 = player2;
    }

    public String getScore() {
        if (Score.isOngoing(players.getPlayerByName(player1), players.getPlayerByName(player2)))
            return new OngoingScore(players.getPlayerByName(player1), players.getPlayerByName(player2)).printScore();
        if (Score.isTied(players.getPlayerByName(player1), players.getPlayerByName(player2)))
            return new DeuceScore().printScore();
        if (Score.isAdvantage(players.getPlayerByName(player1), players.getPlayerByName(player2)))
            return new AdvantageScore(players.getPlayerByName(player1), players.getPlayerByName(player2)).printScore();
        return new WinScore(players.getPlayerByName(player1), players.getPlayerByName(player2)).printScore();
    }

    public void wonPoint(String playerName) {
        players.getPlayerByName(playerName).addPoint();
    }
}
