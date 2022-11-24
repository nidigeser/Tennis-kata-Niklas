package com.cgi.tennis;

public class OngoingScore extends Score {

    public OngoingScore(Player player1, Player player2) {
        super(player1, player2);
    }

    String printScore() {
        String[] points = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        return (player1.getPoints() == player2.getPoints()) ? points[player1.getPoints()] + "-All" : points[player1.getPoints()] + "-" + points[player2.getPoints()];
    }
}
