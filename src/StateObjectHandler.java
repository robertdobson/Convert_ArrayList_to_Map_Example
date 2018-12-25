import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * The StateObjectHandler class contains the main() method, and demonstrates the State class,
 * StateFileReader class, and StateHashMapWrangler class.
 * @author Robert Dobson
 */
public class StateObjectHandler {

    private ArrayList<State> factsOfStates;

    /**
     * Constructor for an object of class StateObjectHandler.
     * Reads in a file and adds the facts into a list of the facts about the states
     * @param filePath	The input file to parse.
     */
    public StateObjectHandler (String filePath)
    {
        StateFileReader reader = new StateFileReader();

        factsOfStates = reader.readFile(filePath);

        // Check the size of the resulting ArrayList object.
        if (factsOfStates.size() < 1)
        {
            System.out.println("WARNING: The list of state facts is empty.");
            return;
        }

        System.out.printf("\n *** The ArrayList of type State contains %d State objects. ***\n\n", factsOfStates.size());

    }


    /**
     * Accessor method returns the list of items read from input file.
     * @return	the facts of the states.
     */
    public ArrayList<State> getFactsOfStates()
    {
        return factsOfStates;
    }

    /**
     * Reads an input file that contains the facts of the different states, stores the facts in objects
     * of class State and outputs the attributes of the objects. Then calls on the StateHashMapWrangler class
     * to assign the State objects to a HashMap with key/value pairs, returns the Map, queries user to enter
     * name of desired state, and calls printState() to display value of user's key entry.
     * @param args	Not used.
     */
    public static void main(String[] args) {

        final String FILEPATH = "resources/States.txt";

        StateObjectHandler list = new StateObjectHandler(FILEPATH);
        ArrayList<State> listOfStates = list.getFactsOfStates();

        // Use an enhanced for loop to call a printState method on the object that
        // cleanly prints the information of each state.
        for (State state : listOfStates) {
            state.printState();
        }
        System.err.flush();
        System.out.println("Done with StateObjectHandler.\n");

        System.out.println("*** Beginning convert ArrayList to Map ***\n");

        StateHashMapWrangler wrangler = new StateHashMapWrangler();

        Map<String, State> map = wrangler.HashMapWrangler(listOfStates);

        // Ask the user for a state to input.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the name of desired state: ");

        String input = keyboard.nextLine();
        System.out.println();

        // Use user input as a lookup (using get) to get the state's information. Use your previously
        // defined print function to print the information of the state the user inputted.
        map.get(input).printState();
    }
}
