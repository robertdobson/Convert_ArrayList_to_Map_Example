project folder:
Convert_ArrayList_to_Map_Example/

PROJECT SUMMARY:
The Convert_ArrayList_to_Map_Example project reads information from a text file, creates objects of type State with
the file information, adds the State objects to an ArrayList, prints the information of each State object to the
console, and writes all the State objects into a Map where the state name is the key and the value is the object of
that state with the state's associated information. The application then prompts the user to enter the name of a state
and prints the state's corresponding information retrieved from the Map to the console.

Brief description of submitted files:

src/State.java
    - The State class is a blueprint for objects with attributes representing facts about the state.

src/StateFileReader.java
    - StateFileReader scans contents of a CSV file, creates State objects that are added to an ArrayList,
      and returns the ArrayList of State objects.

src/StateHashMapWrangler.java
    - The StateHashMapWrangler class contains code for converting an ArrayList of objects into a HashMap.

src/StateObjectHandler.java
    - The StateObjectHandler class contains the main() method, and demonstrates the State class,
      StateFileReader class, and StateHashMapWrangler class.

resources/States.txt
    - This is a text file containing a list of the 50 US states, their abbreviations, their capitals,
      and their 2010 Census count.

README.txt
    - description of submitted files