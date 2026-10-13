public class Ship {

  // Constant instance variables representing the length, position, and direction of the ship

  private final int length;
  private final Position pos;
  private final String direction;

  // Instance variable representing the error message that pops up if the ship can't be placed
  private String error = "";

  // Parameterized constructor that initializes the length, pos, and direction instance variables
  public Ship(int length, Position pos, String direction) {
    this.length = length;
    this.pos = pos;
    this.direction = direction;
  }

  /*
   * Accessor method that returns the length of the ship
   * Postcondition: length is returned
   */
  public int getLength() {
    return length;
  }

  /*
   * Accessor method that returns the position of the starting point of the ship
   * Postcondition: pos is returned
   */
  public Position getPos() {
    return pos;
  }

  /*
   * Accessor method that returns the direction the ship is facing
   * Postcondition: direction is returned
   */
  public String getDirection() {
    return direction;
  }

  /*
   * Accessor method that returns the error message the ship should display, if any
   * Postcondition: error is returned
   */
  public String getError() {
    return error;
  }

  /*
   * Mutator method that changes the error message the ship should display
   * Postcondition: error is reassigned a value
   */
  public void setError(String message) {
    error = message;
  }
}
