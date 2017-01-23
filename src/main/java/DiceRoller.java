/**
 * Created by polkymour on 23/01/2017.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.log4j.Logger;


public class DiceRoller {

    static Logger logger = Logger.getLogger(Controller.class);
    Random random = new Random();

    public int generateRandomNumber() {

        return random.nextInt(6) + 1;
    }

    public List<Integer> rollDice(int numberOfRemainingDiceRolls) {

        List diceValues = new ArrayList();

        for (; numberOfRemainingDiceRolls > 0; numberOfRemainingDiceRolls--) {
            int diceValue = generateRandomNumber();
            diceValues.add(diceValue);
        }
        logger.info("dice values are" + diceValues);
        return diceValues;
    }
}


