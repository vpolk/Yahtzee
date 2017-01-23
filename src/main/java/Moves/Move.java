package Moves;

/**
 * Created by polkymour on 16/01/2017.
 */
public abstract class Move {

    private int score;

    public int getScore() {
        return score;
    }

    public abstract int calculateScore(int[] dice);

}
