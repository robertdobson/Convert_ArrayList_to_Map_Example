import java.io.*;
import java.util.ArrayList;

/**
 * StateFileReader scans contents of a CSV file, creates State objects that are added to an ArrayList,
 * and returns the ArrayList of State objects.
 * @author Robert Dobson
 */
public class StateFileReader {

    /**
     * Read the CSV file.
     * @param path to input file
     * @return stateArrayList an ArrayList of State objects
     */
    public ArrayList<State> readFile(String path) {
        ArrayList<State> stateArrayList = new ArrayList<State>();

        // Read from your file each line, create a new state object, and place it into a Java Array or an ArrayList.
        FileInputStream fileInputReader;

        try {
            fileInputReader = new FileInputStream(path);
            BufferedReader in = new BufferedReader(new InputStreamReader(fileInputReader));
            String fact;
            while ((fact = in.readLine()) != null) {
                String delimiter = ", ";
                String[] tokens = fact.split(delimiter);

                State state = new State(tokens[0], tokens[1], tokens[2], tokens[3]);
                stateArrayList.add(state);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return stateArrayList;
    }
}
