package com.cgi.tennis;

public abstract class Score {

    int pointsPlayer1;
    int pointsPlayer2;
    String player1;
    String player2;

    public Score(int pointsPlayer1, int pointsPlayer2) {
        this.pointsPlayer1 = pointsPlayer1;
        this.pointsPlayer2 = pointsPlayer2;
    }

    public Score() {}

    public Score(int pointsPlayer1, int pointsPlayer2, String player1, String player2) {
        this.pointsPlayer1 = pointsPlayer1;
        this.pointsPlayer2 = pointsPlayer2;
        this.player1 = player1;
        this.player2 = player2;
    }

    abstract String printScore();
}
