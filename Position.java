public class Position {

  // Instance variables for the row and column coordinates
  private int row;
  private int col;

  // Parameterized constructor that initializes the row and column instance variables
  public Position(int row, int col) {
    this.row = row;
    this.col = col;
  }

  /*
   * Accessor method that returns the row index of the Position object
   * Postcondition: row is returned
   */
  public int getRow() {
    return row;
  }

  /*
   * Accessor method that returns the column index of the Position object
   * Postcondition: col is returned
   */
  public int getCol() {
    return col;
  }
}
