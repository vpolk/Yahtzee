import Moves.*;

/**
 * Created by polkymour on 16/01/2017.
 */
public class Player {

    Ones ones = new Ones();
    Twos twos = new Twos();
    Threes threes = new Threes();
    Fours fours = new Fours();
    Fives fives = new Fives();
    Sixes sixes = new Sixes();
    ThreeOfAKind threeOfAKind = new ThreeOfAKind();
    FourOfAKind fourOfAKind = new FourOfAKind();
    ShortStraight shortStraight = new ShortStraight();
    LongStraight longStraight = new LongStraight();
    FullHouse fullHouse = new FullHouse();
    Yahtzee yahtzee = new Yahtzee();
    Chance chance = new Chance();

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
