package com.kodilla.rps;

public class RoundSelection {
    private UserSelection playerOne;
    private UserSelection playerTwo;

    public RoundSelection(UserSelection playerOne, UserSelection playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public UserSelection getPlayerOne() {
        return playerOne;
    }

    public UserSelection getPlayerTwo() {
        return playerTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoundSelection that = (RoundSelection) o;

        if (playerOne != that.playerOne) return false;
        return playerTwo == that.playerTwo;
    }

    @Override
    public int hashCode() {
        int result = playerOne != null ? playerOne.hashCode() : 0;
        result = 31 * result + (playerTwo != null ? playerTwo.hashCode() : 0);
        return result;
    }
}
