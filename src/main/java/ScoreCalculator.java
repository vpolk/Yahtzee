import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by polkymour on 16/01/2017.
 */
public class ScoreCalculator {

    private boolean containsValue(List<Integer> dice, int target) {
        for (int candidate : dice) {
            if (candidate == target) {
                return true;
            }
        }
        return false;
    }

    public int countMultiples(List<Integer> dice, int target) {
        int count = 0;
        for (int candidate : dice) {
            if (candidate == target) {
                count = count + 1;
            }
        }

        return count;
    }

    public int sumAllDice(List<Integer> dice) {
        int sum = 0;
        for (int diceValue : dice) {
            sum += diceValue;
        }
        return sum;
    }

    public int onesScore(List<Integer> dice) {
        int sum = 0;
        {
            for (int target : dice) {
                if (target == 1) {
                    sum += target;
                }
            }
            return sum;
        }
    }

    public int twosScore(List<Integer> dice) {
        int sum = 0;
        {
            for (int target : dice) {
                if (target == 2) {
                    sum += target;
                }
            }
            return sum;
        }
    }

    public int threesScore(List<Integer> dice) {
        int sum = 0;
        {
            for (int target : dice) {
                if (target == 3) {
                    sum += target;
                }
            }
            return sum;
        }
    }

    public int foursScore(List<Integer> dice) {
        int sum = 0;
        {
            for (int target : dice) {
                if (target == 4) {
                    sum += target;
                }
            }
            return sum;
        }
    }

    public int fivesScore(List<Integer> dice) {
        int sum = 0;
        {
            for (int target : dice) {
                if (target == 5) {
                    sum += target;
                }
            }
            return sum;
        }
    }

    public int sixesScore(List<Integer> dice) {
        int sum = 0;
        {
            for (int target : dice) {
                if (target == 6) {
                    sum += target;
                }
            }
            return sum;
        }
    }

    public int shortStraightScore(List<Integer> dice) {
        if (containsValue(dice, 3)
                && containsValue(dice, 4)
                && ((containsValue(dice, 1) && containsValue(dice, 2))
                || (containsValue(dice, 5) && containsValue(dice, 6))
                || (containsValue(dice, 2) && containsValue(dice, 5)))) {
            return 30;
        } else {
            return 0;
        }
    }


    public int longStraightScore(List<Integer>dice) {
        if (containsValue(dice, 2)
                && containsValue(dice, 3)
                && containsValue(dice, 4)
                && containsValue(dice, 5)
                && (containsValue(dice, 1) || containsValue(dice, 6))) {
            return 40;
        } else {
            return 0;
        }
    }

    public int threeOfAKindScore(List<Integer> dice) {
        for (int diceValue : dice) {
            if (countMultiples(dice, diceValue) >= 3) {
                return sumAllDice(dice);
            }
        }
        return 0;
    }

    public int fourOfAKindScore(List<Integer> dice) {
        for (int diceValue : dice) {
            if (countMultiples(dice, diceValue) >= 4) {
                return sumAllDice(dice);
            }
        }
        return 0;
    }



    public int fullHouseScore(List<Integer> dice) {
        int tripleFaceValue = 0;
        for (int diceValue : dice) {
            if (countMultiples(dice, diceValue) == 3) {
                tripleFaceValue = diceValue;
            }
        }
        if (tripleFaceValue == 0) {
            return 0;
        }
        for (int diceValue : dice) {
            if (tripleFaceValue == diceValue){
                continue;
            }
            if (countMultiples(dice, diceValue) == 2) {
                return 25;
            }
        }
        return 0;
    }


    public int yahtzeeScore(List<Integer> dice) {
                for (int diceValue : dice) {
                    if (countMultiples(dice, diceValue) <= 4) {
                        return 0;
                    }
                }
        return 50;
    }

    public int scoreYahtzee(List<Integer> dice) {
        if (dice.get(0) != dice.get(1)){
            return 0;
        }
        if (dice.get(0) != dice.get(2)){
            return 0;
        }
        if (dice.get(0) != dice.get(3)){
            return 0;
        }
        if (dice.get(0) != dice.get(4)){
            return 0;
        }
        else return 50;
    }

    public int chanceScore(List<Integer> dice) {
        int score = sumAllDice(dice);
        return score;
    }
}







