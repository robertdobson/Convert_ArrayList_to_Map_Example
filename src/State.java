import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * The State class is a blueprint for objects with attributes representing facts about the state.
 * @author Robert Dobson
 */
public class State implements Serializable {

    private String stateName;
    private String stateAbbreviation;
    private String stateCapital;
    private String statePopulation;

    State(String name, String abbreviation, String capital, String population) {

        this.stateName = name;
        this.stateAbbreviation = abbreviation;
        this.stateCapital = capital;
        this.statePopulation = population;
    }

    /**
     * The printState() method formats the data in the population field of the State object to include commas,
     * and outputs a list of the State object's attributes.
     */
    public void printState() {

        // For extra credit, print population as a number formatted to include commas.
        int convert = Integer.parseInt(this.statePopulation);
        DecimalFormat format = new DecimalFormat("#,###");
        String formattedNumber = format.format(convert);

        System.out.println("State: " + this.stateName);
        System.out.println("Abbreviation: " + this.stateAbbreviation);
        System.out.println("Capital: " + this.stateCapital);
        System.out.println("2010 Census Population: " + formattedNumber + "\n\n");
    }

    /**
     * Accessor method returns name attribute of the State object
     * @return stateName
     */
    public String getStateName() {
        return stateName;
    }
}
