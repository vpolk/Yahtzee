import Moves.Ones;
import org.apache.log4j.Logger;

/**
 * Created by polkymour on 16/01/2017.
 */
public class Controller {

    final Logger logger = Logger.getLogger(Controller.class);


    private Ones ones = new Ones();

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runController();
    }

    protected void runController() {



    }
}
