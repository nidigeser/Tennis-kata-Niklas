package com.cgi.tennis;

public class OngoingScore extends Score {

    public OngoingScore(int pointsPlayer1, int pointsPlayer2) {
        super(pointsPlayer1, pointsPlayer2);
    }

    String printScore() {
        String[] points = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        return (pointsPlayer1 == pointsPlayer2) ? points[pointsPlayer1] + "-All" : points[pointsPlayer1] + "-" + points[pointsPlayer2];
    }
}
