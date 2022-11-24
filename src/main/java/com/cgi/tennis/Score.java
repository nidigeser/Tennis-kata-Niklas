package com.cgi.tennis;

public abstract class Score {

    Player player1;
    Player player2;

    public Score(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Score() {}

    abstract String printScore();
    public static boolean isOngoing(Player player1, Player player2) {
        return (player1.getPoints() < 4 && player2.getPoints() < 4 && !(player1.getPoints() + player2.getPoints() == 6));
    }
    public static boolean isTied(Player player1, Player player2) {
        return player1.getPoints() == player2.getPoints();
    }
    public static boolean isAdvantage(Player player1, Player player2) {
        return ((player1.getPoints() - player2.getPoints()) * (player1.getPoints() - player2.getPoints()) == 1);
    }
}
