import java.util.Scanner;

/**
 * Created by polkymour on 16/01/2017.
 */
public class InputReader   {

    Scanner userInput = new Scanner(System.in);

    public Player readAPlayer() {

        String name;
        System.out.print("Enter player name:");
        name = userInput.nextLine();

        if (name.equals("")) {
            return null;

        } else {

            Player player = new Player();
            return (player);
        }
    }
}
