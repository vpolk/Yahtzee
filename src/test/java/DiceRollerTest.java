import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by polkymour on 23/01/2017.
 *
 *
 *   for (int i = 0; i < 10; i++) {
 System.out.println(getRandomNumberInRange(5, 10));
 }
 */


public class DiceRollerTest {

    @Test

    public void rollsTheCorrectNumberOfDice() {

        DiceRoller diceRoller = new DiceRoller();
        List diceValues = diceRoller.rollDice(2);
        int numberOfDice = diceValues.size();

        Assert.assertEquals(2, numberOfDice);
    }
}