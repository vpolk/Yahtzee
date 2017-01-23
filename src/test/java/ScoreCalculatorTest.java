import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by polkymour on 17/01/2017.
 */
public class ScoreCalculatorTest {

    @Test

    public void canCountMultiples() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1,3,3,3,3));

        int count = scoreCalculator.countMultiples(dice, 3);

        Assert.assertEquals(4, count);
    }

    @Test

    public void canScoreOnes() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1,1,3,1,3));

        int score = scoreCalculator.onesScore(dice);

        Assert.assertEquals(3, score);
    }

    @Test

    public void canScoreTwos() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1,2,3,1,3));

        int score = scoreCalculator.twosScore(dice);

        Assert.assertEquals(2, score);
    }

    @Test

    public void canScoreThrees() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1,1,3,1,3));

        int score = scoreCalculator.threesScore(dice);

        Assert.assertEquals(6, score);
    }

    @Test

    public void canScoreFours() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1, 4, 3, 4, 3));

        int score = scoreCalculator.foursScore(dice);

        Assert.assertEquals(8, score);

    }

    @Test

    public void canScoreFives() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1, 5, 5, 5, 5));

        int score = scoreCalculator.fivesScore(dice);

        Assert.assertEquals(20, score);

    }

    @Test

    public void canScoreSixes() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1, 1, 3, 1, 6));

        int score = scoreCalculator.sixesScore(dice);

        Assert.assertEquals(6, score);

    }

    @Test

    public void returnsThirtyWhenLowShortStraight() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));

        int score = scoreCalculator.shortStraightScore(dice);

        Assert.assertEquals(30, score);

    }

    @Test

    public void returnsThirtyWhenMidShortStraight() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(2,3,4,5,5));

        int score = scoreCalculator.shortStraightScore(dice);

        Assert.assertEquals(30, score);
    }

    @Test

    public void returnsThirtyWhenHighShortStraight() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(3, 3, 4, 5, 6));

        int score = scoreCalculator.shortStraightScore(dice);

        Assert.assertEquals(30, score);
    }

    @Test

    public void returnsZeroWhenNotShortStraight() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(3, 3, 4, 4, 6));

        int score = scoreCalculator.shortStraightScore(dice);

        Assert.assertEquals(0, score);
    }

    @Test

    public void returnsFortyWhenLowLongStraight() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int score = scoreCalculator.longStraightScore(dice);

        Assert.assertEquals(40, score);

    }

    @Test

    public void returnsFortyWhenHighLongStraight() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(2,3,4,5,6));

        int score = scoreCalculator.longStraightScore(dice);

        Assert.assertEquals(40, score);

    }

    @Test

    public void returnsZeroWhenNotLongStraight() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(1,2,6,4,5));

        int score = scoreCalculator.longStraightScore(dice);

        Assert.assertEquals(0, score);

    }

    @Test

    public void returnsSumOfAllDiceIfThreeOfAKind() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,4,1,1,4));

        int score = scoreCalculator.threeOfAKindScore(dice);

        Assert.assertEquals(14, score);
    }

    @Test

    public void returnsZeroIfNotThreeOfAKind() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,1,1,2,4));

        int score = scoreCalculator.threeOfAKindScore(dice);

        Assert.assertEquals(0, score);
    }

    @Test

    public void returnsSumOfAllDiceIfFourOfAKind() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(6,6,6,6,6));

        int score = scoreCalculator.fourOfAKindScore(dice);

        Assert.assertEquals(30, score);
    }

    @Test

    public void returnsZeroIfNotFourOfAKind() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,1,1,2,4));

        int score = scoreCalculator.fourOfAKindScore(dice);

        Assert.assertEquals(0, score);
    }

    @Test

    public void returnsTwentyFiveForFullHouse() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(3,3,6,3,6));

        int score = scoreCalculator.fullHouseScore(dice);

        Assert.assertEquals(25, score);
    }


    @Test

    public void returnsZeroIfNotFullHouse() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,4,1,4,2));

        int score = scoreCalculator.fullHouseScore(dice);

        Assert.assertEquals(0, score);
    }

    @Test

    public void returnsZeroIfNotFullHouse2() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,4,4,4,4));

        int score = scoreCalculator.fullHouseScore(dice);

        Assert.assertEquals(0, score);
    }

    @Test

    public void returnsFiftyForYahtzee() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,4,4,4,4));

        int score = scoreCalculator.yahtzeeScore(dice);

        Assert.assertEquals(50, score);
    }

    @Test

    public void returnsZeroIfNotYahtzee() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,3,4,4,4));

        int score = scoreCalculator.yahtzeeScore(dice);

        Assert.assertEquals(0, score);
    }

    @Test

    public void returnsFiftyForYahtzee2() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,4,4,4,4));

        int score = scoreCalculator.scoreYahtzee(dice);

        Assert.assertEquals(50, score);
    }
    @Test

    public void returnsZeroIfNotYahtzee2() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,3,3,3,3));

        int score = scoreCalculator.scoreYahtzee(dice);

        Assert.assertEquals(0, score);
    }

    @Test

    public void returnsChanceScore() {

        ScoreCalculator scoreCalculator = new ScoreCalculator();
        List dice = new ArrayList<>(Arrays.asList(4,3,4,2,4));

        int score = scoreCalculator.chanceScore(dice);

        Assert.assertEquals(17, score);
    }
}

