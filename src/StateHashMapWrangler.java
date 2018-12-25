import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * The StateHashMapWrangler class contains code for converting an ArrayList of objects into a HashMap.
 * @author Robert Dobson
 */
public class StateHashMapWrangler {

    /**
     * The HashMapWrangler() method writes State objects as key/value pairs to a HashMap.
     * @param listOfStates an ArrayList of objects of type State
     * @return convertToMap which is a Map
     */
    public Map<String, State> HashMapWrangler(ArrayList<State> listOfStates) {

        Map<String, State> convertToMap = new HashMap<String, State>();

        int i = 0;
        for (State state : listOfStates) {

            // Write all the state objects into a HashMap where the state
            // name is the key and the value is the object of that state.
            convertToMap.put(listOfStates.get(i).getStateName(), state);
            i++;
        }

        return convertToMap;
    }
}
